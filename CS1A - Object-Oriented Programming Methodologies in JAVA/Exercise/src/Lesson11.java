import java.util.Random;
import java.util.Scanner;
public class Lesson11 {
	private static final int NUMINTS =10;
	public static void main(String args[]){
		int[] list;	//declares the array
		list = new int[NUMINTS];	//allocates 10 int variables
		list[NUMINTS-1] = 0;	//run time error if list[NUMINTS]
		
		Random r;
		r = new Random();
		int i;
		for (i = 0; i < NUMINTS; ++i){
			list[i] = r.nextInt();
		}
		System.out.println(list);
		for (i = 0; i < NUMINTS; i++){
			System.out.println("[" + (i+1) + "] = " +list[i]);
		}
		//WRITE A LOOP THAT PROMPTS FOR AND READ VALUES INTO list
		Scanner scanner;
		scanner = new Scanner(System.in);
		for (i = 0; i <NUMINTS; i++){
			System.out.println("Please enter number: "+(i+1)+": ");
			list[i] = scanner.nextInt();
		}
		for (i = 0; i < NUMINTS; i++){
			System.out.println("[" + (i+1) + "] = " +list[i]);
		}
	}

}
