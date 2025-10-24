package day6;

public class SalesPerson extends Employee{
	 protected float commission;

	public SalesPerson(String name, String address, int age, boolean gender, float basicSalary, float commission) {
		super(name, address, age, gender, basicSalary);
		this.commission=commission;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}
	 
	public float calSalary() {
		return commission + basicSalary;
	}
	public String toString() {
		return getName()+" "+ getAddress()+" " + getAge()+" " + isGender()+" " + calSalary(); 
	}
	
}
