package di_p;

public class Camera {
	
	String name;
	int pixel;
	
	public Camera() {
		System.out.println("Create Camera");
	}
	
	
	public String getName() {
		System.out.println("nameSet");
		return name;
	}




	public void setName(String name) {
		System.out.println("setName(): " + name);
		this.name = name;
	}




	public int getPixel() {
		return pixel;
	}




	public void setPixel(int pixel) {
		this.pixel = pixel;
	}



// 소스 - generate using field
	public Camera(String name, int pixel) {
		super();
		this.name = name;
		this.pixel = pixel;
	}


	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
	
	
}
