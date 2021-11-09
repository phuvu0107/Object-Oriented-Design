/**
 * Homework 1 Exercise 3
 * 
 * @author Phu Vu
 * @since 08/25/2021
 *
 */

public class EmployeeTest {
	public static void main(String[] arg) {
		// instantiate employees
		Employee joe = new Employee("Joe", "Smith", "833 Tersi Court", "Male", "104-849-1930", 44, 189.9f, 200001,
				"contractor", 60);
		Employee lisa = new Employee("Lisa", "Gray", "835 Tersi Court", "Female", "104-849-9999", 22, 125.4f, 200002,
				"full time", 110000);
		Employee timothy = new Employee("Timothy", "Briggs", "900 Tersi Court", "Male", "104-849-8483", 29, 150f,
				200003, "full time", 80000);
		Employee george = new Employee("George", "Wallace", "2000 Cropley Avenue", "Male", "105-349-9030", 18, 280f,
				200049, "part time", 20);
		Employee amy = new Employee("Amy", "Student", "48 Neal Avenue", "Female", "106-749-1220", 30, 110.5f, 303033,
				"contractor", 45);

		// print onject's attribute and calculate salary
		joe.introduce();
		System.out.printf("Salary: %.2f", joe.calculatePay(30));
		System.out.println();
		System.out.println();
		lisa.introduce();
		System.out.printf("Salary:  %.2f", lisa.calculatePay(2));
		System.out.println();
		System.out.println();
		timothy.introduce();
		System.out.printf("Salary:  %.2f", timothy.calculatePay(4));
		System.out.println();
		System.out.println();
		george.introduce();
		System.out.printf("Salary:  %.2f", george.calculatePay(25));
		System.out.println();
		System.out.println();
		amy.introduce();
		System.out.printf("Salary:  %.2f", amy.calculatePay(45));
		System.out.println();
		System.out.println();
	}
}

/********************************************************************
 Output
 Name: Joe Smith
ID: 200001
Status: contractor
Base Pay: $60.0/hour
Gender: Male
Age: 44
Weight: 189.9
Address: 833 Tersi Court
Social Security Number: 104-849-1930
Salary: 1800.00

Name: Lisa Gray
ID: 200002
Status: full time
Base Pay: $110000.0/year
Gender: Female
Age: 22
Weight: 125.4
Address: 835 Tersi Court
Social Security Number: 104-849-9999
Salary:  4230.77

Name: Timothy Briggs
ID: 200003
Status: full time
Base Pay: $80000.0/year
Gender: Male
Age: 29
Weight: 150.0
Address: 900 Tersi Court
Social Security Number: 104-849-8483
Salary:  6153.85

Name: George Wallace
ID: 200049
Status: part time
Base Pay: $20.0/hour
Gender: Male
Age: 18
Weight: 280.0
Address: 2000 Cropley Avenue
Social Security Number: 105-349-9030
Salary:  500.00

Name: Amy Student
ID: 303033
Status: contractor
Base Pay: $45.0/hour
Gender: Female
Age: 30
Weight: 110.5
Address: 48 Neal Avenue
Social Security Number: 106-749-1220
Salary:  2025.00

*********************************************************************/
