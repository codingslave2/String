package Coffee.type;

public class Water {
	
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
		return "물은 " + name + "로, 용량은 " + cc + "cc" + "]";
	}
	
}
