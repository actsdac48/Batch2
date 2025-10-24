package day9;

import java.io.Serializable;

public class Engineer extends Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2015202076961701916L;
	protected float overtime;
	
	public Engineer(String name, String address, int age, boolean gender, float basicSalary, float overtime) {
		super(name, address, age, gender, basicSalary);
		// TODO Auto-generated constructor stub
		this.overtime=overtime;
	}

	public float getOvertime() {
		return overtime;
	}

	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}
	
	public float calSalary() {
		return overtime*10 + basicSalary;
	}
	
	public String toString() {
		return getName()+" "+ getAddress()+" " + getAge()+" " + isGender()+" " + calSalary(); 
	}
}
