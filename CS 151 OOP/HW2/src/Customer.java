/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public class Customer extends Person {
	// variables
	private int customerID;
	private String payPreference;

	// constructor
	Customer() {

	}

	// Overloaded constructor
	Customer(String firstName, String lastName, Address address, int customerID, String ssn) {
		super(firstName, lastName, address, ssn);
		this.customerID = customerID;
	}

	// setters and getters
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getPayPreference() {
		return payPreference;
	}

	public void setPayPreference(String payPreference) {
		this.payPreference = payPreference;
	}

	public String toString() {
		return "Customer ID: " + this.customerID + "\n" + "Payment preference: " + this.payPreference + "\n"
				+ super.toString();
	}

	/*
	 * introduce() display all of the attribute of Customer class along with its
	 * Parent class which is Person
	 * 
	 */
	public void introduce() {
		System.out.println("Customer: ");
		String ssnKeeper = super.getSsn();
		super.setSsn("Hidden SSN");
		System.out.print(toString());
		super.setSsn(ssnKeeper);
	}

	public void makePayment() {
		System.out.println("Payment preference: " + this.payPreference);
	}
}
