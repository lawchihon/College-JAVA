/**
 * One employee of this class represents a linked list of ListNode objects, above. 
 */
public class LinkedList{
	private ListNode first; // A reference to the first node in the list
	/**
	 * Supplies default values of the choice for each of the instance variables
	 */
	public LinkedList (){
		first = null;
	}
	/**
	 * Makes a new node containing "employee" and links it to the end of List. 
	 */
	public void recursiveAddAtend(Employee employee){
		if (first == null){
			first = new ListNode(employee);
		}
		else{
			recursiveAddAtend(employee, first);
		}
	}
	/**
	 * adds Employee to the end of the list headed by "start"
	 */
	public void recursiveAddAtend(Employee employee, ListNode start){
		if (start.next == null){
			start.next = new ListNode(employee);
		}
		else{
			recursiveAddAtend(employee, start.next);
		}
	}
	/**
	 * @return the data in the list
	 */
	public String toString(){
		ListNode temp;
		temp = first;
		String value = "";
		while (temp != null)
		{	value = value + temp + "\n";
			temp = temp.next;
		}
		return value;
	}
	/**
	 * gives every Employee in the list a raise in salary
	 */
	public void raise(double percentRaise){
		ListNode temp;
		Employee tempEmployee;
		temp = first;
		while (temp != null){
			tempEmployee = (Employee) temp.getData();
			tempEmployee.raise(percentRaise);
			temp = temp.next;
		}
	}
}