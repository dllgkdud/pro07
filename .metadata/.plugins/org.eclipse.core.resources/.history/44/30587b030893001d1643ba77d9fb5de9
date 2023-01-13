package kr.go.mofa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
