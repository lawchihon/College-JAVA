/**
 * Tests class Rectangle, including the new area() method.
 */

public class Lesson9 {
   public static void main (String args[]) {
      Rectangle floor;
      floor = new Rectangle ();   // constructs (allocates space for) an object
      floor.setHeight(3);
      floor.setWidth(2);
      System.out.println("height should be 3: "+ floor.getHeight());
      System.out.println("width should be 2: " + floor.getWidth());
      System.out.println("area should be 6: " + floor.area());
      System.out.println("Here is the floor:" + floor);
      Rectangle ceiling;
      ceiling = new Rectangle();   // constructs a second Rectangle object
      ceiling.setHeight(5);
      ceiling.setWidth(6);
      System.out.println("height should be 5: "+ ceiling.getHeight());
      System.out.println("width should be 6: " + ceiling.getWidth());
      System.out.println("area should be 30: " + ceiling.area());
      System.out.println("Here is the ceiling:" + ceiling);
      floor.area(); //what is wrong with this method call?
      
      for (int count = 1; count <= 5; count ++){
    	  System.out.println(count);
      }
   }
}
/**
 * height should be 3: 3
 * width should be 2: 2
 * area should be 6: 6
 * Here is the floor:height = 3, width = 2
 * height should be 5: 5
 * width should be 6: 6
 * area should be 30: 30
 * Here is the ceiling:height = 5, width = 6
 * 1
 * 2
 * 3
 * 4
 * 5
 */
