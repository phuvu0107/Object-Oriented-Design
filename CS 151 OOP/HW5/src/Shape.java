/*
 * HW5 Exercise 1
 * @author Truong Phu VU
 * @since 11/7/2021
 */
public class Shape extends Thread {
	//var
	protected double area;

	//setter and getter
	public double getArea() {
		return this.area;
	}
	
	public void setArea(double area) {
		this.area= area;
	}
	// constructor
	Shape() {

	}

	// computeArea()
	public void computeArea() {
	};

	// run method
	public void run() {
		try {
			computeArea();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
