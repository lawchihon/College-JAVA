import java.util.Scanner;


public class Main {

	public static void main(String args[]) {
		//will have Welcome Statement
		int save = 0; //use for check need to save or not
		int choose = 0; //use for store the function that the user want, 0=no need & 1=need
		while (choose==5){
			ContactList contactlist;
			contactlist = new ContactList(50);
			System.out.println("Menu:");
			System.out.println("1. Create the new contact");
			System.out.println("2. Search for a contact");
			System.out.println("3. Show the contact list");
			System.out.println("4. Save changes");
			System.out.println("5. Exit");
			System.out.println();
			System.out.print("Choose the function that you want: ");
			Scanner scanner;
			scanner = new Scanner(System.in);
			choose=scanner.nextInt();
			switch (choose) {
			case 1:
				ContactList.Create();
				save = 1; //change save to 1 to notice we make some change
                break;
			case 2:
				ContactList.Search();
                break;
			case 3:
				ContactList.Show();
                break;
			case 4:
				ContactList.Save();
				save=0; 
                break;
			case 5:
				ContactList.Exit(save);
                break;
			}
		}
	}
}
