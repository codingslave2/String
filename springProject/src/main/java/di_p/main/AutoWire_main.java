package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWire_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/autowire.xml", "di_xml/autowireparts.xml");
		// xml 파일을 여러 개로 쪼개서 불러오기 가능

		System.out.println("car1 : " + context.getBean("car1"));
		System.out.println("car2 : " + context.getBean("car2"));
		System.out.println("car3 : " + context.getBean("car3"));
		System.out.println("car4 : " + context.getBean("car4"));
	}

}
