package bike.bikeMain;

import bike.Bike;
import bike.Wheel;
import bike.Backet;
import bike.Handle;

public class bike_main {

public static void main(String[] args) {
		
		Bike bk1 = new Bike();
		bk1.setName("세발자전거");
		bk1.setWheel(3);
		bk1.setHandle("핸들이없겠냐");
		bk1.setBacket(0);
		System.out.println(bk1);
		
		Bike bk2 = new Bike();
		bk2.setName("MTB");
		bk2.setWheel(2);
		bk2.setHandle("핸들이없겠냐");
		bk2.setBacket(0);
		System.out.println(bk2);
		
		Bike bk3 = new Bike();
		bk3.setName("CF");		
		bk3.setWheel(2);
		bk3.setHandle("핸들이없겠냐");
		bk3.setBacket(1);
		System.out.println(bk3);

		
		

		

	}

}
