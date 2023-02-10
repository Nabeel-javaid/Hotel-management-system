import java.util.ArrayList;
import java.util.Scanner;

public class authentication {
	static ArrayList<String> usernamearr = new ArrayList<String>();
	static ArrayList<String> passwordarr = new ArrayList<String>();

	static ArrayList<String> numberarr = new ArrayList<String>();

	public authentication() {
		usernamearr.add("admin");
		passwordarr.add("admin");
		numberarr.add("+923435100977");
		Scanner cin = new Scanner(System.in);
	}

	int count= 0;
	public void login(String username, String password) {
			for (int i = 0; i < usernamearr.size(); i++) {

				if (usernamearr.get(i).equals(username)&& passwordarr.get(i).equals(password)) {
					System.out.println("Login Successful");

					System.out.println("welcome " + username);
					Main main = new Main();
					main.everything();

					break;
				}
			}
				System.out.println("Login Failed");
				count++;
				System.out.println("You have " + (3 - count) + " attempts left");
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter Username");
				String usename = sc.nextLine();

				System.out.println("Please enter password");
				String pasword = sc.nextLine();
				if(count==2)
				{
					System.out.println("You have exceeded the number of attempts");
					System.exit(0);
				}
				else
					login(usename, pasword);
			}

	public void signup(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Username");
		String user = sc.nextLine();


		if(usernamearr.contains(user))
		{
			System.out.println("Username already exists\nPlease try again\n -------------------");
			signup();
		}
		else
		{
			System.out.println("Please enter password");
			String password = sc.nextLine();

			System.out.println("Please enter your phone number");
			String phonenumber = sc.nextLine();

			usernamearr.add(user);
			passwordarr.add(password);
			numberarr.add(phonenumber);
			System.out.println("Signup Successful");
		}

		System.out.println("Please Login to continue");
		System.out.println("----------------------");
		System.out.println("Please enter Username");
		String usename = sc.nextLine();

		System.out.println("Please enter password");
		String pasword = sc.nextLine();
		login(usename, pasword);



	}
	
}
