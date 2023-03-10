package kr.go.mofa.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.go.mofa.dto.UsersDTO;
import kr.go.mofa.service.UsersService;

@Controller
@RequestMapping("/users/")
public class UsersController {
	//private static final Logger log = LoggerFactory.getLogger(UsersController.class);
	
	@Autowired UsersService usersService;
	@Inject BCryptPasswordEncoder bcryptPasswordEncoder;
	@Autowired HttpSession session;
	
	@GetMapping("list")
	public String usersList(Model model) throws Exception {
		List<UsersDTO> user = usersService.usersList();
		model.addAttribute("user", user);
		return "users/list";
	}
	
	@GetMapping("one")
	public String usersOne(@RequestParam("id") String id, Model model) throws Exception {
		UsersDTO dto = usersService.usersDetail(id);
		model.addAttribute("dto", dto);
		return "users/one";
	}
	
	@GetMapping("info")
	public String usersInfo(Model model) throws Exception {
		String sid = (String) session.getAttribute("sid");
		UsersDTO dto = usersService.usersDetail(sid);
		model.addAttribute("dto", dto);
		return "users/one";
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
		String pw = dto.getPw();
		String pwd = bcryptPasswordEncoder.encode(pw);
		dto.setPw(pwd);
		usersService.usersAdd(dto);
		System.out.println(dto);
		return "redirect:/";
	}
	
	@GetMapping("upd")
	public String qna(@RequestParam("id") String id, Model model) throws Exception { 
		UsersDTO dto = usersService.usersDetail(id);
		model.addAttribute("dto", dto);
		return "users/update"; 
	}
	
	@PostMapping("upd.do")
	public String usersUpd(UsersDTO dto, Model model) throws Exception {
		String pw = dto.getPw();
		String pwd = bcryptPasswordEncoder.encode(pw);
		dto.setPw(pwd);
		usersService.usersUpd(dto);
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
	public String usersLogin(@ModelAttribute("dto") UsersDTO dto, Model model) throws Exception {
		UsersDTO login = usersService.login(dto.getId());
		String pw = bcryptPasswordEncoder.encode(dto.getPw());
		//log.info("????????? ?????? : "+login.getPw());
		//log.info("???????????? ?????? : "+pw);
		boolean ok = bcryptPasswordEncoder.matches(dto.getPw(), login.getPw());
		if(login!=null && ok) { 
			session.setAttribute("users", login);
			session.setAttribute("sid", dto.getId());
			return "redirect:/";
		} else {
			return "redirect:login";
		}
	}
	
	@RequestMapping("logout")
	public String usersLogout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("del.do")
	public String usersDel(@RequestParam("id") String id, Model model) throws Exception {
		usersService.usersDel(id);
		return "redirect:/list";
	}
}
