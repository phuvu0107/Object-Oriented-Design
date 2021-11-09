/**
 * Homework 2 Create a Business system
 * 
 * @author Phu Vu
 * @since 09/21/2021
 */
public class Address {
	// variables
	private int streetNum;
	private String streetName, city, zip, state;

	// constructor
	Address(int streetNum, String streetName, String city, String zip, String state) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}

	// setters and getters
	public int getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	/*
	 * toString()
	 * display the attributes of Address class
	 */
	@Override
	public String toString() {
		return this.streetNum + " " + this.streetName + " " + this.city + " " + this.state + " " + this.zip + "\n";
	}

}
