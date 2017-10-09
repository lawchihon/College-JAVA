/**
 * Practice with JoptionPane.Shows a message dialog and shows are
 */
import javax.swing.JOptionPane;

public class Lesson8 {
	public static void main(String args[]) {
		// Ask name
		String name;
		name = JOptionPane.showInputDialog("What is your name?");
		if (name == "noname")
			name = "noname";
		JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
		int age;
		String userInput;
		// Ask age
		userInput = JOptionPane.showInputDialog("What is your age?");
		age = 0;
		try {
			age = Integer.parseInt(userInput); // convert String to Integer
		} catch (Exception e) {
			age = 0;
		}
		if (age <= 0)
			JOptionPane.showMessageDialog(null, "You blew it.");
		else
			JOptionPane.showMessageDialog(null, "You are " + age
					+ " years old.");
		// Write a while loop that prints just even numbers between 1 & 10
		int count;
		count = 0;
		while (count != 10) {
			count += 2;
			System.out.println(count);
		}
		/**
		 * Practice with the control structures: while, for and
		 *  practice with the ++ operator.
		 */
		int total;
		System.out.println("First Count: ");
		count = 1;
		while (count <= 5) {
			System.out.print(count++);
		}
		System.out.println();
		System.out.print("Second Count: ");
		count = 1;
		while (count++ <= 5) {
			System.out.print(count);
		}
		System.out.println();
		System.out.print("Third Count: ");
		count = 1;
		while (count++ <= 5) {
			System.out.print(count++);
		}
		System.out.println();
		total = 0;
		for (count = 0; count <= 5; ++count) {
			total = total + count;
		}
		System.out.println("Fourth Count: " + total);
		for (total = count = 0; count++ < 5; total = total + count)
			;
		System.out.println("Fifth Count: " + total);
	}
}
/**
 * 2
 * 4
 * 6
 * 8
 * 10
 * First Count: 
 * 12345
 * Second Count: 23456
 * Third Count: 246
 * Fourth Count: 15
 * Fifth Count: 15
 */