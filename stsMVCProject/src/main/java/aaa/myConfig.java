package aaa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aaa.model.Battery;

@Configuration
public class myConfig {
	
	@Bean
	Battery bat1() {
		return new Battery("에너자이저", 500);
		
	}
	
	@Bean
	Battery bat2() {
		return new Battery("사랑의밧데리", 300);
	}
	
}
