/**
 * Homework 1 Exercise 3
 * 
 * @author Phu Vu
 * @since 08/25/2021
 *
 */

public class Employee extends Person {
	// variable
	private int ID;
	private String status;
	private double basePay;

	// constructor
	Employee(String firstName, String lastName, String address, String gender, String SSN, int age, float weight,
			int ID, String status, double basePay) {
		super(firstName, lastName, address, gender, SSN, age, weight);
		this.ID = ID;
		this.basePay = basePay;
		this.status = status;
	}

	// getters and setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	// methods
	/**
	 * Printing all of the attributes of Employee.
	 */
	@Override
	public void introduce() {
		System.out.println("Name: " + super.getFirstName() + " " + super.getLastName());
		System.out.println("ID: " + this.ID);
		System.out.println("Status: " + this.status);
		if (this.status == "contractor" || this.status == "part time") {
			System.out.println("Base Pay: $" + this.basePay + "/hour");
		} else {
			System.out.println("Base Pay: $" + this.basePay + "/year");
		}
		System.out.println("Gender: " + super.getGender());
		System.out.println("Age: " + super.getAge());
		System.out.println("Weight: " + super.getWeight());
		System.out.println("Address: " + super.getAddress());
		System.out.println("Social Security Number: " + super.getSSN());
	}

	/**
	 * 
	 * @param workingUnits
	 * @return salary
	 */
	public double calculatePay(double workingUnits) {
		double salary = 0;
		if (this.status == "part time" || this.status == "contractor") {
			salary = this.basePay * workingUnits;
		}
		if (this.status == "full time") {
			salary = (this.basePay / 52) * workingUnits;
		}
		return salary;
	}

}
