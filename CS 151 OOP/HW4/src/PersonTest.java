/**
 * HW4 Exercise 3
 * 
 * @author Truong Phu Vu
 * @since 10/20/2021
 */
import java.util.Comparator;
import java.util.*;

public class PersonTest {
	public static void main (String [] arg) {
		Comparator<Person> firstNameComparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}

		};
		Comparator<Person> lastNameComparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().length() - o2.getLastName().length();
			}

		};
		Comparator<Person> ageComparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}

		};
		Person p1 = new Person ("Joe", "Smith", 40);
		Person p2 = new Person ("Amy", "Gold", 32);
		Person p = new Person("Tony", "Stark", 21);
		Person p3 = new Person ("Sean", "Irish", 24);
		Person p4 = new Person ("Tina", "Brock", 28);
		Person p5 = new Person("Lenny", "Hep", 18);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		System.out.println("********************Testing************************\n");
		System.out.println("Sorted List based on FIRST NAME********************");
		System.out.println("Ascending List-------------------------------------");
		Collections.sort(list, firstNameComparator);
		for (Person per : list) {
			System.out.println(per);
		}
		System.out.println("Descending List------------------------------------");
		Collections.reverse(list);
		for (Person per : list) {
			System.out.println(per);
		}
		
		System.out.println("Sorted List based on the length of LAST NAME*******");
		System.out.println("Ascending------------------------------------------");
		Collections.sort(list, lastNameComparator);
		for (Person per : list) {
			System.out.println(per);
		}
		System.out.println("Descending List------------------------------------");
		Collections.reverse(list);
		for (Person per : list) {
			System.out.println(per);
		}
		
		System.out.println("Sorted List based on AGE***************************");
		System.out.println("Ascending List-------------------------------------");
		Collections.sort(list, ageComparator);
		for (Person per : list) {
			System.out.println(per);
		}
		System.out.println("Descending List------------------------------------");
		Collections.reverse(list);
		for (Person per : list) {
			System.out.println(per);
		}
	}
	
}

/*
OUTPUT
 ********************Testing************************

Sorted List based on FIRST NAME********************
Ascending List-------------------------------------
First name: Amy
Last name: Gold
Age: 32

First name: Joe
Last name: Smith
Age: 40

First name: Lenny
Last name: Hep
Age: 18

First name: Sean
Last name: Irish
Age: 24

First name: Tina
Last name: Brock
Age: 28

First name: Tony
Last name: Stark
Age: 21

Descending List------------------------------------
First name: Tony
Last name: Stark
Age: 21

First name: Tina
Last name: Brock
Age: 28

First name: Sean
Last name: Irish
Age: 24

First name: Lenny
Last name: Hep
Age: 18

First name: Joe
Last name: Smith
Age: 40

First name: Amy
Last name: Gold
Age: 32

Sorted List based on the length of LAST NAME*******
Ascending------------------------------------------
First name: Lenny
Last name: Hep
Age: 18

First name: Amy
Last name: Gold
Age: 32

First name: Tony
Last name: Stark
Age: 21

First name: Tina
Last name: Brock
Age: 28

First name: Sean
Last name: Irish
Age: 24

First name: Joe
Last name: Smith
Age: 40

Descending List------------------------------------
First name: Joe
Last name: Smith
Age: 40

First name: Sean
Last name: Irish
Age: 24

First name: Tina
Last name: Brock
Age: 28

First name: Tony
Last name: Stark
Age: 21

First name: Amy
Last name: Gold
Age: 32

First name: Lenny
Last name: Hep
Age: 18

Sorted List based on AGE***************************
Ascending List-------------------------------------
First name: Lenny
Last name: Hep
Age: 18

First name: Tony
Last name: Stark
Age: 21

First name: Sean
Last name: Irish
Age: 24

First name: Tina
Last name: Brock
Age: 28

First name: Amy
Last name: Gold
Age: 32

First name: Joe
Last name: Smith
Age: 40

Descending List------------------------------------
First name: Joe
Last name: Smith
Age: 40

First name: Amy
Last name: Gold
Age: 32

First name: Tina
Last name: Brock
Age: 28

First name: Sean
Last name: Irish
Age: 24

First name: Tony
Last name: Stark
Age: 21

First name: Lenny
Last name: Hep
Age: 18

 */
