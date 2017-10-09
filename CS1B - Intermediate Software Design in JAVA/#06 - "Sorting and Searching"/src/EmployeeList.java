/**
 * One object of class EmployeeList contains an array of references to Employee objects
 * @author johnlaw
 */
public class EmployeeList implements Cloneable{
	final private int MAXNUMOFARRAY = 5;
	private int numOfArray = 0;
	private Employee [] listOfEmployee;
	/**
	 * Create a default EmployeeList
	 */
	public EmployeeList(){
		listOfEmployee = new Employee[MAXNUMOFARRAY];
		for (int i=0; i < MAXNUMOFARRAY; i++) {
			listOfEmployee[i] = null;
		}
	}
	/**
	 * Try to add employee into EmployeeList, but it cannot add when the list is full
	 */
	public void add(Employee employee) throws Exception {
		if (numOfArray < MAXNUMOFARRAY){
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
	/**
	 * Finds whether the EmployeeList contains that employee
	 */
	public boolean contains(Employee employee){
		int i = 0;
		boolean found = false;
		for (i = 0; i < MAXNUMOFARRAY; i++){
			if (listOfEmployee[i] == employee){
				found = true;
			}
		}
		return found;
	}
	/**
	 * Sorts the employeeArrayList
	 */
	public void sort(){
		int i;
		int j;
		Employee keepEmployee;
		for (i = 0; i < numOfArray; i++){
			for (j = 1; j < numOfArray; j++){
				if (listOfEmployee[i].compareTo(listOfEmployee[j]) > 0){
					keepEmployee = listOfEmployee[j];
					listOfEmployee[j] = listOfEmployee[i];
					listOfEmployee[i] = keepEmployee;
				}
			}
		}
	}

}
