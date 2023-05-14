package BookMyShow;

import java.util.Scanner;

public class BookMyShowB {
	User u;
	Movie m;

	Scanner sc = new Scanner(System.in);

	BookMyShowB(User u) {
		this.u = u;
	}

	BookMyShowB(Movie m) {
		this.m = m;
	}

	public void displayUser() {
		System.out.println(u.toString());
	}

	public void updatePwd() {
		System.out.println("Enter new password to be changed: ");
		int newPwd = sc.nextInt();
		u.pwd = newPwd;
		System.out.println("Password Changed Sucessfully :)");
	}

	public void displayMovie() {
		System.out.println(m.toString());
	}

	public void updateMovie() {
		System.out.println("Enter Movie Name to be updated: ");
		String newmName = sc.next();
		System.out.println("Enter Movie Price to be updated: ");
		double newPrice = sc.nextDouble();
		System.out.println("Enter duration to be changed: ");
		double newDuration = sc.nextDouble();
		System.out.println("Enter genre to be updated: ");
		String newGenre = sc.next();
		m.mname = newmName;
		m.mprice = newPrice;
		m.mduration = newDuration;
		m.mgenre = newGenre;

		System.out.println("Movie Updated Sucesfully");
	}

}
