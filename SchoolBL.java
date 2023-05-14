package School;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolBL {
	Student s;

	ArrayList<Student> al = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	public void addStudent() {
		System.out.println("Enter the student id: ");
		int id = sc.nextInt();
		System.out.println("Enter the student name: ");
		String name = sc.next();
		System.out.println("Enter Student phone Number: ");
		long phoneNo = sc.nextLong();
		s = new Student(id, name, phoneNo);
		al.add(s);
		System.out.println(name + "Added Sucessfully");
	}

	public void displayStudent() {
		System.out.println("Enter the id you want to fetch the details of the student: ");
		int id = sc.nextInt();

		for (Student s : al) {
			if (id == s.id) {
				System.out.println(s);
				return;
			}
		}
		System.out.println("Student not found based on: " + id);
	}

	public void removeStudent() {
		System.out.println("Enter the id you want to remove: ");
		int id = sc.nextInt();

		for (Student s : al) {
			if (id == s.id) {
				al.remove(s);
				System.out.println("Student removed sucessfully!");
				return;
			}
		}
		System.out.println("Student not found to be removed!");
	}

	public void updatePhoneNo() {
		System.out.println("Enter the id you want to update phone Number of the student: ");
		int id = sc.nextInt();
		for (Student s : al) {
			if (id == s.id) {
				System.out.println("Enter the phone number to be updated: ");
				long phoneNo = sc.nextLong();
				s.phoneNo = phoneNo;
				System.out.println("Phone number updated Sucessfully :)");
			}
		}
	}
}
