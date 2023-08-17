package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScoreMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/score.xml");
		
		System.out.println("aop_p.Score/Score");
		
	}

}
