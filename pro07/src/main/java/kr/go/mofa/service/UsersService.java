package kr.go.mofa.service;

import java.util.List;

import kr.go.mofa.dto.UsersDTO;

public interface UsersService {
	public List<UsersDTO> usersList() throws Exception;
	public UsersDTO usersDetail(String id) throws Exception;
	public void usersAdd(UsersDTO dto) throws Exception;
	public UsersDTO login(String id) throws Exception;
	public void usersUpd(UsersDTO dto) throws Exception;
	public void usersDel(String id) throws Exception;
}
