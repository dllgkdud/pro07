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

import kr.go.mofa.dto.QnaDTO;
import kr.go.mofa.service.QnaService;

@Controller
@RequestMapping("/qna/")
public class QnaController {
	
	@Autowired
	QnaService qnaService;
	
	@GetMapping("list")
	public String qnaList(Model model) throws Exception {
		List<QnaDTO> qna = qnaService.qnaList();
		model.addAttribute("qna", qna);
		return "qna/list";
	}
	
	@GetMapping("one")
	@Transactional
	public String qnaOne(@RequestParam("no") int no, Model model) throws Exception {
		qnaService.updateHits(no);
		QnaDTO dto = qnaService.qnaOne(no);
		model.addAttribute("dto", dto);
		return "qna/one";
	}
	
	@GetMapping("add")
	public String qnaAdd() throws Exception { 
		return "qna/add";
	}
	 
	@PostMapping("add.do")
	public String qna(@ModelAttribute("qna") QnaDTO qna) throws Exception {
		qnaService.addQna(qna);
		return "redirect:/qna/list"; 
	}

	@GetMapping("ans")
	public String qnaAns() throws Exception { 
		return "qna/ans";
	}
	
	@PostMapping("ans.do")
	public String ans(@ModelAttribute("qna") QnaDTO qna) throws Exception {
		qnaService.ansQna(qna);
		return "redirect:/qna/list";
	}
	
	@GetMapping("upd")
	public String qna(@RequestParam("no") int no, Model model) throws Exception { 
		QnaDTO dto = qnaService.qnaOne(no);
		model.addAttribute("dto", dto);
		return "qna/update"; 
	}

	@PostMapping("upd.do")
	public String updQna(@ModelAttribute("qna") QnaDTO qna) throws Exception {
		qnaService.updQna(qna);
		return "redirect:/qna/list"; 
	}

	@GetMapping("del.do")
	public String qnaDel(@RequestParam("grp") int grp) throws Exception { 
		qnaService.delQna(grp);
		return "redirect:/qna/list";
	}
}
