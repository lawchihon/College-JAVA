/*
 * one object of class Currency represents one dollar/cent amount
 */
public class Currency {
	private int dollars;
	private int cents;
	/* sets the member variable dollars to "newDollars"
	 */
	public void setDollars(int newDollars) {
		dollars = newDollars;
	}
	/* sets the member var cents to "newCents"
	 */
	public void setCents(int newCents){
		cents = newCents;
	}
	public void setCurrency1 (double newValue) {
		dollars = (int)newValue;
		cents = (int)((newValue - dollars) * 100);
	}
	public void setCurrency2 (int newDollars, int newCents) {
		dollars = newDollars;
		cents = newCents;
	}
	public String toString() {
	      return ("Dollars = " + dollars + ", " + "Cents = " + cents);

	}    		  
}
