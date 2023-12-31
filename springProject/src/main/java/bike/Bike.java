package bike;

public class Bike {
	
	String name;
	String handle;
	int wheel;
	int backet;
	
	
	public Bike() {
		System.out.println("자전거 생성");
	}
	
	
	public int getBacket() {
		return backet;
	}


	public void setBacket(int backet) {
		System.out.println("바구니 수: " + backet);
		this.backet = backet;}

	
	public String getName() {
		System.out.println("nameSet");
		return name;
	}




	public void setName(String name) {
		System.out.println("자전거: " + name);
		this.name = name;
	}




	public String getHandle() {
		return handle;
	}




	public void setHandle(String handle) {
		this.handle = handle;
	}




	public int getWheel() {
		return wheel;
	}


	public void setWheel(int wheel) {
		System.out.println("바퀴 수: " + wheel);
		this.wheel = wheel;
	}

	public void move() {
		System.out.println(name + " is moving");
	}

	public void repair() {
		System.out.println(name + " is repairing");
	}

	public void stop() {
		System.out.println(name + " has stopped");
	}


	@Override
	public String toString() {
		return "Bike [name=" + name + ", handle=" + handle + ", wheel=" + wheel + ", backet=" + backet + "]";
	}	
	
}
