/**
 * Homework 1 Exercise 5 Cat class
 * 
 * @author Phu Vu
 * @since 09/07/2021
 */
public class Cat extends Animal implements Domesticated, Scratcher {

	// constructor
	public Cat(String name, String gender, String habitat, int age, double speed, String type) {
		super(name, gender, habitat, age, speed, type);
	}

	// methods

	// Overriden methods from parent class
	@Override
	public void move() {
		System.out.println("Cat is moving!");
	}

	@Override
	public void sound() {
		System.out.println("Cat's sound!");
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating!");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping!");
	}

	@Override
	public String toString() {
		return "Name: " + super.name + ", " + "Type: " + this.type + ", " + "Gender: " + super.gender + ", "
				+ "Habitat: " + super.habitat + ", " + "Age: " + super.age + ", " + "Speed: " + super.speed;
	}

	// Overriden methods from Domesticated interface
	@Override
	public void walk() {
		System.out.println("Cat is walking!");
	}

	@Override
	public void greetHuman() {
		System.out.println("Cat is greeting humans!");
	}

	// Overriden methods from Scratcher interface
	@Override
	public void scratch() {
		System.out.println("Cat is scratching!");
	}
}
