package kr.go.mofa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.mofa.dto.NoticeDTO;
import kr.go.mofa.model.NoticeDAO;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeDAO noticeDao;
	
	@Override
	public List<NoticeDTO> noticeList() throws Exception {
		return noticeDao.noticeList();
	}

	@Override
	public NoticeDTO noticeOne(int no) throws Exception {
		return noticeDao.noticeOne(no);
	}

	@Override
	public void updateHits(int no) throws Exception {
		noticeDao.updateHits(no);
	}

	@Override
	public void addNotice(NoticeDTO notice) throws Exception {
		noticeDao.noticeAdd(notice);
	}

	@Override
	public void updNotice(NoticeDTO notice) throws Exception {
		noticeDao.noticeUpd(notice);
	}

	@Override
	public void delNotice(int no) throws Exception {
		noticeDao.noticeDel(no);
	}
}
