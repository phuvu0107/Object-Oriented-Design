/**
 * HW 3 Exercise 1
 * 
 * @author Phu Vu
 * @since 10/02/2021
 */
public class StudentTest {
	public static void main(String[] arg) {
		Student stud1 = new Student("John", "Smith", "Computer Science", "School of Computer Science", 20, 3.6,
				new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tuesday"));
		Student stud2 = null;
		System.out.println("Print student 1 before cloning: ");
		stud1.printInfo();
		
		try {
			stud2 = (Student) stud1.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nPrint info of student 2 after cloning from student 1:");
		stud2.printInfo();
		
		System.out.println("\nChange the value of Student 2 attributes to evaluate the functionality of Deep Copy:");
		stud2.setAge(30);
		stud2.setGPA(4.0);
		
		System.out.println("\nSutdent 1 info: Age and GPA should stay at 20 and 3.6 respectively");
		stud1.printInfo();
		
		System.out.println("\nStudent 2 info: Age and GPA should be changed");
		stud2.printInfo();
	}
}
/*
Output:
Print student 1 before cloning: 
First name: John
Last name: Smith
Age: 20
Major: Computer Science
Department: School of Computer Science
GPA: 3.6
Course: Course name: CS151
Course Description: Object Oriented Design and Programming
Department: CS
Starting Time: 6:00pm
Weekday: Tuesday

Print info of student 2 after cloning from student 1:
First name: John
Last name: Smith
Age: 20
Major: Computer Science
Department: School of Computer Science
GPA: 3.6
Course: Course name: CS151
Course Description: Object Oriented Design and Programming
Department: CS
Starting Time: 6:00pm
Weekday: Tuesday

Change the value of Student 2 attributes to evaluate the functionality of Deep Copy:

Sutdent 1 info: Age and GPA should stay at 20 and 3.6 respectively
First name: John
Last name: Smith
Age: 20
Major: Computer Science
Department: School of Computer Science
GPA: 3.6
Course: Course name: CS151
Course Description: Object Oriented Design and Programming
Department: CS
Starting Time: 6:00pm
Weekday: Tuesday

Student 2 info: Age and GPA should be changed
First name: John
Last name: Smith
Age: 30
Major: Computer Science
Department: School of Computer Science
GPA: 4.0
Course: Course name: CS151
Course Description: Object Oriented Design and Programming
Department: CS
Starting Time: 6:00pm
Weekday: Tuesday
*/