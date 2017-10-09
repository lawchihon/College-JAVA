package Final;

import java.lang.*;
import java.io.*;
import java.util.Scanner;

/**
 * @Omar Runs the different Methods Required to manage the Contact List. Fixed
 *       the comments to be in the standard comment format. Fixed comments
 *       description to tell you what the comment does not how it does it. Fixed
 *       spacing......
 */
public class ContactManager implements Serializable {
	private final int LISTSIZE = 50;
	private Contact[] contactList = new Contact[LISTSIZE]; // An array to hold
															// all of the
															// contacts
	private transient Scanner scanner = new Scanner(System.in);

	/**
	 * Creates a new contact and fills out the information.
	 * 
	 * @Lyle Modified theClass so that if no LastName is entered then the user
	 *       is notified and the program returns to the main menu.
	 * @John Changed the variable name "c" to "readContactList"
	 */
	public void createContact() {
		Contact readContactList = this.readContact();

		int i = 0;
		while (contactList[i] != null) {
			i++;
		}
		contactList[i] = readContactList;

		if (contactList[i].getLastName().isEmpty() == false) {
			System.out.print(contactList[i]);
		}
		if (contactList[i].getLastName().isEmpty() == true) {
			System.out
					.println("The contact entered was not saved becasue it does not contain a Last Name.");
			System.out.println("Press Enter to return to the main menu.");
			contactList[i] = null;
			scanner.nextLine();
		}

	}

	/**
	 * @Lyle @Omar Reads Contact from the console and returns an object of type
	 *       Contact.
	 * @John Changed the variable name "c" to "readContactList"
	 */
	public Contact readContact() {
		Contact readContactList = new Contact();

		System.out.println("Enter First Name");
		readContactList.setFirstName(scanner.nextLine());
		System.out.println("Enter Last Name");
		readContactList.setLastName(scanner.nextLine());
		System.out.println("Enter Email Address");
		readContactList.setEmailAddress(scanner.nextLine());
		System.out.println("Enter Phone Number");
		readContactList.setPhoneNumber(scanner.nextLine());
		System.out.println("Notes:");
		readContactList.setNotes(scanner.nextLine());
		readContactList.setStreetAddress(this.readStreetAddress());
		return readContactList;
	}

	/**
	 * @Lyle @Omar Reads StreetAddress from the console and returns an object of
	 *       type StreetAddress.
	 * @John Changed the variable name "a" to "readStreetAddress"
	 * 
	 */
	public StreetAddress readStreetAddress() {
		StreetAddress readStreetAddress = new StreetAddress();

		System.out.println("Enter House Address");
		readStreetAddress.setHouse(scanner.nextLine());
		System.out.println("Enter City");
		readStreetAddress.setCity(scanner.nextLine());
		System.out.println("Enter State");
		readStreetAddress.setState(scanner.nextLine());
		System.out.println("Enter Zip Code");
		readStreetAddress.setZip(scanner.nextLine());
		System.out.println("Enter Country");
		readStreetAddress.setCountry(scanner.nextLine());

		return readStreetAddress;
	}

	/**
	 * @John Prints the whole contact list into the Console.
	 * @Lyle Implemented compareTo which sorts the array and prints it in
	 *       alphabetical order according to last name.
	 */
	public void printContactList() {
		for (int j = 0; j < contactList.length; j++) {
			for (int i = j + 1; i < contactList.length; i++) {
				if (contactList[j] != null & contactList[i] != null) {
					if (contactList[i].getLastName().compareToIgnoreCase(
							contactList[j].getLastName()) < 0) {
						Contact t = contactList[j];
						contactList[j] = contactList[i];
						contactList[i] = t;
					}
				}
			}
		}

		for (int i = 0; i < LISTSIZE; ++i) {
			try {
				System.out.println(contactList[i].toString());
			} catch (NullPointerException e) {
			}
		}

	}

	/**
	 * @John Searches for Last Names, then prints any contacts matching to the
	 *       console.
	 * @John If there is no one in the contact list with the given last name,
	 *       the system will display a message to the user telling her that.
	 */
	public void searchLastName() {
		boolean searchFound = false;
		String searchingName;
		System.out.print("The name that you want to search: ");
		searchingName = scanner.next();
		int i = 0;
		for (i = 0; i < LISTSIZE; ++i) {
			try {
				if (searchingName.equals(contactList[i].getLastName())) {
					System.out.println(contactList[i].toString());
					searchFound = true;
				}
			} catch (NullPointerException e) {
			}
		}
		if (!searchFound) {
			System.out
					.println("There is no one in the contact list with the given last name.");
		}
	}

	/**
	 * @John Searches for Email, then prints any contacts matching to the
	 *       console.
	 * @John If there is no one in the contact list with the given email
	 *       address, the system will display a message to the user telling her
	 *       that.
	 */
	public void searchEmail() {
		boolean searchFound = false;
		String searchingEmail;
		System.out.print("The email that you want to search: ");
		searchingEmail = scanner.next();
		int i = 0;
		for (i = 0; i < LISTSIZE; ++i) {
			try {
				if (searchingEmail.equals(contactList[i].getEmailAddress())) {
					System.out.println(contactList[i].toString());
					searchFound = true;
				}
			} catch (NullPointerException e) {
			}
		}
		if (!searchFound) {
			System.out
					.println("There is no one in the contact list with the given last name.");
		}
	}

	/**
	 * @John Searches for Zip Codes, then prints any contacts matching to the
	 *       console.
	 * @John If there is no one in the contact list with the given zip code, the
	 *       system will display a message to the user telling her that.
	 */
	public void searchZipCode() {
		boolean searchFound = false;
		String searchingZipCode;
		System.out.print("The zip code that you want to search: ");
		searchingZipCode = scanner.next();
		int i = 0;
		for (i = 0; i < LISTSIZE; ++i) {
			try {
				if (searchingZipCode.equals(contactList[i].getStreetAddress()
						.getZip())) { // @Omar
					System.out.println(contactList[i].toString());
					searchFound = true;
				}
			} catch (NullPointerException e) {
			}
		}
		if (!searchFound) {
			System.out
					.println("There is no one in the contact list with the given zip code.");
		}
	}

}