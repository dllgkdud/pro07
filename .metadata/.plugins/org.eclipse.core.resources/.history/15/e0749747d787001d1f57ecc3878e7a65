package kr.go.mofa.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.go.mofa.dto.NoticeDTO;

@Repository
public class NoticeDAOImpl implements NoticeDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<NoticeDTO> noticeList() throws Exception {
		return sqlSession.selectList("notice.noticeList");
	}

	@Override
	public NoticeDTO noticeOne(int no) throws Exception {
		return sqlSession.selectOne("notice.noticeOne", no);
	}

	@Override
	public void updateHits(int no) throws Exception {
		sqlSession.update("notice.updateHits", no);
	}

	@Override
	public void noticeAdd(NoticeDTO notice) throws Exception {
		sqlSession.insert("notice.addNotice", notice);
	}
}
