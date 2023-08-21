package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("request")
public class CoffeeController {
	
	@RequestMapping("coffee1")
	String coffee1(HttpServletRequest request) {
		String str = "coffee1" + request.getParameter("cname");
		str += "," + request.getParameter("cname");
		str += "," + request.getParameter("price");
		System.out.println("req/coffee");
		return "req/coffeeForm";
	
	}
	
	@RequestMapping("coffee2")
	String coffee2(
			@RequestParam("name")String cname,
			@RequestParam("pri")int price,
			@RequestParam("quant")int quantity) {
		System.out.println("coffee2" + cname + ", " + price + ", " + quantity);
		return "req/coffee";
	}
	


}
	
