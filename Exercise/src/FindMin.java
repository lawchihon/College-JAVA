import java.util.Collection;


public abstract interface FindMin extends Collection {

	Event removeMin();
	/*
	 *  FindMin - find smallest element in collection (priority queue);
	 *  
	 *  Method Summary
	 *  
	 *  void addElement(java.lang.Object value)
	 *     add a new value to the collection
	 *  
	 *  java.lang.Object getFirst()
	 *     yields the smallest element in collection
	 *  
	 *  void removeFirst()
	 *     removes the smallest element in collection
	 */
	
	void addElement(Comparable value);
	
	java.lang.Object getFirst();
	
	void removeFirst();
	
	
	
}
