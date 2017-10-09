import java.util.*;

/**
 * Defines a reusable class List. One object of class List 
 * stores and manipulates a list of integer values.
 */
public class List{
	public int[] listNum;
	public int totalOfList;
	/**
	 * Constructs a List with numInts values of type integer
	 */
	public List (final int numInts){
		totalOfList = numInts;
		listNum = new int[numInts];      // allocates 10 int variables 	     
		this.fill(0);
	}
	/**
	 * Returns a String containing all the elements in the array
	 */
	public String toString(){
		/**int i = 0;
		String result = null;
		if (totalOfList > 0){
			result = Integer.toString(listNum [i]);
			for (i = 1; i < totalOfList; ++i) {
				result = result + ", " +listNum [i];
			}
		}
		*/
		return Arrays.toString(listNum);
	}
	/**
	 * Stores integers into every element of the array
	 */
	public void fill(int num){
	      int i;
	      for (i = 0; i < totalOfList; ++i) {
	    	  listNum [i] = num;
	       }
	}
}
