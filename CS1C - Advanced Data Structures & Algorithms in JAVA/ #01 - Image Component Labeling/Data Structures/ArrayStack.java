/** a stack class that uses a one-dimensional array */

public class ArrayStack implements Stack {

	// Implementation of the Stack interface using an array.

	// default capacity of the stack
	public static final int CAPACITY = 1000;

	// maximum capacity of the stack.
	private int capacity;

	// S holds the elements of the stack
	private Object S[];

	// the top element of the stack.
	private int top = -1;

	// Initialize the stack with given capacity
	public ArrayStack(int cap) {
		capacity = cap;
		S = new Object[capacity];
	}

	// Initialize the stack with default capacity
	public ArrayStack() {
		this(CAPACITY);
	}

	// Return true iff the stack is empty
	public boolean empty() {
		return (top < 0);
	}

	// Push a new object on the stack
	public void push(Object obj) {
		S[++top] = obj; // ++top or top++
	}

	// Return the top stack element
	public Object peek() {
		return S[top];
	}

	// Pop off the stack element
	public Object pop() {
		Object elem;
		elem = S[top];
		// Dereference S[top] and decrement top
		S[top--] = null;
		return elem;
	}
}
