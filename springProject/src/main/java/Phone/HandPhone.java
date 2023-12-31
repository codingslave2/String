package Phone;

public class HandPhone {
	
	String name;
	Battery bat;
	Display dis;
	Camera cam;
	int price;

	// 기본 생성자
	public HandPhone() {
		System.out.println("HandPhone 기본 생성자");
	}

	public HandPhone(String name, Battery bat, Display dis, Camera cam, int price) {
        super();
        this.name = name;
        this.bat = bat;
        this.dis = dis;
        this.cam = cam;
        this.price = price;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Battery getBat() {
		return bat;
	}
	public void setBat(Battery bat) {
		this.bat = bat;
	}
	public Display getDis() {
		return dis;
	}
	public void setDis(Display dis) {
		this.dis = dis;
	}
	public Camera getCam() {
		return cam;
	}
	public void setCam(Camera cam) {
		this.cam = cam;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "HandPhone [name=" + name + ", bat=" + bat + ", dis=" + dis + ", cam=" + cam + ", price=" + price + "]";
	}
	
	
}

