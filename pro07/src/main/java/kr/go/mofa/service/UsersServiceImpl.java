package kr.go.mofa.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.go.mofa.dto.UsersDTO;
import kr.go.mofa.model.UsersDAO;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersDAO usersDao;
	BCryptPasswordEncoder pwdEncoder;
	
	@Override
	public List<UsersDTO> usersList() throws Exception {
		return usersDao.usersList();
	}

	@Override
	public void usersAdd(UsersDTO dto) throws Exception {
		usersDao.usersAdd(dto);
	}

	@Override
	public boolean login(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		boolean success = false;
		UsersDTO user = new UsersDTO();
		user.setId(request.getParameter("id"));
		user.setPw(request.getParameter("pw"));
		
		UsersDTO login = usersDao.login(user);
		success = pwdEncoder.matches(user.getPw(), login.getPw());
		if(login!=null && success==true) {
			session.setAttribute("user", login);
			session.setAttribute("sid", login.getId());
			session.setAttribute("sname", login.getName());
			success = true;
		}
		return success;
	}
}
