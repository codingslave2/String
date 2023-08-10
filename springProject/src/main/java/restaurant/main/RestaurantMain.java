package restaurant.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import restaurant.Restaurant;

public class RestaurantMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/rest.xml");
		Restaurant res = (Restaurant) context.getBean("restaurant", Restaurant.class);
		System.out.println("Order: " + res.("Chicken", 100));

	}

}
