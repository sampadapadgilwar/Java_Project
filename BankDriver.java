package CityBank;

import java.util.Scanner;

public class BankDriver {
	public static void main(String[] args) {
		bank2 b1 = new bank2();
		bank1 b = b1; // upcasting
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		System.out.println("welcome");
		while (exit) {
			System.out.println(
					"Enter Your Choice: \n1.Create Account\n2.Deposite Money\n3.Withdraw Money\n4.Check Balance\n5.Acount Details\n6.Exit");
			int choice = sc.nextInt();
			{
				switch (choice) {
				case 1: {
					b.createAccount();
				}
					break;

				case 2: {
					// input
					b.deposite();
				}
					break;

				case 3: {
					b.withdraw();
				}
					break;

				case 4: {
					b.checkBalance();
				}
					break;

				case 5: {
					b.details();
				}
					break;

				case 6: {
					exit = false;
					System.out.println("Thank You For Using This city Bank :)))))");
				}
					break;

				default: {
					System.out.println("Invalid Choice! Try Again Later");
				}
				}
			}
		}
	}
}

