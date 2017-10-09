/**
 * Tests class SavingsAccount by creating a
 * SavingsAccount object and printing
 * the amount that would be in it after 10 years.
 */
class TestSavingsAccount  {
public static void main(String args[])  {
		int count = 1;
          SavingsAccount saver;
          saver = new SavingsAccount ();
          saver.setDeposit(1000);
          saver.setAnnualInterestRate(0.0325);
          while (count <= 10){
        	  System.out.print("Year " + count + ": ");
        	  System.out.println(saver.futureInvestmentValue(count));
        	  count = count + 1;
          }
     }
}
/**
 * The Console:
 * Year 1: 1032.99
 * Year 2: 1067.07
 * Year 3: 1102.27
 * Year 4: 1138.63
 * Year 5: 1176.19
 * Year 6: 1214.99
 * Year 7: 1255.07
 * Year 8: 1296.47
 * Year 9: 1339.24
 * Year 10: 1383.42
 */