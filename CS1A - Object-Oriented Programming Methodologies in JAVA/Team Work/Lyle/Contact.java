package Lyle;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
//*******************************************************************************************************************
//I fixed the comments to be in standard comment format. fixed the comment to appear before the text they represent.
/**
 * Holds the Information for one Contact
 * @Author=Omar Abbasi
 */
public class Contact implements Serializable {
	private String firstName; // Member Variable
	private String lastName; // Member Variable
	private StreetAddress streetAddress; // Member Variable
	private String emailAddress; // Member Variable
	private String phoneNumber; // Member Variable
	private String notes; // Member Variable
	private transient Scanner scanner = new Scanner(System.in);
	
	/**
	 * Default Constructor
	 */
	//I put this back to the top @John Law
	public Contact() {
		firstName=null;
		lastName=null;
		emailAddress=null;
		phoneNumber=null;
		notes=null;
		streetAddress = new StreetAddress();
		
	} 

	
	/**
	 * Sets Variable firstName.
	 */
	public void setFirstName(String s) {
		firstName = s;
	}
	

	/**
	 * returns Variable firstName.
	 */
	public String getFirstName() {
		return firstName;
	}
	

	/**
	 * Sets Variable lastName.
	 */
	public void setLastName(String s) {
		lastName = s;
	}
	

	/**
	 * Returns Variable lastName.
	 */
	public String getLastName() {
		return lastName;
	}
	

	/**
	 * sets Object streetAddress
	 * @Omar
	 */
	public void setStreetAddress(StreetAddress O) {
		streetAddress=O;		
		
	}
	

	/**
	 * returns an Object streetAddress of type StreetAddress.
	 * @Omar
	 */
	public StreetAddress getStreetAddress() {
		return streetAddress;
	}
	

	/**
	 * Sets Variable emailAddress
	 */
	public void setEmailAddress(String s) {
		emailAddress = s;
	}
	

	/**
	 * Returns Variable emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	

	/**
	 * Sets Variable phoneNumber
	 */
	public void setPhoneNumber(String s) {
		phoneNumber = s;
	}
	
	
	/**
	 * Returns Variable phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	

	/**
	 * Sets Variable Notes
	 */
	public void setNotes(String s) {
		notes = s;
	}
	

	/**
	 * Returns Variable Notes
	 */
	public String getNotes() {
		return notes;
	}
	
	
	/**
	 * toString Method Lyle
	 */
	public String toString() {
		return "First Name: " + firstName + "\n" + "Last Name: " + lastName
				+ "\n" + "Street Address: \n" + streetAddress + "\n"
				+ "Email Address: " + emailAddress + "\n" + "Phone Number: "
				+ phoneNumber + "\n" + "Notes: " + notes +"\n";
	}

		
}
