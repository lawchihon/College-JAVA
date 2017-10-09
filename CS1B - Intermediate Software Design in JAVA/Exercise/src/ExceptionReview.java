public class ExceptionReview {
	public static void main(String args[]){
		int x;
		try {
			x = foo (10);
		} catch (Exception e){
			System.out.println ("Caught an exception: " + e);
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			x = 99;
		}
		System.out.println (x);
	}
	public static int foo (int x) throws Exception
	{
	System.out.println("foo srarted with " + x);
	int temp = bar (x);
	System.out.println("foo returning " + temp);
	return temp;
	}
	public static int bar (int y) throws Exception
	{
		System.out.println("bar started with " + y);
		if (y>0)
			throw new Exception ("just a test");
		System.out.println("when is this excuted?");
		return y;
	}
}
/**
 * Console:
 * foo srarted with 10
 * bar started with 10
 * Caught an exception: java.lang.Exception: just a test
 * 99
 */