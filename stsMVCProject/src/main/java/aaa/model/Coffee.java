package aaa.model;

import lombok.Data;

@Data
public class Coffee {


	public Coffee() {
		
	}
	
	public Coffee(String cname, int price, int quantity) {
		super();
		this.cname = cname;
		this.price = price;
		this.quantity = quantity;
	}
	
	String cname;
	int price, quantity;

}
