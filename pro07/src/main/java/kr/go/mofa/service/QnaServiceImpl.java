package kr.go.mofa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.mofa.dto.QnaDTO;
import kr.go.mofa.model.QnaDAO;

@Service
public class QnaServiceImpl implements QnaService {

	@Autowired
	QnaDAO qnaDao;
	
	@Override
	public List<QnaDTO> qnaList() throws Exception {
		return qnaDao.qnaList();
	}

	@Override
	public QnaDTO qnaOne(int no) throws Exception {
		return qnaDao.qnaOne(no);
	}

	@Override
	public void updateHits(int no) throws Exception {
		qnaDao.updateHits(no);
	}

	@Override
	public void addQna(QnaDTO qna) throws Exception {
		qnaDao.addQna(qna);
	}

	@Override
	public void ansQna(QnaDTO qna) throws Exception {
		qnaDao.ansQna(qna);
	}

	@Override
	public void updQna(QnaDTO qna) throws Exception {
		qnaDao.updQna(qna);
	}

	@Override
	public void delQna(int grp) throws Exception {
		qnaDao.delQna(grp);
	}
}
