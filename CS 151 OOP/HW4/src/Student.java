/**
 * HW4 Exercise 2
 * 
 * @author Truong Phu Vu
 * @since 10/20/2021
 */
import java.util.*;

public class Student {
	// variables
	private String firstName, lastName, major, department;
	private double gpa;
	private int age;
	private LinkedList<Course> courses;

	// Constructor
	Student() {

	}

	// Overloaded constructor
	public Student(String firstName, String lastName, String major, String department, double gpa, int age,
			LinkedList<Course> courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.department = department;
		this.gpa = gpa;
		this.age = age;
		this.courses = courses;
	}

	// getters and setters
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LinkedList<Course> getCourses() {
		return courses;
	}

	public void setCourses(LinkedList<Course> courses) {
		this.courses = courses;
	}

	// methods
	public void addCourse(Course course) {
		courses.add(course);
	}

	public void removeCourse(Course course) {
		courses.contains(course);
		courses.remove(course);
	}

	public void sortCourse(String desiredAttribute, boolean ascending) {

		// create HashMap contains the days of a week as keys to use for sorting
		//assign "key" Monday is 0 indicating that Monday is at the front
		Map<String, Integer> dayOfTheWeek = new HashMap<String, Integer>();
		dayOfTheWeek.put("Monday", 0);
		dayOfTheWeek.put("Tuesday", 1);
		dayOfTheWeek.put("Wednesday", 2);
		dayOfTheWeek.put("Thursday", 3);
		dayOfTheWeek.put("Friday", 4);
		dayOfTheWeek.put("Saturday", 5);
		dayOfTheWeek.put("Sunday", 6);

		// Override compare method to sort with desired attribute
		Comparator<Course> comp = new Comparator<Course>() {
			@Override
			public int compare(Course o1, Course o2) {
				switch (desiredAttribute) {
				case "name":
					return o1.getCourseName().compareTo(o2.getCourseName());
				case "department":
					return o1.getDepartment().compareTo(o2.getDepartment());
				case "startingTime":
					return o1.getStartingTime().compareTo(o2.getStartingTime());
				case "day":
					return dayOfTheWeek.get(o1.getWeekday()) - dayOfTheWeek.get(o2.getWeekday());
				case "description":
					return o1.getDescription().compareTo(o2.getDescription());
				default:
					return -1;
				}
			}

		};
		//Sort
		if (ascending) {
			Collections.sort(courses, comp);
		} else {
			Collections.sort(courses,comp);
			Collections.reverse(courses);
		}
		
		for(Course printCourse : courses) {
			System.out.println(printCourse);
		}
	}

	@Override
	public String toString() {
		return "Student \n firstName: " + firstName + "\n lastName: " + lastName + "\n major: " + major + "\n department="
				+ department + "\n gpa: " + gpa + "\n age: " + age + "\n courses: " + courses + "\n";
	}
	

}
