package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.MemData;

@Controller
@RequestMapping("/form")
public class FormController {

	@GetMapping("form")
	String form(MemData md) {
		return "form/form";
	}
	
	@GetMapping("link")
	String link() {
		return "form/link";
	}
	
	@GetMapping("{cate}")
	@ResponseBody
	String link2(@PathVariable String cate) {
		return "cate:" + cate + "<br/>";
	}
	
	
}
