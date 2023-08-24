package aaa.model;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class SeasonMain {

	HashMap<String, String[]>data;
	
	public SeasonMain() {
		data = new HashMap<>();
		
		data.put("spring","pepe1.webp, pepe5.webp".split(","));
		data.put("summer","pepe2.jpg, pepe6.webp".split(","));
		data.put("autumn","pepe3.webp, pepe7.webp".split(","));
		data.put("winter","winter.jpg".split(","));
	}
	
	public String [] getPicture(String title) {
		return data.get(title);
	}
	
	
	
}
