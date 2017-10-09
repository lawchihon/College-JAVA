/**
 * Tests class Rectangle, including the new area() method.
 */

public class Lesson10 {
	public static void main(String args[]) {
		/**
		 * -write method
		 * 	drawRectangle()
		 * that prints the Rectangle object in *'s
		 * ***
		 * ***
		 * ***
		 * ***
		 * height = 4
		 * width = 4
		 */
		Rectangle floor;
		floor = new Rectangle(); // constructs (allocates space for) an object
		floor.setHeight(3);
		floor.setWidth(2);
		floor.drawRectangle();
		/**
		 * Creates two objects of class Rectangle, setting
		 * values for their height and width, and then printing those value to see
		 * that everything works for both objects.
		 */
		floor = new Rectangle(2,3);
		System.out.println(floor.toString());
	}
}
/**
 * **
 * **
 * **
 * height = 2, width = 3
 */