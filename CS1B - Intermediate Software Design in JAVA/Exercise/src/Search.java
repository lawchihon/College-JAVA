/**
 * Searches through an array of random ints
 * @author johnlaw
 */
import java.util.Random;
public class Search {
	public static void main(String args[]){
		final int MAX = 10;
		int array [];
		array = new int [MAX];
		Random rand = new Random();
		for (int i = 0; i < MAX; i++)
			array[i] = rand.nextInt()%11;
		System.out.print(array[0]);
		for (int i = 1; i < MAX; i++)
			System.out.print("," + array[i]);
		System.out.println(".");
		
		// search through array looking for target
		int target = 9;
		boolean found = false;
		int i = 0;
		while (!found && i < MAX){
			if (array[i++]==target){
				found = true;
			}
		}
		if (found)
			System.out.println("The target " + target + " is in the array list.");
		else
			System.out.println("The target " + target + " is not in the array list.");
	}		
}
/**
 * Console:
 * 1,3,-8,-2,-1,8,-1,-8,-3,4.
 * The target 9 is not in the array list.
 */
