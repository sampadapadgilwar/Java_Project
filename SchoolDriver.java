package School;

import java.util.Scanner;

public class SchoolDriver {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			SchoolBL ss = new SchoolBL();
			boolean exit = true;
			while (exit) {
				System.out.println("******WELCOME TO HIMANSHU SCHOOL*******");
				System.out.println(
						"Enter your choice:\n1. Add Student\n2. Display Student\n3. Remove Student\n4. Update Phone Number\n5. Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					ss.addStudent();
				}
					break;

				case 2: {
					ss.displayStudent();
				}
					break;

				case 3: {
					ss.removeStudent();
				}
					break;

				case 4: {
					ss.updatePhoneNo();
				}
					break;

				case 5: {
					exit = false;
					System.out.println("Thank You For Using this application :)))))");
				}
					break;

				default: {
					System.out.println("Invalid choice try again later!");
				}
				}
			}
		}
	}
}
