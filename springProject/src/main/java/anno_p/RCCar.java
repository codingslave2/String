package anno_p;

import jakarta.annotation.Resource;

public class RCCar {
	
	String name;
	@Resource
	Motor mt;
	RCWheel rw1, rw2, rw3, rw4;
	
}

class RCWheel{
	
	String name;
	int size;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "RCWheel [name=" + name + ", size=" + size + "]";
	}
	
}
