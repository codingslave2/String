package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Required_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/require.xml");

		
		System.out.println(context.getBean("wm1"));
		// System.out.println(context.getBean("mm1"));
		
		context.close();
		
				
	}

}
