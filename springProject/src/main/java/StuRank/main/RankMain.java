package StuRank.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RankMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/sturank.xml");
		
		System.out.println(context.getBean("red1"));
		System.out.println(context.getBean("red2"));
		System.out.println(context.getBean("red3"));

	}

}
