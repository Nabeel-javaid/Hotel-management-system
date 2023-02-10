import java.io.*;
import java.util.Scanner;




public class Main {
	public Scanner scanner;
	public PrintStream printStream;

	public Main(InputStream inputStream, PrintStream printStream) {
		this.scanner = new Scanner(inputStream);
		this.printStream = printStream;
	}

	public Main()
	{

	}
public void everything() {

		Scanner sc = new Scanner(System.in);
		int choice1, choice2;
		char wantToContinue;
		x: do {

			System.out.println(
					"\nEnter Your Choice :\n1.Show Room Details\n2.Show Room Availability \n3.Book Room\n4.Order Food\n5.Checkout Now\n6.Quit\n");
			choice1 = sc.nextInt();
			switch (choice1) {
			case 1:
				System.out.println(
						"\nChoose Room Type :\n1.Luxury Double Bedroom \n2.Deluxe Double Bedroom \n3.Luxury Single Bedroom \n4.Deluxe Single Bedroom \n");
				choice2 = sc.nextInt();
				Hotel obj = new Hotel();
				obj.features(choice2);
				break;
			case 2:
				System.out.println(
						"\nChoose Room Type :\n1.Luxury Double Bedroom\n2.Deluxe Double Bedroom\n3.Luxury Single Bedroom\n4.Deluxe Single Bedroom\n");
				choice2 = sc.nextInt();
				Hotel.availability(choice2);
				break;
			case 3:
				System.out.println(
						"\nChoose Room Type :\n1.Luxury Double Bedroom\n2.Deluxe Double Bedroom\n3.Luxury Single Bedroom\n4.Deluxe Single Bedroom\n");
				choice2 = sc.nextInt();
				Hotel.bookroom(choice2);
				break;
			case 4:
				System.out.print("Room Number -");
				choice2 = sc.nextInt();
				if (choice2 > 60)
					System.out.println("Room doesn't exist");
				else if (choice2 > 40)
					Hotel.order(choice2 - 41, 4);
				else if (choice2 > 30)
					Hotel.order(choice2 - 31, 3);
				else if (choice2 > 10)
					Hotel.order(choice2 - 11, 2);
				else if (choice2 > 0)
					Hotel.order(choice2 - 1, 1);
				else
					System.out.println("Room doesn't exist");
				break;
			case 5:
				System.out.print("Room Number -");
				choice2 = sc.nextInt();
				if (choice2 > 60)
					System.out.println("Room doesn't exist");
				else if (choice2 > 40)
					Hotel.deallocate(choice2 - 41, 4);
				else if (choice2 > 30)
					Hotel.deallocate(choice2 - 31, 3);
				else if (choice2 > 10)
					Hotel.deallocate(choice2 - 11, 2);
				else if (choice2 > 0)
					Hotel.deallocate(choice2 - 1, 1);
				else
					System.out.println("Room doesn't exist");
				break;
			case 6:
				break x;

			default:
				System.out.println("Invalid Option !!!");
			}
			System.out.println("\nContinue : (y/n)");
			wantToContinue = sc.next().charAt(0);
			if(wantToContinue == 'n')
				System.exit(0);
			if (!(wantToContinue == 'y' || wantToContinue == 'Y' || wantToContinue == 'n'
					|| wantToContinue == 'N')) {
				System.out.println("Invalid Option");
				System.out.println("\nContinue : (y/n)");
				wantToContinue = sc.next().charAt(0);
				if(wantToContinue == 'n')
					System.exit(0);
			}

		} while (wantToContinue == 'y' || wantToContinue == 'Y');

		Thread t = new Thread(new Write(Hotel.ob));
		t.start();
	}



public static void main(String[] args) {


	int option;
	do {
		System.out.println("1) Login");
		System.out.println("2) Signup");

		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
	}
	while (option>2 || option<1);

	if(option==1)
	{
		Scanner sc = new Scanner(System.in);
		authentication auth = new authentication();
		System.out.println("Please enter Username");
		String usename = sc.nextLine();

		System.out.println("Please enter password");
		String pasword = sc.nextLine();
		auth.login(usename, pasword);
	}

	else if(option ==2)
	{
		authentication auth = new authentication();
		auth.signup();

	}
}

}
