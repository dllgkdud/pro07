package kr.go.mofa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@GetMapping("add")
	public String noticeAdd() throws Exception {
		return "notice/add";
	}
	
	@PostMapping("add.do")
	public String notice(@ModelAttribute("notice") NoticeDTO notice, Model model) throws Exception {
		//notice.setDept("dept");
		noticeService.noticeAdd(notice);
		return "redirect:/notice/list";
	}
}
