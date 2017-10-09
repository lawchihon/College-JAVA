import javax.swing.*;
class Lesson6 {
	public static void main(String args[]) {
		Rectangle floor;
		floor = new Rectangle(); // constructs (allocates space for) an object
		floor.setHeight(3);
		floor.setWidth(2);
		System.out.println("Here is the floor:" + floor);
		
		Rectangle ceiling;
		floor.setHeight(88);
		ceiling = floor;
		//floor.setHeight(99);
		System.out.println("Here is the floor:" + ceiling);
		
		//static method: variable that you can call without an object
		JOptionPane.showMessageDialog(null, "Hello");
	}
}
/**
 * Here is the floor:height = 3, width = 2
 * Here is the floor:height = 88, width = 2
 */