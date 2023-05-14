package BookMyShow;

import java.util.Scanner;

public class BookMyShowDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name: ");
		String uname = sc.next();
		System.out.println("Enter User Password: ");
		int pwd = sc.nextInt();
		System.out.println("Enter Phone Number: ");
		long phoneNo = sc.nextLong();

		BookMyShowB b = new BookMyShowB(new User(uname, pwd, phoneNo));
		System.out.println("Account created Sucessfully :))))");

		System.out.println("Enter Movie Name: ");
		String mname = sc.next();
		System.out.println("Enter Movie Price: ");
		double mprice = sc.nextDouble();
		System.out.println("Enter Movie Duration: ");
		double mduration = sc.nextDouble();
		System.out.println("Enter Movie Genre: ");
		String mgenre = sc.next();

		BookMyShowB b2 = new BookMyShowB(new Movie(mname, mprice, mduration, mgenre));
		System.out.println("Movie Added Sucesfully :)");
		boolean exit = true;
		while (exit) {
			System.out.println("**Welcome To Book My Show**");
			System.out.println(
					"Enter Your Choice:\n1. Display User Details\n2. Update Password\n3. Display Movie Details\n4. Update Movie Details\n5. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				b.displayUser();
			}
				break;

			case 2: {
				b.updatePwd();
			}
				break;

			case 3: {
				b2.displayMovie();
			}
				break;

			case 4: {
				b2.updateMovie();
			}
				break;

			case 5: {
				exit = false;
				System.out.println("Thank you For Using Book My Show :)");
			}
				break;

			default: {
				System.out.println("Invalid Option Try Again :)");
			}
			}
		}

	}
}
