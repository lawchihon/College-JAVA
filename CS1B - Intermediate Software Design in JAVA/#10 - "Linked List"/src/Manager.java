/**
 * One object of this class Manager stores the information of one manager.
 * @author johnlaw
 */
public class Manager extends Employee{
	private String title_;
	private double bonus_;
	/**
	 * @return value of title_
	 */
	private String title() {
		return title_;
	}
	/**
	 * Sets the new value of the title_ variable to the value in "newTitle" 
	 */
	private void title(String newTitle){
		title_ = newTitle;
	}
	/**
	 * @return value of bonus_
	 */
	private double bonus() {
		return bonus_;
	}
	/**
	 * Sets the new value of the bonus_ variable to the value in "newBonus" 
	 */
	private void bonus(double newBonus){
		bonus_ = newBonus;
	}
	/**
	 * Initialize each instance variable
	 */
	void initialize(String initName, String initSsn, double initSalary, String initTitle, double initBouns){
		super.initialize(initName, initSsn, initSalary);
		this.title(initTitle);
		this.bonus(initBouns);
	}
	
	/**
	 * @return the data in the object
	 */
	public String toString(){
		return (super.toString() + ", Title: " + title() + ", Bouns: " + bonus());
	}
	/**
	 * Supplies default values of the choice for each of the instance variables
	 */
	public Manager(){
		this.initialize(null, null, 0, null, 0);
	}
	/**
 	 * Takes a parameter for each of the instance variables
 	 */
	public Manager(String setName, String setSsn, double setSalary, String setTitle, double setBouns){
		this.initialize(setName, setSsn, setSalary, setTitle, setBouns);
	}
}
