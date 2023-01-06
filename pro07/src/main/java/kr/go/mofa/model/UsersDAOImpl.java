package kr.go.mofa.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.go.mofa.dto.UsersDTO;

@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<UsersDTO> usersList() throws Exception {
		return sqlSession.selectList("users.usersList");
	}
	
	@Override
	public UsersDTO usersDetail(String id) throws Exception {
		return sqlSession.selectOne("users.usersOne", id);
	}

	@Override
	public void usersAdd(UsersDTO dto) throws Exception {
		sqlSession.insert("users.addUsers", dto);
	}

	@Override
	public UsersDTO login(String id) throws Exception {
		return sqlSession.selectOne("users.login", id);
	}
}
