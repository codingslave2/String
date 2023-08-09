package Student.StudentMain;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Student.Student;


public class StudentMain {

    public static void main(String[] args) {
        
    	AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/Student.xml");
    	   	
		Student st1 = context.getBean("st1",Student.class); //클래스네임,클래스명칭,
		System.out.println(st1 + "총점: " + st1.getTotal() + " 평균: " + st1.getAvg());
		Student st2 = context.getBean("st2",Student.class); //클래스네임,클래스명칭,
		System.out.println(st2 + "총점: " + st2.getTotal() + " 평균: " + st2.getAvg());
		Student st3 = context.getBean("st3",Student.class); //클래스네임,클래스명칭,
		System.out.println(st3 + "총점: " + st3.getTotal() + " 평균: " + st3.getAvg());
		Student st4 = context.getBean("st4",Student.class); //클래스네임,클래스명칭,
		System.out.println(st4 + "총점: " + st4.getTotal() + " 평균: " + st4.getAvg());
		Student st5 = context.getBean("st5",Student.class); //클래스네임,클래스명칭,
		System.out.println(st5 + "총점: " + st5.getTotal() + " 평균: " + st5.getAvg());

		

		context.close();
		

    }

}