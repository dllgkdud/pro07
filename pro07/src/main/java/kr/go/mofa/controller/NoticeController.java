package kr.go.mofa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.go.mofa.dto.NoticeDTO;
import kr.go.mofa.service.NoticeService;

@Controller
@RequestMapping("/notice/")
public class NoticeController {
	
	@Autowired
	NoticeService noticeService;
	
	@GetMapping("list")
	public String noticeList(Model model) throws Exception {
		List<NoticeDTO> notice = noticeService.noticeList();
		model.addAttribute("notice", notice);
		return "notice/list";
	}
	
	@GetMapping("one")
	@Transactional
	public String noticeOne(@RequestParam("no") int no, Model model) throws Exception {
		noticeService.updateHits(no);
		NoticeDTO dto = noticeService.noticeOne(no);
		model.addAttribute("dto", dto);
		return "notice/one";
	}
	
	@GetMapping("add.do")
	public String noticeAdd() throws Exception {
		return "notice/add";
	}
	
	@PostMapping("add.do")
	public String notice(HttpServletRequest request, Model model) throws Exception {
		NoticeDTO notice = new NoticeDTO();
		notice.setTitle(request.getParameter("title"));
		notice.setContent(request.getParameter("content"));
		notice.setDept(request.getParameter("dept"));
		noticeService.addNotice(notice);
		System.out.println(notice);
		return "redirect:/notice/list";
	}
	
	@GetMapping("upd.do")
	@Transactional
	public String notice(@RequestParam("no") int no, Model model) throws Exception {
		NoticeDTO dto = noticeService.noticeOne(no);
		model.addAttribute("dto", dto);
		return "notice/update";
	}
	
	@PostMapping("upd.do")
	public String noticeUpd(HttpServletRequest request, Model model) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		NoticeDTO notice = new NoticeDTO();
		notice.setNo(no);
		notice.setTitle(request.getParameter("title"));
		notice.setContent(request.getParameter("content"));
		noticeService.updNotice(notice);
		return "redirect:/notice/list";
	}
	
	@GetMapping("del.do")
	public String noticeDel(HttpServletRequest request) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		noticeService.delNotice(no);
		return "redirect:/notice/list";
	}
}
