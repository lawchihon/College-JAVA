import java.util.Scanner;
/**
 * One object of class EmployeeConsoleView handles the reading and writing of Employee objects.
 * @author johnlaw
 */
public class EmployeeConsoleView {
	private Scanner scan; // = new Scanner(System.in)
	private static final String vaildNamePattern = "[a-z,A-Z]*";
	public EmployeeConsoleView(){
		scan = new Scanner(System.in);
	}
	/**
	 * Prompts and reads into a Employee object
	 */
	public void read(Employee employee){
		String name = null;
		String ssn = null;
		Double salary = null;
		String InputFromUser;
		boolean gotGoodInput = false;
		while (!gotGoodInput){
			System.out.print("Please type the name: ");
			InputFromUser = scan.next();
			if (InputFromUser.matches(vaildNamePattern)){
				name = InputFromUser;
				gotGoodInput = true;
			}
			else{		
				System.out.println("Bad input");
				gotGoodInput = false;
			}
		}	
		gotGoodInput = false;
		while (!gotGoodInput){
		System.out.print("Please type the ssn: ");
		try{
			InputFromUser = scan.next();
			ssn = "" + Integer.parseInt(InputFromUser);
			gotGoodInput = true;
		}catch (NumberFormatException e){
			System.out.println("Bad input");
			gotGoodInput = false;
		}
		}
		gotGoodInput = false;
		while (!gotGoodInput){
		System.out.print("Please type the salary: ");
		try{
			InputFromUser = scan.next(); 
			salary = Double.parseDouble(InputFromUser);
		}catch (Exception e){
			System.out.println("Bad input");
			gotGoodInput = false;
		}
		}
		employee.initialize(name, ssn, salary); // non private method
	}	
}
