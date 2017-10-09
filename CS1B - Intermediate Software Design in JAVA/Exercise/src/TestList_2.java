/**
 * write a main() that creates an object of class List and stores two Integer
 * objects in the List print the List to see it got in there
 * @author johnlaw
 */
public class TestList_2 {
	public static void main(String args[]) {
		List_2 list;
		list = new List_2();
		list.recursiveAddAtend(3);
		list.recursiveAddAtend(1);
		list.print();
		list.insertAtBeginning(55);
		list.print();
		}
}
