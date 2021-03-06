/**
 * Homework 1 Exercise 3
 * 
 * @author Phu Vu
 * @since 08/25/2021
 *
 */
public class Person {
	// variables
	private String SSN, firstName, lastName, address, gender;
	private int age;
	private double weight;

	// constructor
	Person(String firstName, String lastName, String address, String gender, String SSN, int age, float weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.SSN = SSN;
		this.age = age;
		this.weight = weight;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// methods
	@Override
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName + "\n" + "Gender: " + this.gender + "\n" + "Age: "
				+ this.age + "\n" + "Weight: " + this.weight + "\n" + "Address: " + this.address + "\n" + "SSN: "
				+ this.SSN + "\n";

	}
	/*
	 * Printing all of the attributes of this class
	 */
	public void introduce() {
		System.out.println("Name: " + this.firstName + " " + this.lastName);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);
		System.out.println("Weight: " + this.weight);
		System.out.println("Address: " + this.address);
		System.out.println("Social Security Number: " + this.SSN);

	}

}
