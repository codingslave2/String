package Coffee;

import org.springframework.beans.factory.annotation.Autowired;

public class Coffee {
	
	@Autowired
	
	String name;
	int Price;
	CoffeeBeans cbean;
	Etc etc;
	
	
    public void setName(String name) {  // 수정된 부분
    	this.name = name;
    }
	
	
	public void setPrice(int price) {
		Price = price;
	}
	public void setCbean(CoffeeBeans cbean) {
		this.cbean = cbean;
	}
	
	@Autowired(required = false)
	public void setEtc(Etc etc) {
		this.etc = etc;
	}
	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", Price=" + Price + ", cbean=" + cbean + ", etc=" + etc + "]";
	}
	

}




class CoffeeBeans{
	
	String name, product;
	int price;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "CoffeeBeans [name=" + name + ", product=" + product + ", price=" + price + "]";
	}
	
	
}

class Etc{
	
	String syrup, milk, pouder;
	int ml;
	
	
		
	public String getSyrup() {
		return syrup;
	}

	public void setSyrup(String syrup) {
		this.syrup = syrup;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getPouder() {
		return pouder;
	}

	public void setPouder(String pouder) {
		this.pouder = pouder;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}



	@Override
	public String toString() {
		return "Etc [syrup=" + syrup + ", milk=" + milk + ", pouder=" + pouder + ", ml=" + ml + "]";
	}
		
	
}