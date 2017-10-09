/**
 * One object of class TestEmployeeList tests the cloning ability of "EmployeeList" class
 * @author johnlaw
 */
public class TestEmployeeList {
	public static void main (String args[]){
		EmployeeList employeeList_1;
		employeeList_1 = new EmployeeList();
		EmployeeList employeeList_2;
		employeeList_2 = new EmployeeList();
		Employee employee_1 = new Employee();
		Employee employee_2 = new Employee();
		Employee employee_3 = new Employee();
		employee_1 = new Employee("John","123456789",0);
		employee_2 = new Employee("Mary","987654321",0);
		employee_3 = new Employee("Jack","123456789",0);
		try{
			employeeList_1.add(employee_1);
			employeeList_1.add(employee_2);
		}
		catch (Exception e){
			System.out.println(e);
		}
		employeeList_2 = (EmployeeList)employeeList_1.clone();
		System.out.println("List 1: \n" + employeeList_1);
		System.out.println("List 2: \n" + employeeList_2);
		try{
			employeeList_1.add(employee_3);
		}
		catch (Exception e){
			System.out.println(e);
		}
		System.out.println("List 1: \n" + employeeList_1);
		System.out.println("List 2: \n" + employeeList_2);
		employeeList_1 = new EmployeeList();
		System.out.println("List 1: \n" + employeeList_1);
		System.out.println("List 2: \n" + employeeList_2);
	}
}
/**
 * Console:
 * List 1: 
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * List 2: 
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * List 1: 
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * Name: Jack, SSN: 123456789, Salary: 0.0
 * List 2: 
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * List 1: 
 * There are nothing in the EmployeeList.
 * List 2: 
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 */ 
