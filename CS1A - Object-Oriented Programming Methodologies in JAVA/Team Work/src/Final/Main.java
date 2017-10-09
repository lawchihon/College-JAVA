package Final;
/**
 * @Lyle Imported Scanner.
 */
import java.util.Scanner;
import java.lang.Runtime;
import java.io.*;
/**
 * @Omar Runs the Menu and calls the different methods for the Contacts.
 * 
 * @Lyle 12/1/2012 16:00 hours.
 *
 */
public class Main implements Serializable{
	public static void main(String[] args) {

		//Lyle:  initialized scanner.
		Scanner scanner;
		scanner = new Scanner(System.in);

		int choice=0;
		ContactManager myContactManager = null;
		myContactManager = Save.loadFile(myContactManager); //@Omar
		//as our method "loadFile" did not return the  class "ContactManager" into the Main, we load nothing? @John


		while(choice!=7){
			//Lyle: for testing purposes...
			System.out.print("*****************************************************************\n" +
					"Menu:\n" +
					"1. Create New Contact\n" +
					"2. Print Contact List\n" +
					"3. Search By Last Name\n" +
					"4. Search By Email\n" +
					"5. Search By Zip Code\n" +
					"6. Save\n" +
					"7. Exit \n\n" +
					"Choose the function that you want: ");
			choice = scanner.nextInt();
			switch (choice){
				case 1:
					myContactManager.createContact();
					break;
				case 2:
					myContactManager.printContactList();
					break;
				case 3:
					myContactManager.searchLastName();
					break;
				case 4:
					myContactManager.searchEmail();
					break;
				case 5:
					myContactManager.searchZipCode();
					break;
				case 6:
					Save.saveFile(myContactManager);
					break;
					
				case 7:
					break;
				default:
					System.out.println("Error: Not a Valid Entry");
					break;
			}
	
		}

	}	
}
