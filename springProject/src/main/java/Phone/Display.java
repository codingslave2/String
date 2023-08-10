package Phone;

public class Display {
	
	String productor;
	String name;
	int width;
	int height;
	
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAspectRatio(int width, int height) {
		this.width = width;
        this.height = height;
	}
	
	@Override
	public String toString() {
		return "Display [productor=" + productor + ", name=" + name + ", width=" + width + ", height=" + height + "]";
	}


	
}
