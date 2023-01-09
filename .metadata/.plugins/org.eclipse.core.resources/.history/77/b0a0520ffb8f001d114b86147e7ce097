package kr.go.mofa.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.go.mofa.dto.QnaDTO;

@Repository
public class QnaDAOImpl implements QnaDAO {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<QnaDTO> qnaList() throws Exception {
		return sqlSession.selectList("qna.qnaList");
	}

	@Override
	public QnaDTO qnaOne(int no) throws Exception {
		return sqlSession.selectOne("qna.qnaOne", no);
	}

	@Override
	public void updateHits(int no) throws Exception {
		sqlSession.update("qna.updateHits", no);
	}

	@Override
	public void addQna(QnaDTO qna) throws Exception {
		sqlSession.insert("qna.addQna", qna);
	}

	@Override
	public void updQna(QnaDTO qna) throws Exception {
		sqlSession.update("qna.updQna",qna);
	}

	@Override
	public void delQna(int grp) throws Exception {
		sqlSession.delete("qna.delQna", grp);
	}
}
