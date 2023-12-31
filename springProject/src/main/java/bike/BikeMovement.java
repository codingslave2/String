package bike;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bike.Bike;

public interface BikeMovement {
	
	public static void main(String[] args) {		

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/bike.xml");
		
		Bike bike1 = (Bike) context.getBean("bk1");
		Bike bike2 = (Bike) context.getBean("bk2");
		Bike bike3 = (Bike) context.getBean("bk3");
		
		Backet backet1 = (Backet) context.getBean("bc1");
		Backet backet2 = (Backet) context.getBean("bc1");
		Backet backet3 = (Backet) context.getBean("bc1");
		
		bike1.move();
		bike1.repair();
		bike1.stop();
		
		bike2.move();
		bike2.repair();
		bike2.stop();
		
		bike3.move();
		bike3.repair();
		bike3.stop();

		context.close();
		
		Bike bk1 = new Bike();
		bk1.setName("세발자전거");
		bk1.setWheel(3);
		bk1.setHandle("핸들이없겠냐");
		bk1.setBacket(0);
		System.out.println(bk1);
		
		Bike bk2 = new Bike();
		bk2.setName("MTB");
		bk2.setWheel(2);
		bk2.setHandle("핸들이없겠냐");
		bk2.setBacket(0);
		System.out.println(bk2);
		
		Bike bk3 = new Bike();
		bk3.setName("CF");		
		bk3.setWheel(2);
		bk3.setHandle("핸들이없겠냐");
		bk3.setBacket(1);
		System.out.println(bk3);

		
		
		
	}
	
}

