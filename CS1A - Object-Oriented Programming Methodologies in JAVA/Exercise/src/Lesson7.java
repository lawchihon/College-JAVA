
public class Lesson7 {
	public static void main(String args[]){
		double income = 40000; //will read this later on
		if (income > 20000 && income <= 30000)
			System.out.println("first range is true");
		else if (income > 30000 & income <= 40000)
			System.out.println("second range is true");
		else if (income > 40000 & income <= 50000)
			System.out.println("third range is true");
		else if (income > 50000 & income <=60000)
			System.out.println("fourth range is true");
		else if (income > 60000 & income <=70000)
			System.out.println("fifth range is true");

		if (income >60000)
			System.out.println("fifth range is true");
		else /*income <= 60000*/ if (income > 50000)
			System.out.println("fourth range is true");
		else /*income <= 50000*/ if (income > 40000)
			System.out.println("third range is true");
		else /*income <= 40000*/ if (income > 30000)
			System.out.println("second range is true");
		else /*income <= 30000*/ if (income > 20000)
			System.out.println("first range is true");

		int age;
		age = 20; //read later
		if (!(age >= 13 && age <= 18) )
			System.out.println("not a teen");
		else
			System.out.println("is a teen");
		//OR
		if (age <13 || age >19)
			System.out.println("not a teen");
		else
			System.out.println("is a teen");
	}
}
/**
 * second range is true
 * second range is true
 * not a teen
 * not a teen
 */