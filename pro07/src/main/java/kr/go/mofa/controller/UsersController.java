package kr.go.mofa.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.go.mofa.dto.UsersDTO;
import kr.go.mofa.service.UsersService;

@Controller
@RequestMapping("/users/")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	HttpSession session;
	
	@GetMapping("list")
	public String usersList(Model model) throws Exception {
		List<UsersDTO> user = usersService.usersList();
		model.addAttribute("user", user);
		return "users/list";
	}
	
	@GetMapping("agree")
	public String agree() throws Exception {
		return "users/agree";
	}
	
	@GetMapping("add")
	public String users() throws Exception {
		return "users/add";
	}
	
	@PostMapping("add.do")
	public String usersAdd(UsersDTO dto, Model model) throws Exception {
		BCryptPasswordEncoder pwdEncoder = new BCryptPasswordEncoder();
		String pw = dto.getPw();
		String pwd = pwdEncoder.encode(pw);
		dto.setPw(pwd);
		usersService.usersAdd(dto);
		System.out.println(dto);
		return "redirect:/";
	}
	
	@PostMapping("check")
	public void addId(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		String id = request.getParameter("id");
		boolean result = false;
		UsersDTO dto = new UsersDTO();
		dto = usersService.usersDetail(id);
		
		if(dto!=null) {
			result = false;
		} else {
			result = true;
		}
		
		JSONObject json = new JSONObject();
		json.put("result", result);
		PrintWriter out = response.getWriter();
		out.println(json.toString());
	}
	
	@GetMapping("login")
	public String login() throws Exception {
		return "users/login";
	}
	
	@PostMapping("login.do")
	public String usersLogin(@RequestParam("id") String id, @RequestParam("pw") String pw) throws Exception {
		BCryptPasswordEncoder pwdEncoder = new BCryptPasswordEncoder();
		UsersDTO users = new UsersDTO();
		users.setId(id);
		users.setPw(pw);
		UsersDTO login = usersService.login(users);
		boolean success = pwdEncoder.matches(users.getPw(), login.getPw());
		if(success && login!=null) { 
			session.setAttribute("users", login);
			session.setAttribute("sid", id);
			return "redirect:/";
		} else { 
			return "redirect:login"; 
		} 
	}
	
	@PostMapping("logout")
	public String usersLogout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:/";
	}
}
