/**
 * Homework 1 Exercise 1
 * 
 * @author Truong Phu Vu
 * @since 08/25/2021
 */
public class StudentTest {
	public static void main (String [] arg) {
		Student stud1 = new Student("John", "Smith", "Computer Science Major", "School of Computer Science department", 20, 3.6f);
		Student.Course stud1Schedule = stud1.new Course();
		stud1Schedule.printSchedule();
	}
}

/******************
Output
CS 151 Tue/Thur 6-7:15pm
CS 147 Mon/Wed  7:30-8:45pm
CS 154 Mon/Wed  10:45-12am
******************/