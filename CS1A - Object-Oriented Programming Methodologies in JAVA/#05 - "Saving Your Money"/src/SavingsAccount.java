/**
 * Defines a reusable class SavingsAccount. One object of class SavingsAccount 
 * gets the information for initial deposit, monthly interest and years to save.
 * One calculates the future investment value.
 * One returns the future investment value.
 */
import java.text.DecimalFormat;
public class SavingsAccount {
	private double initialDeposit; // country is a data member
	private double annualinterestrate;
	/**
	 * Sets the value for initial deposit to "newDeposite".
	 */
	public void setDeposit(int newDeposit) {
		initialDeposit = newDeposit;
	}
	/**
	 * Sets the value for monthly interest rate to "newAnnualInterestRate".
	 */
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualinterestrate = newAnnualInterestRate;
	}
	/**
	 * calculates the future investment value
	 * @return
	 */
	public double futureInvestmentValue(int years){
		DecimalFormat myFormatter;
		myFormatter = new DecimalFormat("0.00");
		return Double.parseDouble(myFormatter.format(initialDeposit * Math.pow((1 + annualinterestrate/12), (years*12))));
	}
}
