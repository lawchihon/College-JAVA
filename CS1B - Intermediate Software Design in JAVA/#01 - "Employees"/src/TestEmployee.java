/**
 * Test the public methods in "Employee" class
 * @author johnlaw
 */
public class TestEmployee {
	public static void main (String args[]){
        Employee employee_1;
        employee_1 = new Employee ();
        System.out.println(employee_1.toString());
        Employee employee_2;
        employee_2 = new Employee ("John","123456789",0);
        System.out.println(employee_2.toString());
	}
}
/**
 * The Console:
 * Name: null, SSN: null, Salary: 0.0
 * Name: John, SSN: 123456789, Salary: 0.0
 * 
 * Comments:
 * Great job, but there is no need to call toString() explicitly from main()
 */