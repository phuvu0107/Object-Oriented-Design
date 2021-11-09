import java.util.*;

public class Test {
	public static void main(String[] arg) {
		/*
		 * ArrayList<Integer> a = new ArrayList<Integer>(); ListManipulator mani = new
		 * ListManipulator(); a.add(5); a.add(822); a.add(99); a.add(99); a.add(3);
		 * a.add(3); a.add(22); a.add(99); a.add(99); a.add(99); a.add(99); a.add(99);
		 * a.add(5); a.add(822);
		 * 
		 * mani.swapLargestSmallest(a);
		 * 
		 * Iterator iterator = a.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 * 
		 * mani.table(a);
		 */
		// Course(String courseName, String description, String department, String
		// startingTime, String weekday)
		// Student(String firstName, String lastName, String major, String department,
		// double gpa, int age,
		// LinkedList<Course> courses)
		Course c = new Course("A", "lala", "Math", "10:30", "Monday");
		Course c2 = new Course("B", "lulu", "Bio", "8:00", "Saturday");
		Course c3 = new Course("C", "haha", "Humi", "7:00", "Wednesday");
		Course c4 = new Course("D", "uaua", "CS", "13:30", "Thursday");
		Course c5 = new Course("E", "jaja", "METR", "19:30", "Friday");
		Course c6 = new Course("F", "oaja", "PE", "6:00", "Wednesday");
		LinkedList<Course> l = new LinkedList<Course>();
		l.add(c4);
		l.add(c5);
		l.add(c2);
		l.add(c);
		l.add(c3);
		Student stud = new Student("Truong", "Phu", "CS", "Computer Science", 4.2, 21, l);
		stud.addCourse(c6);
		System.out.println("\nAscending");
		stud.sortCourse("startingTime", true);
		System.out.println("\nDescending:");
		stud.sortCourse("startingTime", false);

	}
}
