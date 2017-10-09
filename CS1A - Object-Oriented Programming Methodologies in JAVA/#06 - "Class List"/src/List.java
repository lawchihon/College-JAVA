/**
 * Defines a reusable class List. One object of class List 
 * stores and manipulates a list of integer values.
 */
import java.util.Random;
public class List{
	public int[] listNum;
	public int totalOfList;
	/**
	 * Constructs a List with numInts values of type integer
	 */
	public List (final int numInts){
		totalOfList = numInts;
		listNum = new int[numInts];      // allocates 10 int variables 	     
	}
	/**
	 * Returns a String containing all the elements in the array
	 */
	public String toString(){
		int i;
		String result = Integer.toString(listNum [0]);
		for (i = 1; i < totalOfList; ++i) {
			result = result + ", " +listNum [i];
		}
		return (result);
	}
	/**
	 * Stores pseudorandom integers into every element of the array
	 */
	public void fillWithRandom(){
	      Random r;
	      r = new Random();
	      int i;
	      for (i = 0; i < totalOfList; ++i) {
	    	  listNum [i] = r.nextInt();
	       }
	}
	/**
	 * Returns the smallest int of all the values currently stored in the List
	 */
	public int smallest(){
		int i;
		int smallestValue;
		smallestValue = listNum[0];
	    for (i = 0; i < totalOfList; ++i) {
	    	if (listNum[i] < smallestValue)
	    		smallestValue = listNum[i];
	    }
	    return smallestValue;
	}
	/**
	 * returns the sum of all the ints in the List
	 */
	public int total(){
		int i;
		int sumOfValue;
		sumOfValue = 0;
	    for (i = 0; i < totalOfList; ++i) {
	    	sumOfValue = sumOfValue + listNum[i];
	    }
	    return sumOfValue;
	}
	/**
	 * returns the average of all the ints currently stored in the List
	 */
	public double average(){
		double averageValue;
		averageValue = total()/totalOfList;
		return averageValue;
	}
}
