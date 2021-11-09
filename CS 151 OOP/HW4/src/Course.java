/**
 * HW4 Excercise 2
 * 
 * @author Truong Phu Vu
 * @since 10/19/2021
 */
public class Course {
	// variables
	private String courseName, description, department, startingTime, weekday;

	// Constructor
	Course() {

	}

	// Overloaded constructor
	public Course(String courseName, String description, String department, String startingTime, String weekday) {
		this.courseName = courseName;
		this.description = description;
		this.department = department;
		this.startingTime = startingTime;
		this.weekday = weekday;
	}

	// getters and setters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	@Override
	public String toString() {
		return "\nCourse \n courseName: " + courseName + "\n description=" + description + "\n department: " + department
				+ "\n startingTime: " + startingTime + "\n weekday: " + weekday + "\n";
	}
	

}
