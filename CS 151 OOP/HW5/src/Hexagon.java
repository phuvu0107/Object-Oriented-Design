import java.text.DecimalFormat;

public class Hexagon extends Shape {
	// var
	private double side;
	private static final DecimalFormat df = new DecimalFormat("0.00");

	// constructor
	Hexagon() {

	}

	Hexagon(double side) {
		this.side = side;
	}

	// getter and setter
	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// method
	@Override
	public void computeArea() {
		super.area = (3 * Math.sqrt(3.0) * side) / 2;
	}

	@Override
	public String toString() {
		return "Hexagon with:\n" + "Side: " + this.side + "\n" + "Has the Area: " + df.format(super.area) + "\n";
	}
}
