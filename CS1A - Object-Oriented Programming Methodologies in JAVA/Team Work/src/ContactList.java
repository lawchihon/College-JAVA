import java.util.*;


public class ContactList {
	public static String[] FirstName; //to store the first name
	public static String[] LastName;// to store the last name
	public static String[] Address; //to store the address
	//I don't write the rest as they are the same. I create them which may easier to search or sort
	public static String[] Contact; //to store the hole data so that it can be easier to print out and save
	public static int totalOfList; //not yet write how to collect
	public static int choose; //same meaning as Main
	public ContactList(int numInts) { //this is suppose to read the total in the file
		totalOfList = numInts;
		FirstName = new String[numInts]; 
		LastName = new String[numInts];
		Address = new String[numInts]; 
		Contact = new String[numInts];
	}
	public static void Create() { //this the use to create a new user, just flash memory
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.print("Please input:");
		System.out.println("First Name:");
		FirstName[1]=scanner.next();
		System.out.print("Last Name:");
		LastName[1]=scanner.next();	
		System.out.print("Address:");
		Address[1]=scanner.next();
		Contact[1]=FirstName[1]+" "+LastName[1]+" "+Address[1]; //combine them together will be easier to print(I think)
	}
	public static void Search(){ 
		String search;
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Search by:");
		System.out.println("1. First Name");
		System.out.println("2. Last Name");
		System.out.println("3. Address");
		System.out.println("Choose the function that you want:");
		choose=scanner.nextInt();
		switch (choose){
		case 1:{
			System.out.print("The name that you want to search: ");
			search=scanner.next();
			int i;
			for (i = 0; i < totalOfList; ++i) {
				if (FirstName[i]==search) {
					System.out.println(Contact[i]);
				}
			}
		}
			break;
		case 2:{
			//same as case 1
		}
			break;
		case 3:{
			//same as case 1
		}
			break;
		}
	}
	public static void Show() {
		int i,j;
		String hold;
		//the following is sort by LastName
		for (i = 0; i < totalOfList; ++i) {
			for (j = 0; j < totalOfList; ++j) {
				char[] hold2 = LastName[i].toCharArray();
				char[] hold3 = LastName[j].toCharArray();
				if ((hold2[1]<hold3[1])||((hold2[1]==hold3[1])&&(hold2[2]<hold3[2]))||((hold2[1]==hold3[1])&&(hold2[2]==hold3[2])&&(hold2[3]<hold3[3]))){
					hold = FirstName[i];
					FirstName[i] = FirstName[j];
					FirstName[j] = hold;
	                hold = LastName[i];
	                LastName[i] = LastName[j];
	                LastName[j] = hold;
	                hold = Address[i];
	                Address[i] = Address[j];
	                Address[j] = hold;
	                hold = Contact[i];
	                Contact[i] = Contact[j];
	                Contact[j] = hold;
				}
			}}		
		for (i = 0; i < totalOfList; ++i) {
			System.out.println(Contact [i]);
		}
	}
	public static void Save() {
		//no time to finish it		
	}
	public static void Exit(int save) { //when the user want to exit
		Scanner scanner;
		scanner = new Scanner(System.in);
		String choose;
		switch (save){
		case 1:{ //check need to save or not
			System.out.println("You have not saved yet. Do you want to save? (Y/N)");
			choose = scanner.next();
			while (choose=="Y"){
				Save();
				choose="N";
			}
		}
			break;
		}
		System.out.println("Thank you for using, bye.");
	}
}

