/**
 * Whale class
 * 
 * @author Phu Vu
 * @since 09/07/2021
 */
public class Whale extends Animal implements Swimmer {

	// constructor
	public Whale(String name, String gender, String habitat, int age, double speed, String type) {
		super(name, gender, habitat, age, speed, type);
	}

	// methods

	// Overriden methods from parent class
	@Override
	public void move() {
		System.out.println("Whale is moving!");
	}

	@Override
	public void sound() {
		System.out.println("Whale's sound!");
	}

	@Override
	public void eat() {
		System.out.println("Whale is eating!");
	}

	@Override
	public void sleep() {
		System.out.println("Whale is sleeping!");
	}

	@Override
	public String toString() {
		return "Name: " + super.name + ", " + "Type: " + this.type + ", " + "Gender: " + super.gender + ", "
				+ "Habitat: " + super.habitat + ", " + "Age: " + super.age + ", " + "Speed: " + super.speed;
	}

	// Overriden method from Swimmer interface
	@Override
	public void swim() {
		System.out.println("Whale is swimming!");
	}
}
