/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public class PartTimeHourly extends Employee {
	// variable
	private double baseHourlyPay;

	// constructor
	PartTimeHourly() {

	}

	// overloaded constructor
	PartTimeHourly(String firstName, String lastName, Address address, int id, double baseHourlyPay, String SSN) {
		super(firstName, lastName, address, SSN, id);
		this.baseHourlyPay = baseHourlyPay;
	}

	// setter and getter
	public double getBaseHourlyPay() {
		return baseHourlyPay;
	}

	public void setBaseHourlyPay(double baseHourlyPay) {
		this.baseHourlyPay = baseHourlyPay;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Base hourly pay: $" + this.baseHourlyPay;
	}

	/*
	 * display Part-time hourly employee class's attributes
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

	/*
	 * compute the salary based on working hours and hourly base pay
	 * 
	 * @param numHrs
	 * 
	 * @return -1 if numHrs exceed 40, the amount of money earned
	 */
	public double compatePay(int numHrs) {
		if (numHrs > 40) {
			return -1;
		}

		return numHrs * this.baseHourlyPay;
	}

}
