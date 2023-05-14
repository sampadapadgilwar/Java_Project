package PGHostel1;

import java.util.Scanner;

public class PGHostel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the total number of girls in the PG hostel
        System.out.print("Enter the total number of girls in the PG hostel: ");
        int totalGirls = sc.nextInt();

        // Prompt the user to enter the number of girls who have paid rent
        System.out.print("Enter the number of girls who have paid rent: ");
        int girlsPaidRent = sc.nextInt();

        // Prompt the user to enter the number of girls who go to mess
        System.out.print("Enter the number of girls who go to mess: ");
        int girlsGoToMess = sc.nextInt();

        // Calculate the number of girls who have not paid rent
        int girlsNotPaidRent = totalGirls - girlsPaidRent;

        // Calculate the number of girls who do not go to mess
        int girlsDoNotGoToMess = totalGirls - girlsGoToMess;

        // Print the results
        System.out.println("Total number of girls in the PG hostel: " + totalGirls);
        System.out.println("Number of girls who have paid rent: " + girlsPaidRent);
        System.out.println("Number of girls who have not paid rent: " + girlsNotPaidRent);
        System.out.println("Number of girls who go to mess: " + girlsGoToMess);
        System.out.println("Number of girls who do not go to mess: " + girlsDoNotGoToMess);

        sc.close();
    }
}
