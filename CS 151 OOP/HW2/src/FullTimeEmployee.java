/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public abstract class FullTimeEmployee extends Employee {
	// variables
	private double basePay;

	// constructor
	FullTimeEmployee() {

	}

	// overloaded constructor
	FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay, String SSN) {
		super(firstName, lastName, address, SSN, id);
		this.basePay = basePay;
	}

	// setter and getter
	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Base pay: " + this.basePay;
	}

}
