/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public class Contractor extends Employee {
	// variable
	private double basePay;

	// constructor
	Contractor() {

	}

	// overloaded constructor
	Contractor(String firstName, String lastName, Address address, int id, double basePay, String ssn) {
		super(firstName, lastName, address, ssn, id);
		this.basePay = basePay;
	}

	// setter and getter
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	public double getBasePay() {
		return this.basePay;
	}

	/*
	 * toString() display the attributes of Contractor class
	 * 
	 */
	@Override
	public String toString() {
		String contractorInfo = super.toString();
		return "Contractor: \n" + contractorInfo + "\n" + "Base pay: $" + this.basePay + "\n";
	}

	/*
	 * display Contractor class's attributes
	 * 
	 * @param displaySSN
	 * 
	 * @return no return
	 */
	public void introduce(boolean displaySSN) {
		String ssnKeeper = super.getSsn();
		if (displaySSN == true) {
			System.out.println(toString());
		} else {
			super.setSsn("Hidden SSN");
			System.out.println(toString());
			super.setSsn(ssnKeeper);
		}

	}

	public double computePay(int numHrs) {
		return numHrs * this.basePay;
	}
}
