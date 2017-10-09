/**
 *  Asks the user for the size of her gas tank and for the number of
 *  miles she can drive on one tank of gas. Reads the user's responses.
 *  Calculates and prints the miles per gallon.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
class Lesson2 {
	public static void main(String args[]) {
		int milesPerTank;
		int gallonsPerTank;
		double milesPerGallon;
		//Start to create the new format for correct to nearest 2 d.p.
		DecimalFormat myFormatter;
		myFormatter = new DecimalFormat("0.00");
		
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		System.out.println("Gallon capacity in your tank?");
		milesPerTank = myScanner.nextInt();
		System.out.println("Miles you can drive on one tank?");
		gallonsPerTank = myScanner.nextInt(); 
		milesPerGallon = (double) milesPerTank / gallonsPerTank;
		System.out.println("Miles per gallon = " + myFormatter.format(milesPerGallon));
	}
}

/**
 *Gallon capacity in your tank?
 *35
 *Miles you can drive on one tank?
 *35
 *Miles per gallon = 1.00
 */