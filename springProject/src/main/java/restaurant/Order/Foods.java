package Restaurant.Order;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class Foods {
	
	String name, type;
	int price, quantity;
	
	public Foods() {
		super();
	}

	public Foods(String name, String type, int price, int quantity) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	
	@Override
	public String toString() {
		return "Foods [name=" + name + ", type=" + type + ", price=" + price + ", quantity=" + quantity + "]";
	}	

}
