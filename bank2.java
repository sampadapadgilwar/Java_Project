package CityBank;

import java.util.Scanner;

public class bank2 implements bank1 {
	String name;
	double money;
	double depositeAmt;
	double withdrawAmt;
	int pwd;
	Scanner sc = new Scanner(System.in);

	public void createAccount() {

		System.out.println("enter the name");
		name = sc.next();
		System.out.println("enter the money");
		money = sc.nextDouble();
		System.out.println("enter the password");
		pwd = sc.nextInt();
		System.out.println("account created successfully");
	}

	public void deposite() {

		System.out.println("enter the money to be displayed");
		depositeAmt = sc.nextDouble();
		money = money + depositeAmt;
		System.out.println("successfully deposited" + depositeAmt + "rs");
	}

	public void withdraw() {

		System.out.println("Enter the money to be Withdraw: ");
		withdrawAmt = sc.nextDouble();
		// logic to withdraw amount
		money = money - withdrawAmt;
		System.out.println("Sucessfully Withdrawn " + withdrawAmt + "Rs");
	}

	public void checkBalance() {
		System.out.println("Account Balance: " + money);
	}

	public void details() {
		System.out.println("Account Name: " + name);
		System.out.println("Account Balance: " + money);
		System.out.println("Account Password: " + pwd);
	}
}
