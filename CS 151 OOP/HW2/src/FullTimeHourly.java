/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public class FullTimeHourly extends FullTimeEmployee {
	// variable
	private double overtimePay;

	// constructor
	FullTimeHourly() {

	}

	// overloaded constructor
	FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtime,
			String SSN) {
		super(firstName, lastName, address, id, basePay, SSN);
		this.overtimePay = overtime;
	}

	// setter and getter
	public double getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}

	// methods

	/**
	 * Display the attributes of FullTimeHourly Class
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" + "Overtime pay: " + this.overtimePay;
	}

	/**
	 * Display the attributes of FullTimeHourly class
	 * 
	 * @param displaySSN Display SNN if displaySSN is true
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
	 * @param numHrs
	 * @return the salary including overtime pay
	 */
	public double computePay(int numHrs) {
		double salary = 0;
		if (numHrs <= 40) {
			salary = numHrs * super.getBasePay();
		} else {
			salary = (40 * super.getBasePay()) + (this.overtimePay * (numHrs - 40));
		}
		return salary;
	}

}
