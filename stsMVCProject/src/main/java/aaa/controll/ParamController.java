package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("request")
public class ParamController {
	
	@RequestMapping("param1")
	String param1(HttpServletRequest request) {
		String str = "param1" + request.getParameter("id");
		str += "," + request.getParameter("age");
		str += "," + request.getParameter("marriage");
		System.out.println(str);
		return "req/param";
	}
	
	@RequestMapping("param2")
	String param2(String id, int age, boolean marriage) {
		// param이 없을 경우, 에러 발생
		System.out.println("param2: " + id + ", " + age + "," + marriage);
		return "req/param";
	}
	
	@RequestMapping("param3")
	String param3(
			@RequestParam("id")String pid, 
			@RequestParam("aaa")int age, 
			@RequestParam("mrg")boolean marriage) {
		System.out.println("param3:"+pid+ ","+ age+ "," +marriage);
		return "req/param";
	}
	
	@RequestMapping("param4")
	String param4(
			@RequestParam(value = "id", defaultValue = "qwer")String pid, 
			@RequestParam(value = "aaa", defaultValue = "19")int age, 
			@RequestParam(value = "mrg", defaultValue = "false")boolean marriage) {
		System.out.println("param4:"+pid+ ","+ age+ "," +marriage);
		return "req/param";
	}
	
}
