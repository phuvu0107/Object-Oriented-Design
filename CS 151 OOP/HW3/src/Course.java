/**
 * HW 3 Exercise 1
 * 
 * @author Phu Vu
 * @since 10/02/2021
 */
public class Course implements Cloneable {
	private String courseName, courseDescription, department, startingTime, weekDays;
	
	Course (){
		
	}

	public Course(String courseName, String courseDescription, String department, String startingTime,
			String weekDays) {
		super();
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.department = department;
		this.startingTime = startingTime;
		this.weekDays = weekDays;
	}
	

	//getters and setters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
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

	public String getWeekDays() {
		return weekDays;
	}

	public void setWeekDays(String weekDays) {
		this.weekDays = weekDays;
	}
	
	//Method
	
	/**
	 * Overriding clone method from Cloneable interface
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Course course = (Course)super.clone();
		return course;
	}

	@Override
	public String toString() {
		return "Course name: " + courseName + "\nCourse Description: " + courseDescription + "\nDepartment: "
				+ department + "\nStarting Time: " + startingTime + "\nWeekday: " + weekDays;
	}
	
	
}
