/**
 * One object of class TestEmployeeList tests the public methods in "EmployeeList" class
 * @author johnlaw
 */
public class TestEmployeeList {
	public static void main (String args[]){
		EmployeeList employeeList;
		employeeList = new EmployeeList();
		System.out.println("First time print out:\n"+employeeList);
		Employee employee_1 = new Employee();
		Employee employee_2 = new Employee();
		Employee employee_3 = new Employee();
		Employee employee_4 = new Employee();
		Employee employee_5 = new Employee();
		Employee employee_6 = new Employee();
		employee_1 = new Employee("John","123456789",0);
		employee_2 = new Employee("Mary","987654321",0);
		employee_3 = new Employee("Jack","123456789",0);
		employee_3 = new Employee("Jenny","987654321",0);
		employee_4 = new Employee("Sam","123456789",0);
		employee_5 = new Employee("Cherry","987654321",0);
		try{
			employeeList.add(employee_1);
			employeeList.add(employee_2);
		}
		catch (Exception e){
			System.out.println(e);
		}
		System.out.println("Second time print out:\n"+employeeList);
		try{
			employeeList.add(employee_3);
			employeeList.add(employee_4);
			employeeList.add(employee_5);
		}
		catch (Exception e){
			System.out.println(e);
		}
		System.out.println("Third time print out:\n"+employeeList);
		try{
			employeeList.add(employee_6);
		}
		catch (Exception e){
			System.out.println(e);
		}
		System.out.println("Fourth time print out:\n"+employeeList);
	}
}
/**
 * 
 * First time print out:
 * There are nothing in the EmployeeList.
 * Second time print out:
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * Third time print out:
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * Name: Jenny, SSN: 987654321, Salary: 0.0
 * Name: Sam, SSN: 123456789, Salary: 0.0
 * Name: Cherry, SSN: 987654321, Salary: 0.0
 * java.lang.Exception: The EmployeeList is full.
 * Fourth time print out:
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * Name: Jenny, SSN: 987654321, Salary: 0.0
 * Name: Sam, SSN: 123456789, Salary: 0.0
 * Name: Cherry, SSN: 987654321, Salary: 0.0
 */ 
