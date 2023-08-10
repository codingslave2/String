package restaurant;

public class Restaurant {

    public Breakfast orderBreakfast(String name, int price) {
        return new Breakfast(name, price);
    }

    public Lunch orderLunch(String name, int price) {
        return new Lunch(name, price);
    }

    public Dinner orderDinner(String name, int price) {
        return new Dinner(name, price);
    }

	@Override
	public String toString() {
		return "Restaurant [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    
    
}
