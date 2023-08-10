package Phone.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HandPhoneMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/handphone.xml");
		
		System.out.println("phone1 : " + context.getBean("phone1"));
		System.out.println("phone2 : " + context.getBean("phone2"));

	}

}
