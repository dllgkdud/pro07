package kr.go.mofa;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.go.mofa.dto.SampleDTO;

@Repository
public class RestDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List<SampleDTO> list() {
		return sqlSession.selectList("sample.sampleList");
	}

	public SampleDTO one(String id) {
		return sqlSession.selectOne("sample.sampleOne", id);
	}

}
