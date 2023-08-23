package aaa.model;

import lombok.Data;

@Data

public class Person {
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String pname, String gender, boolean mil) {
		super();
		this.pname = pname;
		this.gender = gender;
		this.mil = mil;
	}
	public Person(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	String pname, gender;
	boolean mil;
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getAge() {
		// TODO Auto-generated method stub
		return null;
	}
	public String isMarriage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
