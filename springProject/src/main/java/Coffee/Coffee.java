package Coffee;

import Coffee.CoffeeEtc.CoffeeBeans;
import Coffee.type.Milk;
import Coffee.type.Syrup;
import Coffee.type.Water;


public class Coffee {
	
	
	String name;
	Water wt;        // 물
	Milk mk;            // 우유
	Syrup sr;        // 시럽
	CoffeeBeans beans;   // 커피 원두
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Water getWt() {
		return wt;
	}
	public void setWt(Water wt) {
		this.wt = wt;
	}
	public Milk getMk() {
		return mk;
	}
	public void setMk(Milk mk) {
		this.mk = mk;
	}
	public Syrup getSr() {
		return sr;
	}
	public void setSr(Syrup sr) {
		this.sr = sr;
	}
	public CoffeeBeans getBeans() {
		return beans;
	}
	public void setBeans(CoffeeBeans beans) {
		this.beans = beans;
	}
	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", wt=" + wt + ", mk=" + mk + ", sr=" + sr + ", beans=" + beans + "]";
	}
		
}
