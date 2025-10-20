import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items are you purchasing? ");
        int items = sc.nextInt();
        double total = 0;
        for (int i =1; i<=items; i++){
            System.out.println("Price of item 1?" );
            total += sc.nextInt();
        }
        System.out.println("Your cart has " + items + " items with a total cost of $" + total);
        // TODO: Use a for loop to read each item's price (double)
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input


    }
}
