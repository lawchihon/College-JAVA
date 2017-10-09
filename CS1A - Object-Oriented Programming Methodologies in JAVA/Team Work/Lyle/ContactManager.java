package Lyle;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/**
 * Runs the different Methods Required to manage the Contact List.
 * @author Omar Abbasi
 ***********************************************************************************************************************
 *Fixed the comments to be in the standard comment format.
 *fixed comments description to tell you what the comment does not how it does it.
 *fixed spacing......
 */


/**
 * Creates a new contact in an empty part of the array
 */
public class ContactManager implements Serializable{
	private final int LISTSIZE = 50;
	private Contact[] contactList = new Contact[LISTSIZE]; //An array to hold all of the contacts
	private transient Scanner scanner = new Scanner(System.in);
	 
	
	/**
	 * Creates a new contact and fills out the information.	
	 * Lyle: Modified the Class so that if no LastName is entered then the user is notified and the program returns to the main menu.
	 * If 
	 */
	public void createContact(){
		Contact c = this.readContact();
		
		
		
		int i=0;
		while (contactList[i]!=null){
			i++;
		}
		contactList[i] = c;

		
		if(contactList[i].getLastName().isEmpty() == false){
			System.out.print(contactList[i]);
		}
		if(contactList[i].getLastName().isEmpty() == true){
			System.out.println("The contact entered was not saved becasue it does not contain a Last Name.");
			System.out.println("Press Enter to return to the main menu.");
			contactList[i] = null;
			scanner.nextLine();
		}
		
	}

	
	/**
	 * Reads Contact from the console and returns an object of type Contact.	
	 * @Lyle @Omar 
	 */
	public Contact readContact(){
		Contact c = new Contact();
		
		System.out.println("Enter First Name");
		c.setFirstName(scanner.nextLine());
		System.out.println("Enter Last Name");
		c.setLastName(scanner.nextLine());
		System.out.println("Enter Email Address");
		c.setEmailAddress(scanner.nextLine());
		System.out.println("Enter Phone Number");
		c.setPhoneNumber(scanner.nextLine());
		System.out.println("Notes:");
		c.setNotes(scanner.nextLine());
		c.setStreetAddress(this.readStreetAddress());
		return c;
	}
	
	/**
	 * Reads StreetAddress from the console and returns an object of type StreetAddress.	
	 * @Lyle @Omar 
	 */
	public StreetAddress readStreetAddress(){
		StreetAddress a = new StreetAddress();
		
		System.out.println("Enter House Address");
		a.setHouse(scanner.nextLine());
		System.out.println("Enter City");
		a.setCity(scanner.nextLine());
		System.out.println("Enter State");
		a.setState(scanner.nextLine());
		System.out.println("Enter Zip Code");
		a.setZip(scanner.nextLine());
		System.out.println("Enter Country");
		a.setCountry(scanner.nextLine());
		
		return a;
	}
	
	
	/**
	 * Prints the whole contact list into the Console.
	 * @author John Law
	 * Lyle: implemented  compareTo which sorts the array and prints it in alphabetical order according to last name.
	 */
	public void printContactList(){

		
for(int j = 0; j < contactList.length; j++) { 
				for(int i = j + 1; i < contactList.length; i++) { 
					if(contactList[j] != null & contactList[i] != null){
						if(contactList[i].getLastName().compareToIgnoreCase(contactList[j].getLastName()) < 0) { 
						Contact t = contactList[j]; 
						contactList[j] = contactList[i]; 
						contactList[i] = t; 
						}
					}
		}
}


		for (int i = 0; i < LISTSIZE; ++i) {
			try{
				System.out.println(contactList[i].toString());
			}
			catch (NullPointerException e){
			}
		}

		
	}

	
	/**
	 * Searches for Last Names, then prints any contacts matching to the console.
	 * @author John Law
	 */
	public void searchLastName(){
		String searchingName;
		System.out.print("The name that you want to search: ");
		searchingName=scanner.next();
		int i = 0;
		for (i = 0; i < LISTSIZE; ++i) {
			try{
				if (searchingName.equals(contactList[i].getLastName())) {
					System.out.println(contactList[i].toString());
				}
			}
			catch (NullPointerException e){
			}
		}
	}
	
	
	/**
	 * Searches for Email, then prints any contacts matching to the console.
	 * @author John Law
	 */
	public void searchEmail(){
		String searchingEmail;
		System.out.print("The email that you want to search: ");
		searchingEmail=scanner.next();
		int i = 0;
		for (i = 0; i < LISTSIZE; ++i) {
			try{
				if (searchingEmail.equals(contactList[i].getEmailAddress())) {
					System.out.println(contactList[i].toString());
				}
			}
			catch (NullPointerException e){
			}
		}
	}
	
	
	/**
	 *Searches for Zip Codes, then prints any contacts matching to the console.
	 *@author John Law
	 */
	public void searchZipCode(){
		String searchingZipCode;
		System.out.print("The zip code that you want to search: ");
		searchingZipCode=scanner.next();
		int i = 0;
		for (i = 0; i < LISTSIZE; ++i) {
			try{
				if (searchingZipCode.equals(contactList[i].getStreetAddress().getZip())) { //@Omar
					System.out.println(contactList[i].toString());
				}
			}
			catch (NullPointerException e){
			}
		}

	}
	
}
