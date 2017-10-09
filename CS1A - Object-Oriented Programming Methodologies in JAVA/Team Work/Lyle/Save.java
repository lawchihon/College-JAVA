package Lyle;

import java.io.*;
/**
 * Manages the saving and loading of the data for class Contact Manager
 * @author Omar
 *
 */
public class Save implements Serializable{
	/**
	 * Trys to see if contact-list.dat exists, if it exists it loads it, if not it creates a new object of type contact. 
	 * Then returns an object of type contact. @Omar @John
	 */
	public static ContactManager loadFile(ContactManager myContactManager){
		FileInputStream inFile;
		ObjectInputStream inObject;
		try  {
			inFile = new FileInputStream("contact-list.dat");     
			inObject = new ObjectInputStream(inFile);
			myContactManager = (ContactManager)inObject.readObject();
			inFile.close();
			inObject.close();     
		} 
		catch (FileNotFoundException fnfe){
			myContactManager = new ContactManager();
		}
		catch(IOException ioe)  {
			System.out.println ("Error reading from the file: " + ioe.getMessage());
		} 
		catch (ClassNotFoundException cnfe)  {
			System.out.println ("Error in Saving: " + cnfe);
		}
		return myContactManager;
		
		
	}
	/**
	 * Saves object myContactManager to disk as contact-list.day
	 * @Omar @John
	 */

	public static void saveFile(ContactManager myContactManager) {
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try  {
			outFile = new FileOutputStream ("contact-list.dat");     

			outObject = new ObjectOutputStream(outFile);

			outObject.writeObject(myContactManager);

			outFile.close();

			outObject.close();     
		} 
		catch (IOException ioe)  {
			System.out.println ("Error writing objects to the file: "+ ioe.getMessage());
		}

	}

}
