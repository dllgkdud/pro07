package kr.go.mofa.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.go.mofa.dto.UsersDTO;

public interface UsersService {
	public List<UsersDTO> usersList() throws Exception;

	public void usersAdd(UsersDTO dto) throws Exception;
	public boolean login(HttpServletRequest request) throws Exception;
}
