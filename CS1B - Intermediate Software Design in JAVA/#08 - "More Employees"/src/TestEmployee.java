/**
 * One object of class TestEmployee tests the method raise() in class Employee
 * One object of class TestEmployee tests the subclass Manager and Worker
 * One object of class TestEmployee tests the method getCounter() in class Employee
 * @author johnlaw
 */
public class TestEmployee {
	public static void main (String args[]){
		Employee employee_1 = new Employee();
		Manager employee_2 = new Manager();
		Worker employee_3 = new Worker();
		System.out.println("Create the default of class Employee, Manager and Worker:");
		System.out.println("No.1: " + employee_1);
		System.out.println("No.2: " + employee_2);
		System.out.println("No.3: " + employee_3);
		System.out.println("Set the information of a employee, manager and worker:");
		Employee employee_4 = new Employee("Mary","987654321",10);
		Manager employee_5 = new Manager("John","123456789",100, "JAVA Manager", 50);
		Worker employee_6 = new Worker("Jack","123456789",10, "John", "Furniture");
		System.out.println("No.4: " + employee_4);
		System.out.println("No.5: " + employee_5);
		System.out.println("No.6: " + employee_6);
		System.out.println("The employee, manager and worker get 10% raise in their salary: ");
		employee_1.raise(10);
		employee_2.raise(10);
		employee_3.raise(10);
		employee_4.raise(10);
		employee_5.raise(10);
		employee_6.raise(10);
		System.out.println("No.1: " + employee_1);
		System.out.println("No.2: " + employee_2);
		System.out.println("No.3: " + employee_3);
		System.out.println("No.4: " + employee_4);
		System.out.println("No.5: " + employee_5);
		System.out.println("No.6: " + employee_6);
		System.out.println("The total number of Employee:");
		System.out.println(employee_1.getCounter());
	}
}
/**
 * Console:
 * Create the default of class Employee, Manager and Worker:
 * No.1: Name: null, SSN: null, Salary: 0.0
 * No.2: Name: null, SSN: null, Salary: 0.0, Title: null, Bouns: 0.0
 * No.3: Name: null, SSN: null, Salary: 0.0, Boss: null, Department: null
 * Set the information of a employee, manager and worker:
 * No.4: Name: Mary, SSN: 987654321, Salary: 10.0
 * No.5: Name: John, SSN: 123456789, Salary: 100.0, Title: JAVA Manager, Bouns: 50.0
 * No.6: Name: Jack, SSN: 123456789, Salary: 10.0, Boss: John, Department: Furniture
 * The employee, manager and worker get 10% raise in their salary: 
 * No.1: Name: null, SSN: null, Salary: 0.0
 * No.2: Name: null, SSN: null, Salary: 0.0, Title: null, Bouns: 0.0
 * No.3: Name: null, SSN: null, Salary: 0.0, Boss: null, Department: null
 * No.4: Name: Mary, SSN: 987654321, Salary: 11.0
 * No.5: Name: John, SSN: 123456789, Salary: 110.0, Title: JAVA Manager, Bouns: 50.0
 * No.6: Name: Jack, SSN: 123456789, Salary: 11.0, Boss: John, Department: Furniture
 * The total number of Employee:
 * 6
 */ 
