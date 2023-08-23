package aaa.model;

import org.springframework.stereotype.Controller;

import lombok.Data;

@Controller
@Data
public class Camera {
	
	String name = "전방카메라";
	int pixel = 2000;
	
}
