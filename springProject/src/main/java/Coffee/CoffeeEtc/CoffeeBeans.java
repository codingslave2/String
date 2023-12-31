package Coffee.CoffeeEtc;

import org.springframework.stereotype.Component;

@Component
public class CoffeeBeans {
	
	String name, productor;
	int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "추가로 " + name + "에 " + "원산지는 " + productor + "산으로, 가격은 " + price + "원";
	}
			
}
