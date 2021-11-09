/**
 * Homework 1 Exercise 5 Dog class
 * 
 * @author Phu Vu
 * @since 09/07/2021
 */
public class Dog extends Animal implements Domesticated {

	// constructor
	public Dog(String name, String gender, String habitat, int age, double speed, String type) {
		super(name, gender, habitat, age, speed, type);
	}

	// methods

	// Overriden methods from parent class
	@Override
	public void move() {
		System.out.println("Dog is moving!");
	}

	@Override
	public void sound() {
		System.out.println("Dog's sound!");

	}

	@Override
	public void eat() {
		System.out.println("Dog is eating!");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping!");
	}

	@Override
	public String toString() {
		return "Name: " + super.name + ", " + "Type: " + this.type + ", " + "Gender: " + super.gender + ", "
				+ "Habitat: " + super.habitat + ", " + "Age: " + super.age + ", " + "Speed: " + super.speed;
	}

	// Overriden methods from Domesticated interface
	@Override
	public void walk() {
		System.out.println("Dog is walking!");
	}

	@Override
	public void greetHuman() {
		System.out.println("Dog is greeting humans!");
	}

	public void bark() {
		System.out.println("Dog is barking!");
	}

}
