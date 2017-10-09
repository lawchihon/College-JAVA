/**
 * Tests class List by instantiating two different List object, output the list
 * to see can the class have two different lists in it at the same time, and the two lists are
 * of two different sizes
 * 
 */
public class TestList {
	public static void main(String args[]) {
		List firstList;
		firstList = new List(10);
		System.out.println(firstList.toString());
		firstList.fillWithRandom();
		System.out.println(firstList.toString());
		System.out.println(firstList.smallest());
		System.out.println("Smallest: "+firstList.smallest());
		System.out.println("Total: "+firstList.total());
		System.out.println("Average: "+firstList.average());
		List secondList;
		secondList = new List(5);
		System.out.println(secondList.toString());
		secondList.fillWithRandom();
		System.out.println(secondList.toString());
		System.out.println("Smallest: "+secondList.smallest());
		System.out.println("Total: "+secondList.total());
		System.out.println("Average: "+secondList.average());
	}
}
/**
 * The Console:
 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
 * 1443458003, -505368674, -1258495889, -2104897809, 513334942, 364398917, 540026250, 931598629, 1700457699, 555828885
 * -2104897809
 * Smallest: -2104897809
 * Total: -2114626343
 * Average: -2.11462634E8
 * 0, 0, 0, 0, 0
 * 911238595, -275851725, -1264713228, -140611315, 1453936841
 * Smallest: -1264713228
 * Total: 683999168
 * Average: 1.36799833E8
 */
