/**
 * Homework 1 Exercise 4
 * 
 * @author Phu Vu
 * @since 08/26/2021
 *
 */

public final class Product {
	// variables
	private final String name;
	private final String description;
	private final double price;
	private final int maxQuantity;

	// constructor
	public Product(String name, String description, double price, int maxQuantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.maxQuantity = maxQuantity;
	}

	// getters
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	// method
	@Override
	public String toString() {
		return "Name: " + this.name + "\n" + "Description: " + this.description + "\n" + "Price: " + this.price + "\n"
				+ "Maximum Quantity Allowed: " + this.maxQuantity + "\n";
	}

}
