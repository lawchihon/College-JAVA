import java.util.ArrayList;
import java.util.Collections;

public class IntegersInAnArrayList {
	public static void main(String ags[]){
		Integer intObject;
		intObject = new Integer(5);
		System.out.println(intObject.intValue());
		
		ArrayList<Integer> arrayList;
		arrayList = new ArrayList<Integer>();
		arrayList.add(new Integer(4));
		arrayList.add(new Integer(3));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(0));
		arrayList.add(intObject);
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}
/**
 * Console:
 * 5
 * [4, 3, 2, 1, 0, 5]
 * [0, 1, 2, 3, 4, 5]
 */
