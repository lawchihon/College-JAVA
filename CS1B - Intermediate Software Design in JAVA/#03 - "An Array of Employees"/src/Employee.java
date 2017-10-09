/**
 * One object of this class Employee stores the information of one employee.
 * @author johnlaw
 */
public class Employee {
	private String name_;
	private String ssn_;
	private double salary_;
	private static int counter;
	/**
	 * @return value of name_
	 */
	private String name() {
		return name_;
	}
	/**
	 * Sets the new value of the name_ variable to the value in "newName" 
	 */
	private void name(String newName){
		name_ = newName;
	}
	/**
	 * @return value of ssn_
	 */
	private String ssn() {
		return ssn_;
	}
	/**
	 * Sets the new value of the ssn_ variable to the value in "newSsn" 
	 */
	private void ssn(String newSsn){
		ssn_ = newSsn;
	}
	/**
	 * @return value of salary_
	 */
	private double salary() {
		return salary_;
	}
	/**
	 * Sets the new value of the salary_ variable to the value in "newSalary" 
	 */
	private void salary(double newSalary){
		salary_ = newSalary;
	}
	/**
	 * Initialize each instance variable
	 */
	void initialize(String initName, String initSsn, double initSalary){
		this.name(initName);
		this.ssn(initSsn);
		this.salary(initSalary);
	}
	/**
	 * @return the data in the object
	 */
	public String toString(){
		return "Name: " + this.name() + ", SSN: " + this.ssn() + ", Salary: " + this.salary();
	}
	/**
	 * Supplies default values of the choice for each of the instance variables
	 */
	public Employee(){
		this.initialize(null,null,0);
		counter++;
	}
	/**
 	 * Takes a parameter for each of the instance variables
 	 */
	public Employee(String setName, String setSsn, double setSalary){
		this.initialize(setName, setSsn, setSalary);
		counter++;
	}
	/**
	 * @return the number of the employee created
	 */
	public int getCounter(){
		return counter;
	}
}

