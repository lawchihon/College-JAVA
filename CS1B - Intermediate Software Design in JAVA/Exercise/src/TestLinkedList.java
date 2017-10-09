import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.awt.Point;
public class TestLinkedList {
	public static void main(String args[]){
		LinkedList<Point> myList;
		myList = new LinkedList<Point>();
		Point p1;
		p1 = new Point(6,7); // returns boolean
		myList.add(p1);
		myList.add(new Point (1,2));
		myList.add(new Point (4,5));
		System.out.println(myList);
		// call method in interface Collection
		System.out.println(myList.contains(p1));
		if (myList.contains(p1))
			System.out.println("p1 is in myList");
		else
			System.out.println("p1 is NOT in myList");
		Point p2;
		p2 = new Point(1,2);
		System.out.println(myList.contains(p2));
		Point p3;
		p3 = new Point(3,8);
		p1 = p3;
		System.out.println(myList.contains(p1));
		System.out.println(myList.contains(new Point (6,7)));
		myList.add(p3);
		System.out.println(myList.contains(p1));
		ArrayList<Integer> intList;
		intList = new ArrayList<Integer>();
		intList.add(6);
		intList.add(9);
		intList.add(1);
		intList.add(100);
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);
	}
}
/**
 * Console:
 * [java.awt.Point[x=6,y=7], java.awt.Point[x=1,y=2], java.awt.Point[x=4,y=5]]
 * true
 * p1 is in myList
 * true
 * false
 * true
 * true
 * [6, 9, 1, 100]
 * [1, 6, 9, 100]
 */