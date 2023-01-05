package kr.go.mofa.model;

import java.util.List;

import kr.go.mofa.dto.UsersDTO;

public interface UsersDAO {
	public List<UsersDTO> usersList() throws Exception;
	public UsersDTO usersDetail(String id) throws Exception;
	public void usersAdd(UsersDTO dto) throws Exception;
	public UsersDTO login(UsersDTO user) throws Exception;
}