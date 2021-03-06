import java.util.Scanner;
/**
 * Handle the reading and writing of Employee objects.
 * @author johnlaw
 */

public class EmployeeConsoleView {
	private Scanner scan; // = new Scanner(System.in)
	private static final String VAILD_Name_PATTERN = "[a-z,A-Z]*";
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
			try{
				if (InputFromUser.matches(VAILD_Name_PATTERN)){
					name = InputFromUser;
					gotGoodInput = true;
				}
				else{
					throw new Exception ("contains digits or other inappropriate characters ");
				}
			}catch (Exception e){
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
			gotGoodInput = true;
		}catch (Exception e){
			System.out.println("Bad input");
			gotGoodInput = false;
		}
		}
		employee.initialize(name, ssn, salary); // non private method
	}
	/**
	 * Prints a Employee object to console
	 */
	public void write(Employee employee){
		System.out.println(employee);
	}


}