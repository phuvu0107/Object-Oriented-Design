/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public abstract class Person {
	// variables
	private String firstName, lastName;
	private int age;
	private String ssn;
	private Address address;

	// constructor
	Person() {

	}

	// overloaded constructor
	Person(String firstName, String lastName, Address address, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address ;
		this.ssn = ssn;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	/*
	 * toString() 
	 * display all of the attributes of Person class
	 */
	@Override
	public String toString() {
		return "First name: " + this.firstName + "\n" + "Last name: " + this.lastName + "\n"
				+ "Age: " + this.age + "\n" + "SSN: " + this.ssn + "\n" + "Adress: " + this.address;
	}

}
