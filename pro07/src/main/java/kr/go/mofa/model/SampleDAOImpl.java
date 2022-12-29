package kr.go.mofa.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.go.mofa.dto.SampleDTO;

@Repository
public class SampleDAOImpl implements SampleDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<SampleDTO> sample() throws Exception {
		return sqlSession.selectList("sample.sampleList");
	}

	@Override
	public SampleDTO sampleOne(String id) throws Exception {
		return sqlSession.selectOne("sample.sampleOne", id);
	}
}
