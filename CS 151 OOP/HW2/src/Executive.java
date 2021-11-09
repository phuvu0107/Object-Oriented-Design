/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public class Executive extends Employee {
	// variables
	private double yearlyBonus, yearlyCompensation;

	// constructor
	Executive() {

	}

	// Executive
	Executive(String firstName, String lastName, Address address, String ssn, int id, double pay, double bonus) {
		super(firstName, lastName, address, ssn, id);
		this.yearlyBonus = bonus;
		this.yearlyCompensation = pay;
	}

	// setters and getters
	public double getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public double getYearlyCompensation() {
		return yearlyCompensation;
	}

	public void setYearlyCompensation(double yearlyCompensation) {
		this.yearlyCompensation = yearlyCompensation;
	}

	// methods

	/**
	 * Display all of the attributes of Executive class
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" + "Yearly bonus: " + this.yearlyBonus + "\n" + "Yearly compensation: "
				+ this.yearlyCompensation;
	}

	/**
	 * Display the attributes of Executive class to the console Does not display SSN
	 * if displaySSN argument is false
	 * 
	 * @param displaySSN
	 * @return nothing
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

	/**
	 * 
	 * @return this.yearlyBonus + this.yearlyCompensation
	 */
	public double computePay() {
		return this.yearlyBonus + this.yearlyCompensation;
	}

}
