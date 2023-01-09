package kr.go.mofa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/")
public class PageController {
	
	/*
	 * @Autowired PageService pageService;
	 */
	
	@GetMapping("intro.do")
	public String intro() throws Exception {
		return "page/intro";
	}
	
	@GetMapping("policy.do")
	public String policy() throws Exception {
		return "page/policy";
	}
	
	@GetMapping("map.do")
	public String map() throws Exception {
		return "page/map";
	}
	
	/*@GetMapping("list")
	public String pageList(Model model) throws Exception {
		List<PageDTO> page = pageService.pageList();
		model.addAttribute("page", page);
		return "page/list";
	}
	
	@GetMapping("one")
	@Transactional
	public String pageOne(@RequestParam("no") int no, Model model) throws Exception {
		pageService.updateHits(no);
		PageDTO dto = pageService.pageOne(no);
		model.addAttribute("dto", dto);
		return "page/one";
	}
	
	@GetMapping("add.do")
	public String pageAdd() throws Exception {
		return "page/add";
	}
	
	@PostMapping("add.do")
	public String page(HttpServletRequest request, Model model) throws Exception {
		PageDTO page = new PageDTO();
		page.setTitle(request.getParameter("title"));
		page.setContent(request.getParameter("content"));
		page.setDept(request.getParameter("dept"));
		pageService.addpage(page);
		System.out.println(page);
		return "redirect:/page/list";
	}
	
	@GetMapping("upd.do")
	@Transactional
	public String page(@RequestParam("no") int no, Model model) throws Exception {
		pageDTO dto = pageService.pageOne(no);
		model.addAttribute("dto", dto);
		return "page/update";
	}
	
	@PostMapping("upd.do")
	public String boardUpd(HttpServletRequest request, Model model) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		PageDTO page = new PageDTO();
		page.setNo(no);
		page.setTitle(request.getParameter("title"));
		page.setContent(request.getParameter("content"));
		pageService.updpage(page);
		return "redirect:/page/list";
	}
	
	@GetMapping("del.do")
	public String pageDel(HttpServletRequest request) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		pageService.delpage(no);
		return "redirect:/page/list";
	}*/
}
