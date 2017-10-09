/**
 * Defines a reusable class Rectangle. One object of class Rectangle stores the
 * height and width of a Rectangle.
 */
public class Rectangle implements java.io.Serializable{
	private int height; // height is a data member
	private int width; // width is a data member
	/**
	 * Sets the value for height to "newHeight".
	 */
	public void setHeight(int newHeight) { // newHeight is a parameter
		height = newHeight;
	}
	/**
	 * Sets the value for width to "newWidth".
	 */
	public void setWidth(int newWidth) { // newWidth is a parameter
		width = newWidth;
	}
	/**
	 * Returns the value of height.
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * Returns the value of width to "newWidth".
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * Returns a String containing the height and width of the Rectangle
	 */
	public String toString() {
      return ("height = " + height + ", " + "width = " + width );
    }
	/**
	 * @return
	 */
	public int area() {
		return height*width;
	}
	public void drawRectangle(){
		int h;
		for (h = 1; h <= height; ++h ){
			int w;
			//print width number of stars
			for (w = 1; w <= width; ++w) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public Rectangle(){
		height = 99;
		width = 99;
	}
	public Rectangle(int h, int w){
		height = h;
		width = w;
	}
}