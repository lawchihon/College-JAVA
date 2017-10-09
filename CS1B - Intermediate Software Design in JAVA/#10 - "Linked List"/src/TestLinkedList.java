/**
 * One object of this class TestLinkedList stores Employee, Manager and Worker objects in the List
 * prints the List to see they got in there
 * uses raise() and prints it again to check whether it is work.
 * @author johnlaw
 */
public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList list;
		list = new LinkedList();
		Employee employee_1 = new Employee("Mary","987654321",10);
		Manager employee_2 = new Manager("John","123456789",100, "JAVA Manager", 50);
		Worker employee_3 = new Worker("Jack","123456789",10, "John", "Furniture");
		list.recursiveAddAtend(employee_1);
		list.recursiveAddAtend(employee_2);
		list.recursiveAddAtend(employee_3);
		System.out.println(list);
		System.out.println("Gives 10% raise in salary for all the employee in the list:");
		list.raise(10);
		System.out.println(list);
		new GuiView();
		}
}
/**
 * Console:
 * Name: Mary, SSN: 987654321, Salary: 10.0
 * Name: John, SSN: 123456789, Salary: 100.0, Title: JAVA Manager, Bouns: 50.0
 * Name: Jack, SSN: 123456789, Salary: 10.0, Boss: John, Department: Furniture
 * 
 * Gives 10% raise in salary for all the employee in the list:
 * Name: Mary, SSN: 987654321, Salary: 11.0
 * Name: John, SSN: 123456789, Salary: 110.0, Title: JAVA Manager, Bouns: 50.0
 * Name: Jack, SSN: 123456789, Salary: 11.0, Boss: John, Department: Furniture
 */