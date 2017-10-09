package Final;
import javax.swing.JOptionPane;
import java.io.*;
/**
 * @Omar Holds and Returns the Values used for a contact's Address
 ********************************************************************************************************************
 * Fixed all of the comments to be in standard form. Fixed spacing.
 */

public class StreetAddress implements Serializable{

		private String house;// House is a Data Member
		private String city;// City is a Data Member
		private String state;// State is a Data Member
		private String country;// Country is a Data Member
		private String zip;// Zip is a Data Member

		
		/**
		 * This is the Constructor.
		 */
		public StreetAddress(){
			house=null;
			city=null;
			state=null;
			country=null;
			zip=null;
		}
		
		/**
		 * Sets the value of House.
		 */
		public void setHouse(String newHouse) {
			house = newHouse;
		}
		
		/**
		 * Returns the value of House.
		 */
		public String getHouse(){
			return house;
		}

		
		/**
		 * Sets the value of City.
		 */
		public void setCity(String newCity) {
			city = newCity;
		}
		
		
		/**
		 * Returns the value of City.
		 */
		public String getCity(){
			return city;
		}

		
		/**
		 * Sets the value of State.
		 */
		public void setState(String newState) {
			state = newState;
		}

		
		/**
		 * Returns the value of State.
		 */
		public String getState(){
			return state;
		}

		
		/**
		 * Sets the value of Country.
		 */
		public void setCountry(String newCountry) {
			country = newCountry;
		}

		
		/**
		 * Returns the value of Country.
		 */
		public String getCountry(){
			return country;
		}

		
		/**
		 * Sets the value of Zip.
		 */
		public void setZip(String newZip) {
			zip = newZip;
		}
		
		
		/**
		 * Returns the value of Zip.
		 */
		public String getZip(){
			return zip;
		}
		
	
		
		/**
		 * returns a String in the standard mailing address format.
		 */
		public String toString() {
			return house + "\n" + city + ", " + state + " " + zip + "\n" + country;
		} 
	}

