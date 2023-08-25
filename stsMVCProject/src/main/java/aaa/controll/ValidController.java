package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.JoinData;
import aaa.service.JoinCheck;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/form")
public class ValidController {

	@Resource
	JoinCheck joinChk;
	
	
	@GetMapping("validation")
	String validForm(JoinData jd) {
		return "form/validForm";
	}
	
	
	@PostMapping("validation")
	String validReg(@Valid JoinData jd, BindingResult br) {
		
		System.out.println("validReg : "+br.hasErrors());
		
		if(br.hasErrors()) {//에러가 있다면
			return "form/validForm";
		}
		if(joinChk.pwDupChk(jd, br)) {
			return "form/validForm";
		}
			
		
		
		//에러가 없으면
		return "form/validReg";
	}
}
