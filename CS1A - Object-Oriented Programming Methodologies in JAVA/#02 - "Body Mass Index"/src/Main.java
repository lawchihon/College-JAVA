/*  Asks the user for his/her height and his/her weight.
 *  Reads the user's responses.
 *  Calculates and prints his/her BMI.
 */

//This is use to import the scanner for the program can receive the user's input
import java.util.Scanner;

class Main {
	private boolean x;
	public static void main(String args[]) {
		// open the variables to store the user's height
		int height;
		// open the variables to store the user's weight
		int weight;
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		// ask to input the height
		System.out.print("Input your height (in centimeters): ");
		// read the input of height
		height = myScanner.nextInt();
		// ask to input the weight
		System.out.print("Input your weight (in kilograms): ");
		// read the input of weight
		weight = myScanner.nextInt();
		// to have the blank line for clear format
		System.out.println("");
		// calculates and prints the BMI
		System.out.println("Your BMI is: "
				+ (weight / (Math.pow((double) height / 100, 2))));
		Main test = new Main();
		System.out.println(test.x);
	}
}
/*
 * The Console:
 * Input your height (in centimeters): 180
 * Input your weight (in kilograms): 68
 * 
 * Your BMI is: 20.98765432098765
 */