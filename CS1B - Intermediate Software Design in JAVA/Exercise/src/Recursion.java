import java.util.Scanner;
public class Recursion {
	public static void main(String args[]){
		Scanner scan;
		scan = new Scanner(System.in);
		String input;
		System.out.print("The number that you want to be factorual: ");
		input = scan.next();
		System.out.println("The answer is " + factorial(Integer.parseInt(input)));
	}
	/**
	 * @return
	 */
	private static int factorial(int result) {
		// recursive: factorial(n) = n * factorial (n - 1)
		// 			  fact (n-1) = (n-1) * (n-2)!
		// 			  fact (n-2) = (n-2) * (n-3)!
		// base case: fact (0) = 1
		// pretend that this method works already
		// so I can call it to help me define this method
		if (result > 0){
			return (result * factorial (result - 1));
		}
		else{
			return 1;
		}
	}
}
