/**
 * Homework 1 Exercise 5
 * Animal class
 * 
 * @author Phu Vu
 * @since 09/07/2021
 */

public class Animal {
	protected String name, gender, habitat, type;
	protected int age;
	protected double speed;

	// constructor
	public Animal() {
		
	}
	public Animal(String name, String gender, String habitat, int age, double speed, String type) {
		this.name = name;
		this.gender = gender;
		this.habitat = habitat;
		this.age = age;
		this.speed = speed;
		this.type = type;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	// methods
	public void move() {
		System.out.println("Moving!");
		System.out.println();
	}

	public void sound() {
		System.out.println("Sound!");
		System.out.println();
	}

	public void eat() {
		System.out.println("Eating!");
		System.out.println();
	}

	public void sleep() {
		System.out.println("Sleeping!");
		System.out.println();
	}

	public String toString() {
		return "Name: " + this.name + " " + "Gender: " + this.gender + "Habitat: " + this.habitat + " " + "Age: "
				+ this.age + " " + "Speed: " + this.speed;
	}
	
}
