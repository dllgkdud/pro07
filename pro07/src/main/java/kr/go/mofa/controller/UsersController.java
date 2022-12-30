package kr.go.mofa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.go.mofa.dto.UsersDTO;
import kr.go.mofa.service.UsersService;

@Controller
@RequestMapping("/user/")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	HttpSession session;
	BCryptPasswordEncoder pwdEncoder;
	
	@GetMapping("list")
	public String usersList(Model model) throws Exception {
		List<UsersDTO> user = usersService.usersList();
		model.addAttribute("user", user);
		return "users/list";
	}
	
	@GetMapping("add")
	public String users() throws Exception {
		return "users/add";
	}
	
	@PostMapping("add.do")
	public String usersAdd(UsersDTO dto, Model model) throws Exception {
		String pw = dto.getPw(); 
		String pwd = pwdEncoder.encode(pw);
		dto.setPw(pwd); 
		usersService.usersAdd(dto);
		return "redirect:/";
	}
	
	@GetMapping("login")
	public String login() throws Exception {
		return "users/login";
	}
	
	@PostMapping("login.do")
	public String usersLogin(HttpServletRequest request, UsersDTO user) throws Exception {
		boolean success = usersService.login(request);
		if(success) {
			return "home";
		} else {
			return "redirect:login";
		}
	}
}