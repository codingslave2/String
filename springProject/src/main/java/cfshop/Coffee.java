package cfshop;

class Coffee{
	
	String name;
	int price;
	
	public Coffee(String string, int i) {
		System.out.println("커피 생성자");
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
		System.out.println("커피 setName(): " + name);
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
		System.out.println("커피 setPrice(): " + name);
	}



	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	
	
}