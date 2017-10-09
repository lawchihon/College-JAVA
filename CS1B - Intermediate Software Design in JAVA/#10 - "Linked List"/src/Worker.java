/**
 * One object of this class Worker stores the information of one worker.
 * @author johnlaw
 */
public class Worker extends Employee{
	private String boss_;
	private String department_;
	/**
	 * @return value of boss_
	 */
	private String boss() {
		return boss_;
	}
	/**
	 * Sets the new value of the boss_ variable to the value in "newBoss" 
	 */
	private void boss(String newBoss){
		boss_ = newBoss;
	}
	/**
	 * @return value of department_
	 */
	private String department() {
		return department_;
	}
	/**
	 * Sets the new value of the department_ variable to the value in "newDepartment" 
	 */
	private void department(String newDepartment){
		department_ = newDepartment;
	}
	/**
	 * Initialize each instance variable
	 */
	void initialize(String initName, String initSsn, double initSalary, String initBoss, String initDepartment){
		super.initialize(initName, initSsn, initSalary);
		this.boss(initBoss);
		this.department(initDepartment);
	}
	
	/**
	 * @return the data in the object
	 */
	public String toString(){
		return (super.toString() + ", Boss: " + boss() + ", Department: " + department());
	}
	/**
	 * Supplies default values of the choice for each of the instance variables
	 */
	public Worker(){
		this.initialize(null, null, 0, null, null);
	}
	/**
 	 * Takes a parameter for each of the instance variables
 	 */
	public Worker(String setName, String setSsn, double setSalary, String setBoss, String setDepartment){
		this.initialize(setName, setSsn, setSalary, setBoss, setDepartment);
	}

}
