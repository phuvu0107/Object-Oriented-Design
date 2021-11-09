/**
 * Racoon class
 * 
 * @author Phu Vu
 * @since 09/07/2021
 */
public class Racoon extends Animal implements Scratcher {

	// constructor
	public Racoon(String name, String gender, String habitat, int age, double speed, String type) {
		super(name, gender, habitat, age, speed, type);
	}

	// methods

	// Overriden methods from parent class
	@Override
	public void move() {
		System.out.println("Racoon is moving!");

	}

	@Override
	public void sound() {
		System.out.println("Racoon's sound!");

	}

	@Override
	public void eat() {
		System.out.println("Racoon is eating!");

	}

	@Override
	public void sleep() {
		System.out.println("Racoon is sleeping!");

	}

	@Override
	public String toString() {
		return "Name: " + super.name + ", " + "Type: " + this.type + ", " + "Gender: " + super.gender + ", "
				+ "Habitat: " + super.habitat + ", " + "Age: " + super.age + ", " + "Speed: " + super.speed;
	}

	// Overriden methods from Scratcher interface
	@Override
	public void scratch() {
		System.out.println("Racoon is scratching!");
	}
}
