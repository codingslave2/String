package bike;

public class Backet {

	int Backet = 0;

	public Backet() {
		
	}
	
	public Backet(int Backet) {
		this.Backet = Backet;
	}

	public int getBacket() {
		return Backet;
	}

	public void setBacket(int backet) {
		System.out.println("바구니: " + backet);
		this.Backet = backet;
	}

//	public void print() {
//		System.out.println("바구니: " + Backet);
//	}
	
}
