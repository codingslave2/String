package Coffee.type;

public class Syrup {
	
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
		return "시럽은 " + name + ", cc=" + cc + "]";
	}
	
}
