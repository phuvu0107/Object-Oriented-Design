/**
 * HW 3 Exercise 1
 * 
 * @author Phu Vu
 * @since 10/02/2021
 */
public class Student implements Cloneable{
	private String firstName, lastName, major, department;
	private int age;
	private double GPA;
	private Course course;
	
	//Constructors
	
	Student() {
		
	}

	public Student(String firstName, String lastName, String major, String department, int age, double gPA,
			Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.department = department;
		this.age = age;
		GPA = gPA;
		this.course = course;
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

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	//methods
	public void printInfo() {
		System.out.println("First name: " + this.firstName);
		System.out.println("Last name: " + this.lastName);
		System.out.println("Age: " + this.age);
		System.out.println("Major: " + this.major);
		System.out.println("Department: " + this.department);
		System.out.println("GPA: " + this.GPA);
		System.out.println("Course: " + this.course.toString());
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student)super.clone();
		student.course = (Course)course.clone();
		return student;
		
	}
}
