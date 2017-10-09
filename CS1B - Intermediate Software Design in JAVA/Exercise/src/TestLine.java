/**
 * Experiments with making copies of complex Objects.
 */
import java.awt.Point;
public class TestLine {
	public static void main(String args[]){
		Point start;
		start = new Point (10,20);
		Point end;
		end = new Point (20,30);
		Line line1, line2;
		line1 = new Line (start, end);
		line2 = (Line) (line1.clone());
		line1.increment();
		start.x = 0; // x is a public variable in class Point
		System.out.println("line1 = " + line1);
		System.out.println("line2 = " + line2);
	}

}
/**
 * Console:
 * line1 = p1 = java.awt.Point[x=0,y=21], and p2 = java.awt.Point[x=21,y=31]
 * line2 = p1 = java.awt.Point[x=10,y=20], and p2 = java.awt.Point[x=20,y=30]
 */