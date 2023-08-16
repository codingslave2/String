package Coffee.type;

public class Milk {
	
	String name;
	int cc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	@Override
	public String toString() {
		return "우유는 " + name + ", cc=" + cc + "]";
	}
	
}
