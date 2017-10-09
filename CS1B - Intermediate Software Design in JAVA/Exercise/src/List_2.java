/**
 * One object of this class represents a linked list of ListNode objects, above. 
 */
public class List_2
{	private ListNode first;   	// A reference to the first node in the list

	public List_2 ()	
	{	first = null;
	}
	/**
	 * Makes a new node containing "d" and links it to the end of List.
	 */
	public void addAtEnd (Object d)	
	{	if (first != null)
			first = new ListNode ( d );
		else if (first.next == null)
			first.next = new ListNode ( d );
		else
		{	ListNode temp = first.next;
			while (temp.next != null)   // We know that (temp != null)
				temp = temp.next;
			temp.next = new ListNode ( d );
		}
	}
	/**
	 * write a new addAtend() that works recursively 
	 */
	public void recursiveAddAtend(Object d){
		if (first == null){
			first = new ListNode(d);
		}
		else{
			recursiveAddAtend(d, first);
		}
	}
	/**
	 * adds Object "d" to the end of the list headed by "start"
	 */
	public void recursiveAddAtend(Object d, ListNode start){
		if (start.next == null){
			start.next = new ListNode(d);
		}
		else{
			recursiveAddAtend(d, start.next);
		}
	}

	public String toString()	
	{	ListNode temp;
		temp = first;
		String value = "";
		while (temp != null)
		{	value = value + " " + temp;
			temp = temp.next;
		}
		return value;
	}
	/**
	 * Prints the whole list
	 */
	public void print(){
		print(first);
	}
	/**
	 * Prints the list headed by "start" recursively
	 */
	private void print(ListNode start){
		if (start != null){
			System.out.print(start + " ");
			this.print(start.next);	// recursive call
		}
		else{
			System.out.println();
		}
	}
	/**
	 * Creates a new ListNode Object, 
	 * 1. Fills in with next 8 data
	 * 2. Links it into list
	 * 3. No loop, recursion or if
	 */
	public void insertAtBeginning (Object d){
		ListNode temp;
		temp = first;
		first = new ListNode(d);
		first.next = temp;
	}
}
