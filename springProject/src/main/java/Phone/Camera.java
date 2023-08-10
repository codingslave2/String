package Phone;

public class Camera {
	
	String productor;
	String name;
	int megapixel;

	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMegapixel() {
		return megapixel;
	}
	public void setMegapixel(int megapixel) {
		this.megapixel = megapixel;
	}
	
	
	
	@Override
	public String toString() {
		return "Camera [productor=" + productor + ", name=" + name + ", megapixel=" + megapixel + "]";
	}	
	
}
