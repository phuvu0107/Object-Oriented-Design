/**
 * HW 3 Exercise 2
 * 
 * @author Phu Vu
 * @since 10/02/2021
 */
public class Employee {
	// Variables
	private String firstName, lastName, employeeID;
	private double hourlyPay;

	// Constructors
	Employee() {

	}

	// Overloaded Constructor
	public Employee(String firstName, String lastName, String employeeID, double hourlyPay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.hourlyPay = hourlyPay;
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

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	// Methods
	public double computePay(int hours) {
		try {
			if (hours < 0) {
				throw new NumberFormatException(
						"computePay(): Invalid input: the number of worked hours cannot be negative!");
			}
			if (hours > 40) {
				throw new TooManyHoursWorkedException(
						"computePay(): Invalid input: The number of hours exceeds 40 hours!");
			}
			return this.hourlyPay * hours;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return -1.0;
		} catch (TooManyHoursWorkedException e) {
			System.out.println(e);
			return -1.0;
		}

	}

}
