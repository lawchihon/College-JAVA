/**
 * If an object contain Strings, a simple block copy that is: default clone()
 * method, works perfectly
 * 
 * @author johnlaw 01/30/2013
 * 
 */
public class TestName {
	public static void main(String atgs[]) {
		Name myName = new Name();
		myName.setFirst("Mickey");
		Name yourName;
		yourName = myName;
		System.out.println("myName = " + myName);
		  try
		  {
		  Thread.sleep(4000);  
		 
		  }catch (InterruptedException ie)
		  {
		  System.out.println(ie.getMessage());
		  }

		System.out.println("yourname = " + yourName);
		myName.setFirst("Minnie");
		System.out.println("myName = " + myName);
		System.out.println("yourname = " + yourName);
		yourName = (Name) (myName.clone());
		myName.setFirst("Mickey");
		System.out.println("myName = " + myName);
		System.out.println("yourname = " + yourName);
	}
}
/**
 * Console:
 * myName = Mickey null
 * yourname = Mickey null
 * myName = Minnie null
 * yourname = Minnie null
 * myName = Mickey null
 * yourname = Minnie null
 */
