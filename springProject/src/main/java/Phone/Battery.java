package Phone;

public class Battery {
	
	String productor; // 생산자
	String name;
	int capacity; // 용량
	
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Battery [productor=" + productor + ", name=" + name + ", capacity=" + capacity + "]";
	}
	
	
}
