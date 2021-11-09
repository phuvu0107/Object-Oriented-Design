/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public class BusinessTest {
	public static void main(String[] arg) {
		Address add1 = new Address(9, "Teresi Court", "San Jose", "95117", "CA");
		Address add2 = new Address(10, "Adrian Avenue", "San Jose", "95127", "CA");
		Address add3 = new Address(11, "Adriana Avenue", "San Jose", "95127", "CA");
		Address add4 = new Address(12, "Ariana Avenue", "San Jose", "95333", "CA");
		Address add5 = new Address(13, "Story Avenue", "San Jose", "95143", "CA");
		Address add6 = new Address(14, "Field Avenue", "San Jose", "95154", "CA");
		Address add7 = new Address(15, "Stock Avenue", "San Jose", "95159", "CA");
		Address add8 = new Address(16, "Boston Avenue", "San Jose", "95444", "CA");
		Address add9 = new Address(17, "Billy Avenue", "San Jose", "95444", "CA");
		Address add10 = new Address(18, "Hollywood Avenue", "San Jose", "95444", "CA");
		Address add11 = new Address(19, "Tancha Avenue", "San Jose", "95444", "CA");
		Address add12 = new Address(20, "Hulu Avenue", "San Jose", "95444", "CA");

		// Customer
		Customer obj1 = new Customer("Adam", "Dardon", add1, 107012000, "939-394-1939");
		Customer obj2 = new Customer("Dylan", "Nguyen", add2, 107012001, "939-394-1939");
		obj1.setAge(40);
		obj2.setAge(44);
		System.out.println("Test Customer class: ");
		obj1.setPayPreference("Visa Debit Card");
		obj1.introduce();
		obj1.makePayment();
		System.out.println();
		obj2.setPayPreference("Cash");
		obj2.introduce();
		obj2.makePayment();

		System.out.println();

		//Contractor
		System.out.println("Test Contractor class:");
		Contractor obj3 = new Contractor("AJ", "Vu", add3, 107012002, 75, "939-394-1912");
		Contractor obj4 = new Contractor("Will", "Vu", add4, 107012003, 90, "939-394-1913");
		obj3.setAge(32);
		obj3.setEducationLevel("Bachelor Degree");
		obj4.setAge(55);
		obj4.setEducationLevel("Bachelor Degree");
		System.out.println("Obj3: Print SSN, hide SSN, print SSN again, and computePay");
		obj3.introduce(true);
		obj3.introduce(false);
		obj3.introduce(true);
		System.out.println("Salary: $" + obj3.computePay(120));
		System.out.println("\nObj4: Print SSN, Hide SSN and print SSN again");
		obj4.introduce(true);
		obj4.introduce(false);
		obj4.introduce(true);
		System.out.println("Salary: $" + obj4.computePay(160));

		System.out.println();

		//PartTimeHourly
		System.out.println("Test PartTimeHourly class");
		PartTimeHourly obj5 = new PartTimeHourly("Tony", "Ting", add5, 107012004, 27.5, "939-394-9314");
		PartTimeHourly obj6 = new PartTimeHourly("Johnny", "Thane", add6, 107012005, 28, "939-394-9315");
		obj5.setAge(18);
		obj5.setEducationLevel("Bachelor Degree");
		obj6.setAge(75);
		obj6.setEducationLevel("Bachelor Degree");
		System.out.println("Obj5: Print SSN, hide SSN, print SSN again, and computePay");
		obj5.introduce(true);
		System.out.println();
		obj5.introduce(false);
		System.out.println();
		obj5.introduce(true);
		System.out.println();
		System.out.println("\nSalary: $" + obj5.compatePay(39));
		System.out.println("\nObj6: Print SSN, hide SSN, print SSN again, and computePay");
		obj6.introduce(true);
		System.out.println();
		obj6.introduce(false);
		System.out.println();
		obj6.introduce(true);
		System.out.println();
		System.out.println("Salary: " + obj6.compatePay(45) + " (Should print -1)");
		System.out.println();

		//FullTimeSalaried
		System.out.println("Test FullTimeSalaried Class:");
		FullTimeSalaried obj7 = new FullTimeSalaried("Ben", "Thestalling", add7, 190010006, 175000, "939-394-9316");
		FullTimeSalaried obj8 = new FullTimeSalaried("Bob", "Horopiece", add8, 190010007, 280000.65, "939-394-9317");
		obj7.setAge(56);
		obj7.setEducationLevel("Bachelor Degree");
		obj8.setAge(29);
		obj8.setEducationLevel("Bachelor Degree");
		System.out.println("Obj7: Print SSN, hide SSN, print SSN again, and computePay");
		obj7.introduce(true);
		System.out.println();
		obj7.introduce(false);
		System.out.println();
		obj7.introduce(true);
		System.out.println();
		System.out.println("\nSalary: $" + obj7.computePay(52));
		System.out.println("\nObj8: Print SSN, hide SSN, print SSN again, and computePay");
		obj8.introduce(true);
		System.out.println();
		obj8.introduce(false);
		System.out.println();
		obj8.introduce(true);
		System.out.println("Salary: $" + obj8.computePay(45));
		System.out.println();

		//FullTimeHourly
		System.out.println("Test FullTimeHourly Class:");
		FullTimeHourly obj9 = new FullTimeHourly("Henry", "Umpra", add9, 190010008, 35, 52.5, "939-394-9318");
		FullTimeHourly obj10 = new FullTimeHourly("Unique", "Yall", add10, 190010009, 32.65, 57.14, "939-394-9319");
		obj9.setAge(62);
		obj9.setEducationLevel("Bachelor Degree");
		obj10.setAge(100);
		obj10.setEducationLevel("Bachelor Degree");
		System.out.println("Obj9: Print SSN, hide SSN, print SSN again, and computePay");
		obj9.introduce(true);
		System.out.println();
		obj9.introduce(false);
		System.out.println();
		obj9.introduce(true);
		System.out.println();
		System.out.println("Salary: $" + obj9.computePay(52));
		System.out.println("\nObj10: Print SSN, hide SSN, print SSN again, and computePay");
		obj10.introduce(true);
		System.out.println();
		obj10.introduce(false);
		System.out.println();
		obj10.introduce(true);
		System.out.println();
		System.out.println("Salary: $" + obj10.computePay(45));
		System.out.println();

		//Executive
		System.out.println("Test Executive Class:");
		Executive obj11 = new Executive("Chad", "Dasson", add11, "939-394-1920", 190010010, 85000, 24300);
		Executive obj12 = new Executive("Tas", "Sat", add12, "939-394-1922", 190010111, 120000, 43000);
		obj11.setAge(24);
		obj11.setEducationLevel("Bachelor Degree");
		obj12.setAge(25);
		obj12.setEducationLevel("Bachelor Degree");
		System.out.println("Obj11: Print SSN, hide SSN, print SSN again, and computePay");
		obj11.introduce(true);
		System.out.println();
		obj11.introduce(false);
		System.out.println();
		obj11.introduce(true);
		System.out.println();
		System.out.println("Salary: $" + obj11.computePay());
		System.out.println("\nObj12: Print SSN, hide SSN, print SSN again, and computePay");
		obj12.introduce(true);
		System.out.println();
		obj12.introduce(false);
		System.out.println();
		obj12.introduce(true);
		System.out.println();
		System.out.println("Salary: $" + obj12.computePay());

	}
}

