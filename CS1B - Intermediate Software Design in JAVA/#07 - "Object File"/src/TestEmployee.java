import java.io.*;
/**
 * One object of class TestEmployee tests reading and writing a file of Employee
 * @author johnlaw
 */
public class TestEmployee {
	public static void main (String args[]){
		Employee employee_1 = new Employee();
		Employee employee_2 = new Employee();
		Employee employee_3 = new Employee();
		employee_1 = new Employee("Mary","987654321",0);
		employee_2 = new Employee("John","123456789",0);
		employee_3 = new Employee("Jack","123456789",0);
		System.out.println("Before writing:");
		System.out.println (employee_1);
		System.out.println (employee_2);
		System.out.println (employee_3);
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream ("data");
			outObject = new ObjectOutputStream(outFile);
			outObject.writeObject(employee_1);
			outObject.writeObject(employee_2);
			outObject.writeObject(employee_3);
			outFile.close();
			outObject.close();
		} catch (IOException ioe)
		{
			System.out.println ("Error writing objects to the file: "+ ioe.getMessage()); }
		employee_1 = null;
		employee_2 = null;
		employee_3 = null;
		System.out.println("After writing and cleaning the data:");
		System.out.println (employee_1);
		System.out.println (employee_2);
		System.out.println (employee_3);
		FileInputStream inFile;
		ObjectInputStream inObject;
		try {
			inFile = new FileInputStream("data");
			inObject = new ObjectInputStream(inFile);
			employee_1 = (Employee)inObject.readObject();
			employee_2 = (Employee)inObject.readObject();
			employee_3 = (Employee)inObject.readObject();
			inFile.close();
			inObject.close();
		}
		catch(IOException ioe) {
			System.out.println ("Error reading from the file: " + ioe.getMessage()); }
		catch (ClassNotFoundException cnfe) {
			System.out.println ("Error in casting to Employee: " + cnfe);
		}
		System.out.println("Reading the data:");
		System.out.println (employee_1);
		System.out.println (employee_2);
		System.out.println (employee_3);
	}
}
/**
 * Console:
 * Before writing:
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Jack, SSN: 123456789, Salary: 0.0
 * After writing and cleaning the data:
 * null
 * null
 * null
 * Reading the data:
 * Name: Mary, SSN: 987654321, Salary: 0.0
 * Name: John, SSN: 123456789, Salary: 0.0
 * Name: Jack, SSN: 123456789, Salary: 0.0
 */ 
