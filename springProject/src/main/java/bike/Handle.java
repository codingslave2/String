package bike;

public class Handle {
	
	int Handle;

	public Handle(int handle) {
		System.out.println("핸들?: " + handle);
		this.Handle = handle;
	}
	
	

	public int getHandle() {
		return Handle;
	}



	public void setHandle(int handle) {
		System.out.println("핸들?: " + handle);
		Handle = handle;
	}



	@Override
	public String toString() {
		return "Handle [Handle=" + Handle + "]";
	}

	

}
