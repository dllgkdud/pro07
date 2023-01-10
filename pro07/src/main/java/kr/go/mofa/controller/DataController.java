package kr.go.mofa.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
@RequestMapping("/data/")
public class DataController {
	private static final Logger log = LoggerFactory.getLogger(DataController.class);
	
	@GetMapping("/up0")
	public String up0() {
		return "data/up0";
	}
	
	@PostMapping("/up0")
	public String up0(HttpServletRequest request, HttpServletResponse response) {
		String uploadPath="D:\\lhy\\pro07\\pro07\\src\\main\\webapp\\resources\\upload\\data";
		int maxFileSize = 1024 * 1024 * 10;
		String encType = "utf-8";
		
		MultipartRequest multi = null;
		
		try {
			multi = new MultipartRequest(request, uploadPath, maxFileSize, encType, new DefaultFileRenamePolicy());
			System.out.println(multi.getOriginalFileName("upload"));
			System.out.println(multi.getFilesystemName("upload"));
		} catch(IOException e) {
			System.out.println("[에러] " + e.getMessage());
		}
		return "redirect:/";
	}
}
