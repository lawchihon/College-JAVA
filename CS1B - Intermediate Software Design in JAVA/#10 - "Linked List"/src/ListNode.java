/** 
 * One object of this class represents one node in the linked list, class List
 */
class ListNode 
{	private Object data;
	public ListNode next; 
	/**
	 * Takes a parameter for the the instance variables "employee"
	 */
	public ListNode (Employee employee){
		initialize (employee, null);
	}
	/**
 	 * Takes a parameter for each of the instance variables
 	 */
	public ListNode (Employee employee, ListNode n){
		initialize(employee, n);
	}
	/**
	 * Initialize each instance variable
	 */
	private void initialize(Employee employee, ListNode n){
		data = employee;
		next = n;
	}
	/**
	 * @return the data in the object
	 */
	public String toString (){
		return ""+data;  		
	}
	/**
	 * @return the Object "d"
	 */
	public Object getData(){
		return data;
	}
}
