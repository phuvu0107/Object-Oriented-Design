/**
 * HW4 Exercise 3
 * 
 * @author Truong Phu Vu
 * @since 10/20/2021
 */
public class Person {
	// variables
	private String firstName, lastName;
	private int age;

	// constructor
	Person() {

	}

	// Overloaded constructor
	Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
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

	@Override
	public String toString() {
		return "First name: " + this.firstName + "\n" + "Last name: " + this.lastName + "\n" + "Age: " + this.age
				+ "\n";
	}

}
