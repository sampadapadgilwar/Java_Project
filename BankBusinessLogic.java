package BankBusinessLogic;

import java.io.File;
import java.util.Scanner;

public class BankBusinessLogic {

	User u;
	Account a;
	File f;
	static Scanner sc = new Scanner(System.in);

	// LOGICS//
	public void createAccount() {
		System.out.println("Enter Your User Name: ");
		String userName = sc.nextLine();
		System.out.println("Enter Your Phone Number: ");
		String phoneNo = sc.nextLine();
		System.out.println("Enter Your Password: ");
		String pwd = sc.nextLine();
		u = new User(userName, phoneNo, pwd);
		a = new Account(userName, phoneNo, pwd);
		System.out.println("Account Created Sucessfully!!");
		System.out.println("Press C to add balance: ");
		char input = sc.next().charAt(0);
		if (input == 'c' || input == 'C') {
			System.out.println("Enter User Name: ");
			String uName = sc.nextLine();
			System.out.println("Enter Password: ");
			String uPwd = sc.nextLine();

			if (this.a.userName.equalsIgnoreCase(uName) && this.a.pwd.equalsIgnoreCase(uPwd)) {
				System.out.println("Enter Your Account Number: ");
				String accNumber = sc.nextLine();
				System.out.println("Credentials Matched!");
				System.out.println("Enter Account Balance: ");
				double balance = sc.nextDouble();
				a = new Account(userName, phoneNo, pwd, accNumber, balance);
				System.out.println("Balance and account number added Sucessfully");
			} else {
				System.out.println("Invalid Credentials");
			}
		} else {
			System.out.println("Invalid Input");
		}
	}

}
