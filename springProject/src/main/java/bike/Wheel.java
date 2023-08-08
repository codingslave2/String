package bike;

public class Wheel {
	
	int wheel;

	public Wheel() {
        this.wheel = 1;
	}


	public Wheel(int wheel) {
		System.out.println("바퀴 수: " + wheel);
		this.wheel = wheel;
	}
	
	
	public int getWheel() {
		return wheel;
	}



	public void setWheel(int wheel) {
		System.out.println("바퀴 수: " + wheel);
		this.wheel = wheel;
	}



	@Override
	public String toString() {
		return "Wheel [wheel=" + wheel + "]";	}
	
	
}
