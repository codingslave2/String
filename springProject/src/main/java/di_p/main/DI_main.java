package di_p.main;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Camera;
import di_p.HandPhone;

public class DI_main {

    public static void main(String[] args) {

        HandPhone hp1 = new HandPhone();
        Camera cam1 = new Camera("3", 20000);

//        cam1.setName("1");
//        cam1.setPixel(100000);

        hp1.setName("2");
        hp1.setCam(cam1);

        System.out.println(hp1);
        System.out.println("----------------------------------------");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/first.xml");
        
        
        System.out.println("--------------------------------------------");
        HandPhone hp2 = (HandPhone) context.getBean("hp2");
        System.out.println(hp2);
    }

}
