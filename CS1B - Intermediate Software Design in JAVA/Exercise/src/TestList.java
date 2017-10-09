public class TestList {
	public static void main(String args[]) {
		List myList;
		myList = new List(10);
		System.out.println(myList);
		myList.fill(99);
		System.out.println(myList);
		
		Rectangle [] array;
		array = new Rectangle[10];
		Rectangle r = new Rectangle();
		array[0] = r;
		array[1] = r;
		array[0].setLength(0);
		array[1].setLength(100);
		System.out.println(array[0]);
		System.out.println(array[1]);
	}
}
/**
 * Console:
 * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * [99, 99, 99, 99, 99, 99, 99, 99, 99, 99]
 */