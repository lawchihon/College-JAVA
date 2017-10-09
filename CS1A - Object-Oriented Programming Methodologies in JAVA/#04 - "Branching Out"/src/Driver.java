/**
 * Defines a reusable class Driver. One object of class Driver 
 * asks the user for his/her age, number of tickets and value of car.
 * One reads the user's responses.
 * One returns the premium.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Driver {
	private int age; // house is a data member
	private int tickets; // city is a data member
	private int carvalue; // state is a data member
	private double agepercent;
	private double ticketspercent;

	/**
	 * asks the user for his/her age, number of tickets and value of car. reads
	 * the user's responses.
	 */
	public void read() {
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		System.out.print("Driver's Age? ");
		age = myScanner.nextInt();
		System.out.print("Number of Tickets? ");
		tickets = myScanner.nextInt();
		System.out.print("Value of Car? ");
		carvalue = myScanner.nextInt();
	}

	/**
	 * calculates the driver's premium
	 * 
	 * @return
	 */
	public String premium() {
		DecimalFormat myFormatter;
		myFormatter = new DecimalFormat("0.00");
		if (age < 25) {
			agepercent = 1.15;
		} 
		else {
			if ((age <= 29) && (age >= 25)) {
				agepercent = 1.10;
			} else {
				agepercent = 1;
			}
		}
		switch (tickets) {
			case 1:
				ticketspercent = 1.1;
                break;
			case 2:
				ticketspercent = 1.25;
                break;
			case 3:
				ticketspercent = 1.5;
                break;
			default:
				ticketspercent = 0;
		}
		return myFormatter.format((carvalue * .05) * agepercent * ticketspercent);
	}
}