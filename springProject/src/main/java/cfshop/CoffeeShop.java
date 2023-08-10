package cfshop;

public abstract class CoffeeShop {
	
	public Coffee order(){
		System.out.println("Ordering coffee");
		return new Coffee("Americano", 2000);
	}
	
	public void order_void() {
		//<lookup-method name="order_void" bean="co"/>
		// 가 적용되어 메소드 실행되지 않음
		System.out.println("order_void 실행");
	}
	
	public Tea order_tea() {
		System.out.println("order_tea 실행");
		return new Tea("생각대로T",2000);
	}
	
	private Coffee order_private() {
		System.out.println("order_private 실행");
		return new Coffee("아프리카노",1700);
	}
	
	public Coffee order_private2() {
		System.out.println("order_private 대행 실행");
		return order_private();
	}
	
	final public Coffee order_final() {
		System.out.println("order_final 실행");
		return new Coffee("왜그러노",2300);
	}
	
	static public Coffee order_static() {
		System.out.println("order_static 실행");
		return new Coffee("와이라노",2500);
	}
	
	public Coffee order_piano() {
		System.out.println("order_piano 실행");
		return new Coffee("피아노",4000);
	}

	abstract public Coffee order_hunter();
	
	abstract public Coffee order_latte();
	
	abstract public Coffee order_coke();

	@Override
	public String toString() {
		return "CoffeeShop [order()=" + order() + ", order_tea()=" + order_tea() + ", order_private()="
				+ order_private() + ", order_private2()=" + order_private2() + ", order_final()=" + order_final()
				+ ", order_piano()=" + order_piano() + ", order_hunter()=" + order_hunter() + ", order_latte()="
				+ order_latte() + ", order_coke()=" + order_coke() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}






	
}
	
	