/******************************************************************************
OUTPUT

Test Customer class: 
Customer: 
Customer ID: 107012000
Payment preference: Visa Debit Card
First name: Adam
Last name: Dardon
Age: 40
SSN: Hidden SSN
Adress: 9 Teresi Court San Jose CA 95117
Payment preference: Visa Debit Card

Customer: 
Customer ID: 107012001
Payment preference: Cash
First name: Dylan
Last name: Nguyen
Age: 44
SSN: Hidden SSN
Adress: 10 Adrian Avenue San Jose CA 95127
Payment preference: Cash

Test Contractor class:
Obj3: Print SSN, hide SSN, print SSN again, and computePay
Contractor: 
First name: AJ
Last name: Vu
Age: 32
SSN: 939-394-1912
Adress: 11 Adriana Avenue San Jose CA 95127
ID: 107012002
Education level: Bachelor Degree
Direct deposit: false
Base pay: $75.0

Contractor: 
First name: AJ
Last name: Vu
Age: 32
SSN: Hidden SSN
Adress: 11 Adriana Avenue San Jose CA 95127
ID: 107012002
Education level: Bachelor Degree
Direct deposit: false
Base pay: $75.0

Contractor: 
First name: AJ
Last name: Vu
Age: 32
SSN: 939-394-1912
Adress: 11 Adriana Avenue San Jose CA 95127
ID: 107012002
Education level: Bachelor Degree
Direct deposit: false
Base pay: $75.0

Salary: $9000.0

Obj4: Print SSN, Hide SSN and print SSN again
Contractor: 
First name: Will
Last name: Vu
Age: 55
SSN: 939-394-1913
Adress: 12 Ariana Avenue San Jose CA 95333
ID: 107012003
Education level: Bachelor Degree
Direct deposit: false
Base pay: $90.0

Contractor: 
First name: Will
Last name: Vu
Age: 55
SSN: Hidden SSN
Adress: 12 Ariana Avenue San Jose CA 95333
ID: 107012003
Education level: Bachelor Degree
Direct deposit: false
Base pay: $90.0

Contractor: 
First name: Will
Last name: Vu
Age: 55
SSN: 939-394-1913
Adress: 12 Ariana Avenue San Jose CA 95333
ID: 107012003
Education level: Bachelor Degree
Direct deposit: false
Base pay: $90.0

Salary: $14400.0

Test PartTimeHourly class
Obj5: Print SSN, hide SSN, print SSN again, and computePay
First name: Tony
Last name: Ting
Age: 18
SSN: 939-394-9314
Adress: 13 Story Avenue San Jose CA 95143
ID: 107012004
Education level: Bachelor Degree
Direct deposit: false
Base hourly pay: $27.5

First name: Tony
Last name: Ting
Age: 18
SSN: Hidden SSN
Adress: 13 Story Avenue San Jose CA 95143
ID: 107012004
Education level: Bachelor Degree
Direct deposit: false
Base hourly pay: $27.5

First name: Tony
Last name: Ting
Age: 18
SSN: 939-394-9314
Adress: 13 Story Avenue San Jose CA 95143
ID: 107012004
Education level: Bachelor Degree
Direct deposit: false
Base hourly pay: $27.5


Salary: $1072.5

Obj6: Print SSN, hide SSN, print SSN again, and computePay
First name: Johnny
Last name: Thane
Age: 75
SSN: 939-394-9315
Adress: 14 Field Avenue San Jose CA 95154
ID: 107012005
Education level: Bachelor Degree
Direct deposit: false
Base hourly pay: $28.0

First name: Johnny
Last name: Thane
Age: 75
SSN: Hidden SSN
Adress: 14 Field Avenue San Jose CA 95154
ID: 107012005
Education level: Bachelor Degree
Direct deposit: false
Base hourly pay: $28.0

First name: Johnny
Last name: Thane
Age: 75
SSN: 939-394-9315
Adress: 14 Field Avenue San Jose CA 95154
ID: 107012005
Education level: Bachelor Degree
Direct deposit: false
Base hourly pay: $28.0

Salary: -1.0 (Should print -1)

Test FullTimeSalaried Class:
Obj7: Print SSN, hide SSN, print SSN again, and computePay
First name: Ben
Last name: Thestalling
Age: 56
SSN: 939-394-9316
Adress: 15 Stock Avenue San Jose CA 95159
ID: 190010006
Education level: Bachelor Degree
Direct deposit: false
Base pay: 175000.0

First name: Ben
Last name: Thestalling
Age: 56
SSN: Hidden SSN
Adress: 15 Stock Avenue San Jose CA 95159
ID: 190010006
Education level: Bachelor Degree
Direct deposit: false
Base pay: 175000.0

First name: Ben
Last name: Thestalling
Age: 56
SSN: 939-394-9316
Adress: 15 Stock Avenue San Jose CA 95159
ID: 190010006
Education level: Bachelor Degree
Direct deposit: false
Base pay: 175000.0


Salary: $175000.0

Obj8: Print SSN, hide SSN, print SSN again, and computePay
First name: Bob
Last name: Horopiece
Age: 29
SSN: 939-394-9317
Adress: 16 Boston Avenue San Jose CA 95444
ID: 190010007
Education level: Bachelor Degree
Direct deposit: false
Base pay: 280000.65

First name: Bob
Last name: Horopiece
Age: 29
SSN: Hidden SSN
Adress: 16 Boston Avenue San Jose CA 95444
ID: 190010007
Education level: Bachelor Degree
Direct deposit: false
Base pay: 280000.65

First name: Bob
Last name: Horopiece
Age: 29
SSN: 939-394-9317
Adress: 16 Boston Avenue San Jose CA 95444
ID: 190010007
Education level: Bachelor Degree
Direct deposit: false
Base pay: 280000.65
Salary: $242308.25480769234

Test FullTimeHourly Class:
Obj9: Print SSN, hide SSN, print SSN again, and computePay
First name: Henry
Last name: Umpra
Age: 62
SSN: 939-394-9318
Adress: 17 Billy Avenue San Jose CA 95444
ID: 190010008
Education level: Bachelor Degree
Direct deposit: false
Base pay: 35.0
Overtime pay: 52.5

First name: Henry
Last name: Umpra
Age: 62
SSN: Hidden SSN
Adress: 17 Billy Avenue San Jose CA 95444
ID: 190010008
Education level: Bachelor Degree
Direct deposit: false
Base pay: 35.0
Overtime pay: 52.5

First name: Henry
Last name: Umpra
Age: 62
SSN: 939-394-9318
Adress: 17 Billy Avenue San Jose CA 95444
ID: 190010008
Education level: Bachelor Degree
Direct deposit: false
Base pay: 35.0
Overtime pay: 52.5

Salary: $2030.0

Obj10: Print SSN, hide SSN, print SSN again, and computePay
First name: Unique
Last name: Yall
Age: 100
SSN: 939-394-9319
Adress: 18 Hollywood Avenue San Jose CA 95444
ID: 190010009
Education level: Bachelor Degree
Direct deposit: false
Base pay: 32.65
Overtime pay: 57.14

First name: Unique
Last name: Yall
Age: 100
SSN: Hidden SSN
Adress: 18 Hollywood Avenue San Jose CA 95444
ID: 190010009
Education level: Bachelor Degree
Direct deposit: false
Base pay: 32.65
Overtime pay: 57.14

First name: Unique
Last name: Yall
Age: 100
SSN: 939-394-9319
Adress: 18 Hollywood Avenue San Jose CA 95444
ID: 190010009
Education level: Bachelor Degree
Direct deposit: false
Base pay: 32.65
Overtime pay: 57.14

Salary: $1591.7

Test Executive Class:
Obj11: Print SSN, hide SSN, print SSN again, and computePay
First name: Chad
Last name: Dasson
Age: 24
SSN: 939-394-1920
Adress: 19 Tancha Avenue San Jose CA 95444
ID: 190010010
Education level: Bachelor Degree
Direct deposit: false
Yearly bonus: 24300.0
Yearly compensation: 85000.0

First name: Chad
Last name: Dasson
Age: 24
SSN: Hidden SSN
Adress: 19 Tancha Avenue San Jose CA 95444
ID: 190010010
Education level: Bachelor Degree
Direct deposit: false
Yearly bonus: 24300.0
Yearly compensation: 85000.0

First name: Chad
Last name: Dasson
Age: 24
SSN: 939-394-1920
Adress: 19 Tancha Avenue San Jose CA 95444
ID: 190010010
Education level: Bachelor Degree
Direct deposit: false
Yearly bonus: 24300.0
Yearly compensation: 85000.0

Salary: $109300.0

Obj12: Print SSN, hide SSN, print SSN again, and computePay
First name: Tas
Last name: Sat
Age: 25
SSN: 939-394-1922
Adress: 20 Hulu Avenue San Jose CA 95444
ID: 190010111
Education level: Bachelor Degree
Direct deposit: false
Yearly bonus: 43000.0
Yearly compensation: 120000.0

First name: Tas
Last name: Sat
Age: 25
SSN: Hidden SSN
Adress: 20 Hulu Avenue San Jose CA 95444
ID: 190010111
Education level: Bachelor Degree
Direct deposit: false
Yearly bonus: 43000.0
Yearly compensation: 120000.0

First name: Tas
Last name: Sat
Age: 25
SSN: 939-394-1922
Adress: 20 Hulu Avenue San Jose CA 95444
ID: 190010111
Education level: Bachelor Degree
Direct deposit: false
Yearly bonus: 43000.0
Yearly compensation: 120000.0

Salary: $163000.0



*******************************************************************************/