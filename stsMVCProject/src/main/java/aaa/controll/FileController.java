package aaa.controll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.UploadData;
import aaa.model.UploadFile;

@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping(value="upload" ,method = RequestMethod.GET)
	String fileForm() {
		return "file/uploadForm";
	}
	
	@RequestMapping(value="upload" ,method = RequestMethod.POST)
	String fileReg(
			Model mm,
			@ModelAttribute("id")String id, 
			@ModelAttribute("age")int age,
			MultipartFile ff1,
			MultipartFile ff2) {
		
		System.out.println("ff1:"+ff1);
		System.out.println("ff2:"+ff2);
		System.out.println("OriginalFilename():"+ff1.getOriginalFilename());
		System.out.println("getName():"+ff1.getName());
		System.out.println("getContentType():"+ff1.getContentType());
		System.out.println("getSize():"+ff1.getSize());
		System.out.println("isEmpty():"+ff1.isEmpty());
		
		mm.addAttribute("ff1", ff1.getOriginalFilename());
		return "file/uploadReg";
	}
	
	
	@RequestMapping(value="upload2")
	String fileReg2(
			Model mm,
			MultipartHttpServletRequest mr) {
		
		MultipartFile ff1 = mr.getFile("ff1");
		MultipartFile ff2 = mr.getFile("ff2");
		System.out.println("ff1:"+ff1);
		System.out.println("ff2:"+ff2);
		System.out.println("OriginalFilename():"+ff1.getOriginalFilename());
		System.out.println("getName():"+ff1.getName());
		System.out.println("getContentType():"+ff1.getContentType());
		System.out.println("getSize():"+ff1.getSize());
		System.out.println("isEmpty():"+ff1.isEmpty());
		
		mm.addAttribute("id", mr.getParameter("id"));
		mm.addAttribute("age", mr.getParameter("age"));
		mm.addAttribute("ff1", ff1.getOriginalFilename());
		return "file/uploadReg";
	}
	
	
	
	
	
	@RequestMapping(value="upload3")
	String fileReg3(UploadData ud) {
		
		
		System.out.println("ud:"+ud);
		
		System.out.println("OriginalFilename():"+ud.getFf1().getOriginalFilename());
		System.out.println("getName():"+ud.getFf1().getName());
		System.out.println("getContentType():"+ud.getFf1().getContentType());
		System.out.println("getSize():"+ud.getFf1().getSize());
		System.out.println("isEmpty():"+ud.getFf1().isEmpty());
		
		fileSave(ud.getFf1());
		
		return "file/uploadReg3";
	}
	
	
	// 파일로 저장/ 존재 유무/ 중복 처리/ 이미지 파일만 저장
	void fileSave(MultipartFile mf) {
		String path = "C:\\Coding\\springworks\\stsMVCProject\\src\\main\\webapp\\views\\up";
		
		File ff = new File(path+"\\"+mf.getOriginalFilename());

	

//			if (!ff.exists()) {
//				ff.mkdirs();
//			} else if (ff.exists()) {
//				ff.delete();
//			} else if (ff.isDirectory()) {
//				ff.delete();
//			} else if (ff.isFile()) {
//				ff.delete();
//			}

		
		
//		try {
//			FileOutputStream fos = new FileOutputStream(ff);
//			
//			fos.write(mf.getBytes());
//			
//			fos.close();
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
		
	}
	
	@GetMapping("/upload")
	public String uploadForm() {
		return "uploadForm"; // 업로드 폼 페이지로 이동
		
	}
	
	@PostMapping("/upload")
	public ModelAndView uploadFile(@RequestParam("file") MultipartFile file) {
		UploadFile uploadfile = new UploadFile();
		
        try {
            uploadfile.saveFile(file); // 파일 저장 기능 호출
        } catch (IOException e) {
            e.printStackTrace();
            // 처리 중 예외 발생 시 예외 처리 로직 추가
        }
        
        ModelAndView mav = new ModelAndView("upload-success");
        mav.addObject("filename", file.getOriginalFilename());
        return mav; // 업로드 성공 페이지로 이동
		
	}
	
}
