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
	
	public List<SampleDTO> list() throws Exception {
		return sqlSession.selectList("sample.sampleList");
	}

	public SampleDTO one(String id) throws Exception {
		return sqlSession.selectOne("sample.sampleOne", id);
	}

	public void add(SampleDTO sample) throws Exception {
		sqlSession.insert("sample.addSample", sample);
	}

	public void upd(SampleDTO sample) throws Exception {
		sqlSession.update("sample.updSample", sample);
	}
	
	public void del(String id) throws Exception {
		sqlSession.delete("sample.delSample", id);
	}
}
