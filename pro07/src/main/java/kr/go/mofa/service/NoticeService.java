package kr.go.mofa.service;

import java.util.List;

import kr.go.mofa.dto.NoticeDTO;

public interface NoticeService {
	public List<NoticeDTO> noticeList() throws Exception;
	public NoticeDTO noticeOne(int no) throws Exception;
	public void updateHits(int no) throws Exception;
	public void noticeAdd(NoticeDTO notice) throws Exception;
}
