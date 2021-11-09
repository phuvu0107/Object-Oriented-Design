/**
 * Homework 1 Exercise 5
 * AnimalTest class
 * 
 * @author Phu Vu
 * @since 09/07/2021
 */

public class AnimalTest {
	public static void main (String [] arg) {
		
		//Declarations
		Dog max = new Dog("Max", "Male", "Home", 3, 17.8, "Domesticated");
		Cat anna = new Cat("Anna", "Female", "Home", 8, 29.3, "Domesticated");
		Racoon jupiter = new Racoon("Jupiter", "Male", "Forest", 25, 5.2, "Scratcher");
		Whale polyester = new Whale("Polyester", "Male", "Ocean", 89, 10.5, "Swimmer");
		
		//Behaviors
		
		//Dog
		System.out.println("Dog Class");
		max.move();
		max.sound();
		max.eat();
		max.sleep();
		System.out.println("toString(): " + max.toString());
		max.greetHuman();
		max.walk();
		max.bark();
		System.out.println();
		
		//Cat
		System.out.println("Cat Class");
		anna.move();
		anna.sound();
		anna.eat();
		anna.sleep();
		System.out.println("toString(): " + anna.toString());
		anna.greetHuman();
		anna.walk();
		anna.scratch();
		System.out.println();
		
		//Racoon
		System.out.println("Racoon Class");
		jupiter.move();
		jupiter.sound();
		jupiter.eat();
		jupiter.sleep();
		System.out.println("toString(): " + jupiter.toString());
		jupiter.scratch();
		System.out.println();
		
		//Whale
		System.out.println("Whale Class");
		polyester.move();
		polyester.sound();
		polyester.eat();
		polyester.sleep();
		System.out.println("toString(): " + polyester.toString());
		polyester.swim();
		System.out.println();
		
		
		
	}
}
/*
 * Output
Dog Class
Dog is moving!
Dog's sound!
Dog is eating!
Dog is sleeping!
toString(): Name: Max, Type: Domesticated, Gender: Male, Habitat: Home, Age: 3, Speed: 17.8
Dog is greeting humans!
Dog is walking!
Dog is barking!

Cat Class
Cat is moving!
Cat's sound!
Cat is eating!
Cat is sleeping!
toString(): Name: Anna, Type: Domesticated, Gender: Female, Habitat: Home, Age: 8, Speed: 29.3
Cat is greeting humans!
Cat is walking!
Cat is scratching!

Racoon Class
Racoon is moving!
Racoon's sound!
Racoon is eating!
Racoon is sleeping!
toString(): Name: Jupiter, Type: Scratcher, Gender: Male, Habitat: Forest, Age: 25, Speed: 5.2
Racoon is scratching!

Whale Class
Whale is moving!
Whale's sound!
Whale is eating!
Whale is sleeping!
toString(): Name: Polyester, Type: Swimmer, Gender: Male, Habitat: Ocean, Age: 89, Speed: 10.5
Whale is swimming!


 */
