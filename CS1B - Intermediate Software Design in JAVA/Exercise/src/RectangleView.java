/**
 * 
 * One object of this class is a program contain console through which the user interacts.
 * @author johnlaw 01/09/2013
 * 
 * Contains methods to read and print Rectangle objects
 * @author johnlaw 01/14/2013
 */
import java.util.*;
public class RectangleView {
	private Scanner scan; // = new Scanner(System.in)
	public RectangleView(){
		scan = new Scanner(System.in);
	}
	/**
	 * Read the data from console
	 * @author johnlaw 01/09/2013
	 * 
	 * prompts and reads into a Rectangle object
	 * @author johnlaw 01/14/2013
	 */
	public void read(Rectangle rectangle){
		double length; // LOCAL variable
		double width; // LOCAL variable
		String inputFromUser;
		
		System.out.print("Please type the length: ");
		try{
			inputFromUser = scan.nextLine(); // "x"
			length = Double.parseDouble(inputFromUser);
		}catch (Exception e){
			length = 0;
			this.read(rectangle);
		}
		System.out.print("Please type the width: ");
		inputFromUser = scan.nextLine(); // "x"
		width = Double.parseDouble(inputFromUser);
		rectangle.initialize(length, width); // non private method
	}
	/**
	 * print the data of the Rectangle
	 * @author johnlaw 01/09/2013
	 * 
	 * prints a Rectangle object to console
	 * @author johnlaw 01/14/2013
	 */
	public void write(Rectangle r){
		System.out.println(r);
	}
}
