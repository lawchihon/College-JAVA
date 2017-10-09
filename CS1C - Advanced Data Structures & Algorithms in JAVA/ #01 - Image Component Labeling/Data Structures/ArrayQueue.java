/** a queue class that uses a one-dimensional array */

public class ArrayQueue implements Queue {

	// Implementation of the Queue interface using an array

	// link to least recently added list
	private List first;

	// link to most recently added list
	private List last;

	// number of objects
	private int number;

	// default number of objects
	public static final int NUMBER = 1000;

	// nested class to define
	private class List {
		Object object;
		List next;
	}

	// Return true iff the queue is empty
	public boolean isEmpty() {
		return (first == null);
	}

	// Return the number of objects
	public int size() {
		return number;
	}

	// Initialize the queue with given number of objects
	public ArrayQueue(int n) {
		number = n;
	}

	// Initialize the queue with default number of objects
	public ArrayQueue() {
		this(NUMBER);
	}

	// Add item to the end of the list.
	public void put(Object theObject) {
		List x = new List();
		x.object = theObject;
		x.next = null;
		if (isEmpty()) {
			first = x;
			last = x;
		} else {
			last.next = x;
			last = x;
		}
	}

	// Remove item from the beginning of the list.
	public Object remove() {
		Object val = first.object;
		first = first.next;
		return val;
	}

	// Return the front element
	public Object getFrontElement() {
		return last;
	}

	// Return the rear element
	public Object getRearElement() {
		return last.next;
	}

}
