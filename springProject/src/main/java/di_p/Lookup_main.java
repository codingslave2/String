package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cfshop.CoffeeShop;

public class Lookup_main {

	public static void main(String[] args) {
			
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/lookup.xml");

		CoffeeShop co = context.getBean("coffee", CoffeeShop.class);
		System.out.println("주문: " + co.order());

		//System.out.println("order_void : " + cs.order_void());void는 return 불가
		
		//리턴형이 다른 메소드는 lookup-method 불가
		System.out.println("order_tea : " + co.order_tea());
		
		//System.out.println("order_private : " + cs.order_private()); private 접근불가
		//private, final, static ==> lookup-method 적용되지 않고 클래스에 정의된 메소드가 호출
		System.out.println("order_private2 : " + co.order_private2());
		
		//private, final, static ==> lookup-method 적용되지 않고 클래스에 정의된 메소드가 호출
		System.out.println("order_final : " + co.order_final());
		
		//private, final, static ==> lookup-method 적용되지 않고 클래스에 정의된 메소드가 호출
		System.out.println("order_static : " + co.order_static());
		
		System.out.println("order_piano : " + co.order_piano());
		
		//추상메소드를 lookup-method로 재정의하여 실행가능
		System.out.println("order_piano : " + co.order_hunter());
		
		//추상메소드를 재정의하지 않고 실행시 에러발생
		//System.out.println("order_piano : " + cs.order_latte());
		
		
	}

}
