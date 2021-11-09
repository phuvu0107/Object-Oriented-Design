/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public abstract class Employee extends Person {
	// variables
	private int id;
	private String educationLevel;
	private boolean directDeposit;

	// constructor
	Employee() {

	}

	// Overloaded constructor
	public Employee(String firstName, String lastName, Address address, String ssn, int id) {
		super(firstName, lastName, address, ssn);
		this.id = id;
	}

	// setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean isDirectDeposit() {
		return directDeposit;
	}

	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}

	/*
	 * toString() display Employee class's attributes
	 */
	@Override
	public String toString() {
		String displayInfo = super.toString();
		return displayInfo + "ID: " + id + "\nEducation level: " + educationLevel + "\nDirect deposit: "
				+ directDeposit;
	}

}
