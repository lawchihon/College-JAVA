/**
 * Tests class Driver by reading the data, calculating and printing
 * out the insurance premiums for four different drivers.
 */
class TestDriver {
      public static void main(String args[])  {
            Driver driver;
            driver = new Driver();
            driver.read();
            System.out.println("Premium: $" + driver.premium());
            driver.read();
            System.out.println("Premium: $" + driver.premium());
            driver.read();
            System.out.println("Premium: $" + driver.premium());
            driver.read();
            System.out.println("Premium: $" + driver.premium());
      }
}
/**
 * The Console:
 * Driver's Age? 35
 * Number of Tickets? 1
 * Value of Car? 10000
 * Premium: $550.00
 * Driver's Age? 29
 * Number of Tickets? 2
 * Value of Car? 15000
 * Premium: $1031.25
 * Driver's Age? 19
 * Number of Tickets? 3
 * Value of Car? 850
 * Premium: $73.31
 * Driver's Age? 81
 * Number of Tickets? 4
 * Value of Car? 12500
 * Premium: $0.00
 */