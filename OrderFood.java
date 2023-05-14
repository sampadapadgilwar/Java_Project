package FoodOrder;
import java.util.Scanner;
import java.util.TreeSet;
public class OrderFood {

	private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize the food items available for ordering
        TreeSet<FoodItem> menu = new TreeSet<>();
        menu.add(new FoodItem("Pizza", 150));
        menu.add(new FoodItem("Burger", 100));
        menu.add(new FoodItem("Pasta", 120));
        menu.add(new FoodItem("Sandwich", 80));

        // Prompt the user to order food
        System.out.println("Welcome to Foodie! Please enter your order:");
        System.out.print("Enter the food name: ");
        String foodName = sc.nextLine();

        System.out.print("Enter the rupees: ");
        int rupees = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter the location: ");
        String location = sc.nextLine();

        // Find the FoodItem object for the ordered food
        FoodItem orderedFood = null;
        for (FoodItem item : menu) {
            if (item.getName().equalsIgnoreCase(foodName) && item.getRupees() == rupees) {
                orderedFood = item;
                break;
            }
        }

        // Check if the ordered food is available
        if (orderedFood == null) {
            System.out.println("Sorry, the ordered food is not available.");
        } else {
            // Place the order
            Order order = new Order(orderedFood, location);
            System.out.println("Your order has been placed:");
            System.out.println(order);
        }
    }

    // FoodItem class represents a food item on the menu
    static class FoodItem implements Comparable<FoodItem> {
        private String name;
        private int rupees;

        public FoodItem(String name, int rupees) {
            this.name = name;
            this.rupees = rupees;
        }

        public String getName() {
            return name;
        }

        public int getRupees() {
            return rupees;
        }

        @Override
        public int compareTo(FoodItem o) {
            // Compare FoodItem objects based on their names
            return this.name.compareTo(o.name);
        }
    }

    // Order class represents a food order
    static class Order {
        private FoodItem foodItem;
        private String location;

        public Order(FoodItem foodItem, String location) {
            this.foodItem = foodItem;
            this.location = location;
        }

        public FoodItem getFoodItem() {
            return foodItem;
        }

        public String getLocation() {
            return location;
        }

        @Override
        public String toString() {
            // Return a string representation of the order
            return "Food Item: " + foodItem.getName() + " (" + foodItem.getRupees() + " rupees)\n"
                    + "Location: " + location;
        }
    }
}
