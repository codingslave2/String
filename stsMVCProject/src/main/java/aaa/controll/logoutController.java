package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class logoutController {
	
	@GetMapping("/logout")
	public String logoutPage() {
		
		
		
		return "logout";
		
	}
	
}
