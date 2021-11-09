/**
 * HW 3 Exercise 2
 * 
 * @author Phu Vu
 * @since 10/02/2021
 */

public class EmployeeTest {
	public static void main (String [] arg){
		Employee emp1 = new Employee("John", "Smith", "101", 35);
		System.out.println("40 hours: " + emp1.computePay(40));
		System.out.println();
		System.out.println("23 hours: " + emp1.computePay(23));
		System.out.println();
		System.out.println("1 hours: " + emp1.computePay(1));
		System.out.println();
		System.out.println("0 hour: " + emp1.computePay(0));
		System.out.println();
		System.out.println("-5 hours (Should throw NumberFormatException): " + emp1.computePay(-5));
		System.out.println();
		System.out.println("45 hours (Should throw TooManyHoursWorkedException): " + emp1.computePay(45));
		
		
	}
}
/*
Output 
40 hours: 1400.0

23 hours: 805.0

1 hours: 35.0

0 hour: 0.0

java.lang.NumberFormatException: computePay(): Invalid input: the number of worked hours cannot be negative!
	at Employee.computePay(Employee.java:63)
	at EmployeeTest.main(EmployeeTest.java:19)
-5 hours (Should throw NumberFormatException): -1.0

TooManyHoursWorkedException: computePay(): Invalid input: The number of hours exceeds 40 hours!
45 hours (Should throw TooManyHoursWorkedException): -1.0
*/
