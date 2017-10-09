import java.awt.Point;

public class Line {
	private Point p1;
	private Point p2;

	/**
	 * Sets p1 = start and sets p2 = end.
	 * Note that this doesn't construct new Point objects
	 */
	public Line(Point start, Point end) {
		p1 = start;
		p2 = end;
	}

	/**
	 * Returns a String containing the values for p1 and p2
	 */
	public String toString() {
		return ("p1 = " + p1 + ", and p2 = " + p2);
		
	}
	/**
	 * 
	 */
	public void increment(){
		p1.x++;
		p2.x++;
		p1.y++;
		p2.y++;
	}
	/**
	 * Returns a new independent Line object containing the same values as p1
	 */
	public Object clone(){
		Object returnedValue;
		Point tempp1;
		tempp1 = new Point(this.p1);
		Point tempp2;
		tempp2 = new Point(this.p2);
		Line newLineObject;
		newLineObject = new Line(tempp1, tempp2);
		returnedValue = newLineObject;
		return returnedValue;
	}
}
