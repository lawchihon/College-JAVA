package Final;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
//*******************************************************************************************************************
//I fixed the comments to be in standard comment format. fixed the comment to appear before the text they represent.

/**
 * @Omar Holds the Information for one Contact
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
	 * @John Put this back to the top 
	 */
	public Contact() {
		firstName = null;
		lastName = null;
		emailAddress = null;
		phoneNumber = null;
		notes = null;
		streetAddress = new StreetAddress();

	}

	/**
	 * Sets Variable firstName.
	 * @John Changed the variable name "s" to "readFirstName"
	 */
	public void setFirstName(String readFirstName) {
		firstName = readFirstName;
	}

	/**
	 * returns Variable firstName.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets Variable lastName.
	 * @John Changed the variable name "s" to "readLastName"
	 */
	public void setLastName(String readLastName) {
		lastName = readLastName;
	}

	/**
	 * Returns Variable lastName.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @Omar sets Object streetAddress
	 * @John Changed the variable name "O" to "readStreetAddress"
	 */
	public void setStreetAddress(StreetAddress readStreetAddress) {
		streetAddress = readStreetAddress;

	}

	/**
	 * @Omar returns an Object streetAddress of type StreetAddress.
	 */
	public StreetAddress getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets Variable emailAddress
	 * @John Changed the variable name "s" to "readEmailAddress"
	 */
	public void setEmailAddress(String readEmailAddress) {
		emailAddress = readEmailAddress;
	}

	/**
	 * Returns Variable emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Sets Variable phoneNumber
	 * @John Changed the variable name "s" to "readPhoneNumber"
	 */
	public void setPhoneNumber(String readPhoneNumber) {
		phoneNumber = readPhoneNumber;
	}

	/**
	 * Returns Variable phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets Variable Notes
	 * @John Changed the variable name "s" to "readNotes"
	 */
	public void setNotes(String readNotes) {
		notes = readNotes;
	}

	/**
	 * Returns Variable Notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @Lyle toString Method 
	 */
	public String toString() {
		return "First Name: " + firstName + "\n" + "Last Name: " + lastName
				+ "\n" + "Street Address: \n" + streetAddress + "\n"
				+ "Email Address: " + emailAddress + "\n" + "Phone Number: "
				+ phoneNumber + "\n" + "Notes: " + notes + "\n";
	}

}