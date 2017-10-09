public class Lesson3 {
	public static void main (String args[]){
		int f = 9;
		int h = 7;
		int x = 4;
		f = (int)9.9; //explicit use of cast operator
		System.out.println( (1+h)*(1-f) / ( (3*f) / (Math.pow(h,2)-x) ));
		System.out.println(Math.pow(3,2));
	}

}
/*
-106.66666666666667
*/
