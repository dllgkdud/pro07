package kr.go.mofa.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
@RequestMapping("/data/")
public class DataController {
	//private static final Logger log = LoggerFactory.getLogger(DataController.class);
	
	@GetMapping("/up0")
	public String up0() {
		return "data/up0";
	}
	
	@PostMapping("/up0")
	public String up0(HttpServletRequest request) {
		String uploadPath="D:/lhy/pro07/pro07/src/main/webapp/resources/upload/data";
		int maxFileSize = 1024 * 1024 * 10;
		String encType = "utf-8";
		
		MultipartRequest multi = null;
		
		try {
			multi = new MultipartRequest(request, uploadPath, maxFileSize, encType, new DefaultFileRenamePolicy());
			//System.out.println(multi.getOriginalFileName("upload"));
			//System.out.println(multi.getFilesystemName("upload"));
			
		} catch(IOException e) {
			e.printStackTrace();
			//System.out.println("[에러] " + e.getMessage());
		}
		return "redirect:/";
	}
	
	@GetMapping("/up1")
	public String up1() {
		return "data/up1";
	}
	
	// 이미지 업로드 처리 - org.springframework.web.multipart.MultipartHttpServletRequest를 이용하는 경우
	@PostMapping("/up1")
	public String upload1(MultipartHttpServletRequest multipartRequest) throws ServletException, IOException {
		List<MultipartFile> fileList = multipartRequest.getFiles("file");
		String uploadPath = "D:/lhy/pro07/pro07/src/main/webapp/resources/upload/data";
	    //log.info("파일 개수 :"+fileList.size());
	    
		for (MultipartFile multipartFile : fileList) {
			if (multipartFile.isEmpty()) {
				continue;
			}
			String uploadFilename = multipartFile.getOriginalFilename();	
			//log.info("업로드 파일 경로 및 이름 : "+uploadFilename);
			multipartFile.transferTo(new File(uploadPath, uploadFilename));	
		} // for
		return "redirect:/";
	}
}
