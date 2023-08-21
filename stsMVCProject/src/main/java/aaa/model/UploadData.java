package aaa.model;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lombok.Data;

@Data
public class UploadData {
	
	String id;
	int age;
	MultipartFile ff1, ff2;
	
	public String getFf1Name() {		
		
		
		return ff1.getOriginalFilename();
	}
	

	
}
