import java.io.Serializable;

/**
 * One object of this class represents one Rectangle's length and width.
 */
public class Rectangle implements Comparable <Rectangle>, Serializable{
	private double length; // instance variable
	
	private double getLength() {
		return length;
	} // getter

	void setLength(double newLength) {
		length = newLength;
	} // setter

	private double width;

	private double getWidth() {
		return width;
	} // getter

	private void setWidth(double width) {
		this.width = width;
	} // setter

	void initialize(double initLength, double initWidth) {
		this.setLength(initLength);
		this.setWidth(initWidth);
	}

	public Rectangle() {
		this.initialize(0, 0);
	}

	public Rectangle(double l, double w) {
		this.initialize(l, w);
	}

	/**
	 * Returns the area of the Rectangle that called it.
	 */
	public double calculateArea() {
		return this.getLength() * this.getWidth();
	}

	public String toString() {
		return "length= " + this.getLength() + ", and width= " + this.getWidth();
	}
	
	/**
	 * @author johnlaw 01/28/2013
	 */
	public int compareTo(Rectangle obj){
		return (int)(this.calculateArea() - ((Rectangle)obj).calculateArea());
	}

}