import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class GUI{
	public static void main (String args[]){
		String name;
		name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + name + ". This is a science department.");
		MyFrame myWindow;
		myWindow = new MyFrame();
	}
}
