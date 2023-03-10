package kr.go.mofa.service;

import java.util.List;

import kr.go.mofa.dto.QnaDTO;

public interface QnaService {
	public List<QnaDTO> qnaList() throws Exception;
	public QnaDTO qnaOne(int no) throws Exception;
	public void updateHits(int no) throws Exception;
	public void addQna(QnaDTO qna) throws Exception;
	public void ansQna(QnaDTO qna) throws Exception;
	public void updQna(QnaDTO qna) throws Exception;
	public void delQna(int grp) throws Exception;
}
