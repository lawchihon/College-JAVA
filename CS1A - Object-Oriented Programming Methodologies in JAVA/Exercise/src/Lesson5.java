class Lesson5 {
	public static void main(String args[]) {
		Rectangle floor;
		floor = new Rectangle(); // constructs (allocates space for) an object
		floor.setHeight(3);
		floor.setWidth(2);
		System.out.println("height should be 3: " + floor.getHeight());
		System.out.println("width should be 2: " + floor.getWidth());
		System.out.println("Here is the floor:" + floor.toString());
		Rectangle ceiling;
		ceiling = new Rectangle(); // constructs a second Rectangle object
		ceiling.setHeight(5);
		ceiling.setWidth(6);
		System.out.println("height should be 5: " + ceiling.getHeight());
		System.out.println("width should be 6: " + ceiling.getWidth());
		System.out.println("Here is the ceiling:" + ceiling.toString());
		/**
		 * write class Currency where one object of class Currency represents a
		 * number of dollars and an int number of cents.
		 */
		Currency price1;
		price1 = new Currency();
		System.out.println(price1.toString());
		price1.setDollars(9);
		price1.setCents(99);
		System.out.println(price1.toString());	// 9.99
		price1.setCents(75);
		System.out.println(price1.toString());
		price1.setCurrency1 (199.99); //a little bit harder
		System.out.println(price1.toString());
		price1.setCurrency2 (199, 99);
		System.out.println(price1.toString());
	}
}
/**
 * height should be 3: 3
 * width should be 2: 2
 * Here is the floor:height = 3, width = 2
 * height should be 5: 5
 * width should be 6: 6
 * Here is the ceiling:height = 5, width = 6
 * Dollars = 0, Cents = 0
 * Dollars = 9, Cents = 99
 * Dollars = 9, Cents = 75
 * Dollars = 199, Cents = 99
 * Dollars = 199, Cents = 99
 */