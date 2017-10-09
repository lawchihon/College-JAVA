import java.util.ArrayList;
import java.util.Scanner;
/**
 * One object of class Main adds an unlimited number of Employee Objects to the list.
 * @author johnlaw
 */
public class Main{
	public static void main (String args[]){
        Employee employee_1;
        employee_1 = new Employee();
        EmployeeConsoleView view_1;
        view_1 = new EmployeeConsoleView();
        view_1.read(employee_1);
        view_1.write(employee_1);
        Employee employee_2;
        employee_2 = new Employee();
        EmployeeConsoleView view_2;
        view_2 = new EmployeeConsoleView();
        view_2.read(employee_2);
        view_2.write(employee_2);
        System.out.println("Number of Employee: "+employee_1.getCounter());
		ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
		employeeArrayList.add(employee_1);
		employeeArrayList.add(employee_2);
        System.out.println("The List of employee sorted by SSN: ");
		view_1.sort(employeeArrayList);
		Scanner scan;
		scan = new Scanner(System.in);
		String target;
		System.out.print("The first name you want to search: ");
		target = scan.nextLine();
		Employee employee_search;
		employee_search = new Employee(target, null, 0);
		if (employeeArrayList.contains(employee_search)){
			System.out.println(target + " is in thethere.");
		}
		else{
			System.out.println(target + " is NOT in there.");
		}
		System.out.print("The second name you want to search: ");
		target = scan.nextLine();
		employee_search = new Employee(target, null, 0);
		if (employeeArrayList.contains(employee_search)){
			System.out.println(target + " is in there.");
		}
		else{
			System.out.println(target + " is NOT in there.");
		}
	}
}
/**
 * Console:
 * Please type the name: annie
 * Please type the ssn: 987654321
 * Please type the salary: 0
 * Name: annie, SSN: 987654321, Salary: 0.0
 * Please type the name: john
 * Please type the ssn: 123456789
 * Please type the salary: 1000
 * Name: john, SSN: 123456789, Salary: 1000.0
 * Number of Employee: 2
 * The List of employee sorted by SSN: 
 * [Name: john, SSN: 123456789, Salary: 1000.0, Name: annie, SSN: 987654321, Salary: 0.0]
 * The first name you want to search: karen
 * karen is NOT in there.
 * The second name you want to search: john
 * john is in there.
 */