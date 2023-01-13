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

import kr.go.mofa.dto.SampleDTO;
import kr.go.mofa.service.SampleService;

@Controller
@RequestMapping("/sample/")
public class SampleController {

	@Autowired
	SampleService sampleService;
	
	@GetMapping("test")
	public String sampleList(Model model) throws Exception {
		List<SampleDTO> sample = sampleService.sample();
		model.addAttribute("sample", sample);
		return "sample/test";
	}
	
	@GetMapping("one")
	public String sampleOne(@RequestParam("id") String id, Model model) throws Exception {
		SampleDTO dto = sampleService.sampleOne(id);
		model.addAttribute("dto", dto);
		return "sample/one";
	}
	
	@GetMapping("add")
	public String sampleAdd() throws Exception {
		return "sample/add";
	}
	
	@PostMapping("add")
	public String sample(@ModelAttribute("sample") SampleDTO sample, Model model) throws Exception {
		sampleService.addSample(sample);
		return "redirect:/sample/list";
	}
	
	@GetMapping("upd")
	@Transactional
	public String sample(@RequestParam("id") String id, Model model) throws Exception {
		SampleDTO sample = sampleService.sampleOne(id);
		model.addAttribute("sample", sample);
		return "sample/upd";
	}
	
	@PostMapping("upd")
	public String sampleUpd(@ModelAttribute("sample") SampleDTO sample, Model model) throws Exception {
		sampleService.updSample(sample);
		return "redirect:/sample/list";
	}
	
	@GetMapping("del")
	public String sampleDel(@RequestParam("id") String id) throws Exception {
		sampleService.delSample(id);
		return "redirect:/sample/list";
	}
}
