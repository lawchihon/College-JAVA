/**
 * Test the public methods in "EmployeeConsoleView" class
 * @author johnlaw
 */
public class TestEmployeeConsoleView {
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
	}
}
/**
 * The Console:
 * Please type the name: 123
 * Bad input
 * Please type the name: *&^
 * Bad input
 * Please type the name: John1
 * Bad input
 * Please type the name: John*
 * Bad input
 * Please type the name: John
 * Please type the ssn: ssn
 * Bad input
 * Please type the ssn: *&^
 * Bad input
 * Please type the ssn: 123s
 * Bad input
 * Please type the ssn: 123*
 * Bad input
 * Please type the ssn: 123
 * Please type the salary: salary
 * Bad input
 * Please type the salary: *&^
 * Bad input
 * Please type the salary: 123*
 * Bad input
 * Please type the salary: 123s
 * Bad input
 * Please type the salary: 123
 * Name: John, SSN: 123, Salary: 123.0
 * Please type the name: Mary
 * Please type the ssn: 987654321
 * Please type the salary: 0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 */