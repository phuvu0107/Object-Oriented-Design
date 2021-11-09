/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public class FullTimeSalaried extends FullTimeEmployee {

	// constructor
	FullTimeSalaried() {

	}

	// overloaded constructor
	FullTimeSalaried(String firstName, String lastName, Address address, int id, double salary, String SSN) {
		super(firstName, lastName, address, id, salary, SSN);
	}

	/**
	 * display the attributes of FullTimeEmployee class
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * 
	 * Display the attributes of this class
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
	 * @param numWeeks
	 * @return salary equivalent to the number of weeks
	 */
	public double computePay(int numWeeks) {
		double salaryPerWeek = super.getBasePay() / 52.0;
		double salary = salaryPerWeek * numWeeks;
		return salary;
	}

}
