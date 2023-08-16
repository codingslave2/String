package Coffee.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/coffee.xml");

		
		System.out.println(context.getBean("coffee1"));
		System.out.println(context.getBean("coffee2"));
		System.out.println(context.getBean("coffee3"));
		
		
		context.close();
		
	}

}
