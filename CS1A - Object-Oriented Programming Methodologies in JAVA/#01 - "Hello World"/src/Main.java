/**
 * Creates a Window with the message "Hello, World!"
 */
import javax.swing.JFrame;

class Main { // must be capital name
	public static void main(String args[]) {
		JFrame myWindow;
		myWindow = new JFrame();
		myWindow.setSize(300, 200);
		myWindow.setTitle("Hello World");
		myWindow.setVisible(true);
	}
}
