/*
 * HW5 Exercise 1
 * @author Truong Phu VU
 * @since 11/7/2021
 */
public class Triangle extends Shape {
	private double height, base;

	// constructors
	Triangle() {

	}

	Triangle(double height, double base) {
		this.height = height;
		this.base = base;

	}

	// getters and setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	// method
	@Override
	public void computeArea() {
		super.area = (height * base) / 2;
	}

	// toString
	@Override
	public String toString() {
		return "Triangle with:\n" +"Height: " + this.height + "\n" + "Base: " + this.base + "\n" + "Has the Area: " + super.area + "\n";
	}

}
