package kr.go.mofa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.mofa.dto.UsersDTO;
import kr.go.mofa.model.UsersDAO;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersDAO usersDao;
	
	@Override
	public List<UsersDTO> usersList() throws Exception {
		return usersDao.usersList();
	}

	@Override
	public UsersDTO usersDetail(String id) throws Exception {
		return usersDao.usersDetail(id);
	}

	@Override
	public void usersAdd(UsersDTO dto) throws Exception {
		usersDao.usersAdd(dto);
	}

	@Override
	public UsersDTO login(String id) throws Exception {
		return usersDao.login(id);
	}

	@Override
	public void usersUpd(UsersDTO dto) throws Exception {
		usersDao.usersUpd(dto);
	}

	@Override
	public void usersDel(String id) throws Exception {
		usersDao.usersDel(id);
	}
}
