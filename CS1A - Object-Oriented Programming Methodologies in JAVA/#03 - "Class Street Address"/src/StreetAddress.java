/**
 * Defines a reusable class StreetAddress. One object of class StreetAddress
 * stores the house, city, state, zip and country of a Street Address.
 */
public class StreetAddress {
	private String house; // house is a data member
	private String city; // city is a data member
	private String state; // state is a data member
	private String zip; // zip is a data member
	private String country; // country is a data member
	/**
	 * Sets the value for house to "newHouse".
	 */
	public void setHouse(String newHouse) {
		house = newHouse;
	}
	/**
	 * Sets the string for city to "newCity".
	 */
	public void setCity(String newCity) {
		city = newCity;
	}
	/**
	 * Sets the string for state to "newState".
	 */
	public void setState(String newState) {
		state = newState;
	}
	/**
	 * Sets the string for zip to "newZip".
	 */
	public void setZip(String newZip) {
		zip = newZip;
	}
	/**
	 * Sets the string for country to "newCountry".
	 */
	public void setCountry(String newCountry) {
		country = newCountry;
	}
	/**
	 * Returns a String containing the Street Address
	 */
	public String toString() {
		return (house + "\n" + city + ", " + state + " " + zip + "\n" + country);
	}
}