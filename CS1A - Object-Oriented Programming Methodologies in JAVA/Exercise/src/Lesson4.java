import java.util.Random;
import javax.swing.*;
import java.text.DecimalFormat;
class Lesson4 {
	public static void main(String args[]) {
		// How to Use Math.pow
		System.out.println("2 to the power of 0.5 = " + Math.pow(2, 0.5));
		// How to use operator % (modulo reminder)
		System.out.println("leftover: " + (52 - (52 / 3 * 3)) + " " + (52 % 3));
		// How to use operator ++ & --
		int count;
		count = 0;
		count++; // increment operator
		System.out.println("count: " + (count = count + 1));
		System.out.println("count: " + (count++));
		System.out.println("count: " + count);
		System.out.println("count: " + (++count));
		// How to use operator += & -= & *= & /= & %=
		int price;
		price = 24000;
		price *= (1 + 0.0875);
		System.out.println("price: " + price);
		//Random Program
		Random randomObject;
		randomObject = new Random();
		System.out.println( randomObject.nextInt());
		
		JFrame myWindow;
		myWindow = new JFrame();
		myWindow.setTitle("Hello");
		myWindow.setSize (340,456);
		myWindow.setVisible(true);
		
		DecimalFormat twoDigits;
		twoDigits = new DecimalFormat("0.00");
		System.out.println(twoDigits.format(99.9999999999));
		
		String myName;
		myName = new String("Mickey Mouse");
		System.out.println(myName.toUpperCase());
		System.out.println(myName);
		System.out.println(myName.indexOf('c'));
		System.out.println(myName.indexOf('n'));
	}
}

/**
 * 2 to the power of 0.5 = 1.4142135623730951
 * leftover: 1 1
 * count: 2
 * count: 2
 * count: 3
 * count: 4
 * price: 26099
 * 1227418744
 * 100.00
 * MICKEY MOUSE
 * Mickey Mouse
 * 2
 * -1
 */