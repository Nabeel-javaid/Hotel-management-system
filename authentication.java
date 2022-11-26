import java.util.ArrayList;
import java.util.Scanner;

public class authentication {


//	String usernamearr[] = {"admin", "nabeel"};
//	String passwordarr[] = {"admin", "javed"};

	ArrayList<String> usernamearr = new ArrayList<String>();
	ArrayList<String> passwordarr = new ArrayList<String>();

	ArrayList<String> numberarr = new ArrayList<String>();

	public authentication() {
		usernamearr.add("admin");
		passwordarr.add("admin");
		numberarr.add("+923435100977");
	}

	int count= 0;
	public void login() {



		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Username");
		String username = sc.nextLine();

		System.out.println("Please enter password");
		String password = sc.nextLine();
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
				if(count==3)
				{
					System.out.println("You have exceeded the number of attempts");
					System.exit(0);
				}
				else
					login();
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


			for (int i = 0; i < usernamearr.size(); i++) {
				System.out.print(usernamearr.get(i)+" ");
				System.out.println(passwordarr.get(i));
				System.out.println(numberarr.get(i));
			}
		}

		System.out.println("Please Login to continue");
		System.out.println("----------------------");
		login();



	}
	
}
