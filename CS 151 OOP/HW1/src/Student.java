/**
 * Homework 1 Exercise 1
 * 
 * @author Truong Phu Vu
 * @since 08/25/2021
 */
public class Student {
	//variables
	private String firstName, lastName, major, department;
	private int age;
	private float gpa;
	
	//constructors
	public Student(String firstName, String lastName, String major, String department, int age, float gpa) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.department = department;
		this.age = age;
		this.gpa = gpa;
	}
	
	//getters and setters
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	//inner class
	class Course{
		void printSchedule() {
			System.out.println("CS 151 Tue/Thur 6-7:15pm");
			System.out.println("CS 147 Mon/Wed  7:30-8:45pm");
			System.out.println("CS 154 Mon/Wed  10:45-12am");
		}
	}
}
