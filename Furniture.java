package Furniture;

import java.util.ArrayList;

class Furniture {
	private String name;
	private int price;

	public Furniture(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

class ShoppingCart {
	private ArrayList<Furniture> items;

	public ShoppingCart() {
		items = new ArrayList<Furniture>();
	}

	public void addItem(Furniture item) {
		items.add(item);
	}

	public int getTotalPrice() {
		int totalPrice = 0;

		for (Furniture item : items) {
			totalPrice += item.getPrice();
		}

		return totalPrice;
	}

	public void printItems() {
		System.out.println("Items in cart:");

		for (Furniture item : items) {
			System.out.println(item.getName() + " - Rs." + item.getPrice());
		}
	}
}

class FurnitureShop {
	private ArrayList<Furniture> items;

	public FurnitureShop() {
		items = new ArrayList<Furniture>();
		items.add(new Furniture("Chair", 500));
		items.add(new Furniture("Table", 1000));
		items.add(new Furniture("Bed", 3000));
		items.add(new Furniture("Sofa", 4000));
	}

	public void displayItems() {
		System.out.println("Available items:");

		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + ". " + items.get(i).getName() + " - Rs." + items.get(i).getPrice());
		}
	}

	public Furniture getItem(int index) {
		return items.get(index);
	}
}
