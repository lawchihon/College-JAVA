/**
 * One object of class EmployeeList contains an array of references to Employee objects
 * @author johnlaw
 */
public class EmployeeList {
	final private int maxNumOfArray = 5;
	private int numOfArray = 0;
	private Employee [] listOfEmployee;
	/**
	 * Create a default EmployeeList
	 */
	public EmployeeList(){
		listOfEmployee = new Employee[maxNumOfArray];
		for (int i=0; i < maxNumOfArray; i++) {
			listOfEmployee[i] = null;
		}
	}
	/**
	 * Try to add employee into EmployeeList, but it cannot add when the list is full
	 */
	public void add(Employee employee) throws Exception {
		if (numOfArray < maxNumOfArray){
			listOfEmployee[numOfArray] = employee;
			numOfArray++;
		}
		else{
			throw new Exception ("The EmployeeList is full.");
		}
	}
	/**
	 * @return all the employee in EmployeeList
	 */
	public String toString(){
		String informationOfEmployee = "";
		if (numOfArray == 0){
			informationOfEmployee = "There are nothing in the EmployeeList.";
		}
		else{
			for (int i = 0; i < numOfArray; i++ ){
				informationOfEmployee += listOfEmployee[i];
				if ((i+1) != numOfArray){
					informationOfEmployee += "\n";
				}
			}
		}
		return informationOfEmployee;
	}
	/**
	 * Prints a Employee object to console
	 */
	public void write(Employee employee){
		System.out.println(employee);
	}
	/**
	 * Makes a copy of the EmployeeList
	 */
	public EmployeeList clone(){
		EmployeeList returnedEmployeeList;
		returnedEmployeeList = new EmployeeList();
		for(int i=0;i<this.numOfArray;i++){
			try {
				returnedEmployeeList.add((Employee)this.listOfEmployee[i]);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		return returnedEmployeeList;
	} 
}
