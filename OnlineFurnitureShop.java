package Furniture;

import java.util.Scanner;

public class OnlineFurnitureShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FurnitureShop shop = new FurnitureShop();
		ShoppingCart cart = new ShoppingCart();

		boolean quit = false;

		while (!quit) {
			System.out.println("\nWelcome to the Online Furniture Shop!");
			System.out.println("1. Display available items");
			System.out.println("2. Add item to cart");
			System.out.println("3. View cart");
			System.out.println("4. Checkout");
			System.out.println("5. Quit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				shop.displayItems();
				break;

			case 2:
				shop.displayItems();
				System.out.print("Enter item number to add to cart: ");
				int itemNumber = sc.nextInt();

				Furniture itemToAdd = shop.getItem(itemNumber - 1);
				cart.addItem(itemToAdd);

				System.out.println(itemToAdd.getName() + " added to cart!");
				break;

			case 3:
				cart.printItems();
				System.out.println("Total price: Rs." + cart.getTotalPrice());
				break;

			case 4:
				cart.printItems();
				System.out.println("Total price: Rs." + cart.getTotalPrice());
				System.out.println("Thank you for shopping with us!");
				quit = true;
				break;

			case 5:
				quit = true;
				break;

			default:
				System.out.println("Invalid choice!");
			}
		}

		sc.close();
	}
}
