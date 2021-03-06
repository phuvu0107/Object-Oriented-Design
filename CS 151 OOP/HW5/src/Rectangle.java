/*
 * HW5 Exercise 1
 * @author Truong Phu VU
 * @since 11/7/2021
 */
public class Rectangle extends Shape {
	// var
	private double length, width;

	// constructor
	Rectangle() {

	}

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// getters and setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// method

	@Override
	public void computeArea() {
		super.area = length * width;
	}

	@Override
	public String toString() {
		return "Rectangle with:\n" + "Length: " + this.length + "\n" + "Width: " + this.width + "\n" + "Has the Area: " + super.area + "\n";
	}

}
