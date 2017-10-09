public class Main {
	public static void main(String args[]){
		int i;
		try{
			i = Integer.parseInt("");
		} catch (Exception e){
			System.out.println(e);
			i = 0;
		}
		System.out.println(i);
	}
	double divide (double n, double d) throws Exception
	{ if (d == 0)
		throw (new Exception ("Attempt to divide by zero."));
		return n/d;
	}

}
/**
 * Console:
 * java.lang.NumberFormatException: For input string: ""
 * 0
 */