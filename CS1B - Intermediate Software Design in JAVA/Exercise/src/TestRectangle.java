/**
 * Tests class Rectangle by instantiating an object of the class and calling all
 * of the public methods on it.
 * @author johnlaw 01/09/2013
 */
import java.io.*;
public class TestRectangle  {
	public static void main(String args[]) {
		/**
		 * @author johnlaw 01/09/2013 + 01/14/2013
		 */
		Rectangle floor_1;
		floor_1 = new Rectangle(); // calls the default constructor
		RectangleView view;
		view = new RectangleView();
		view.read(floor_1);
		view.write(floor_1);
		
		Rectangle floor_2;
		floor_2 = new Rectangle();
		view.read(floor_2);
		view.write(floor_2);
		
		/**
		 * @author johnlaw 01/28/2013
		 */
		Rectangle r;
		r = new Rectangle(4,7);
		Rectangle s;
		s = new Rectangle(7,4);
		System.out.println(r.compareTo(s));
		/**
		 * @author johnlaw 02/20/2013
		 */
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream("data");
			outObject = new ObjectOutputStream(outFile);
			outObject.writeObject(r);
			outObject.writeObject(s);
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: "
					+ ioe.getMessage());
		}
	}
}
/**
 * Console:
 * length= 1.0, and width= 1.0
 * Please type the length: 5
 * Please type the width: 5
 * length= 5.0, and width= 5.0
 * 0
 */