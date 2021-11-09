import java.text.DecimalFormat;

public class Circle extends Shape {
	// var
	private double radius;
	private static final DecimalFormat df = new DecimalFormat("0.00");

	// constructor
	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;
	}

	// getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// methods

	@Override
	public void computeArea() {
		super.area = Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle with:\n" + "Radius: " + this.radius + "\n" + "Has the Area: " + df.format(super.area) + "\n";
	}
}
