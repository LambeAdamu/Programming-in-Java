
import java.util.*;

public class GroceryTabVector {

    public static void main(String[] args) {
        Vector<Double> tab = new Vector<Double>(10);
        String input;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program tally's the contents");
        System.out.println("of a shopping cart (Vector version)......\n");
        System.out.print("Enter the price of the item or Q to quit: ");
        input = keyboard.next();

        while (!input.equalsIgnoreCase("Q")) {
            tab.add(Double.parseDouble(input));
            System.out.print("Enter the price of the item or Q to quit: ");
            input = keyboard.next();

            //Double the capacity of the vector if it is full
            if (tab.size() == tab.capacity()) {
                System.out.println("Capacity reached, doubling...");
                tab.ensureCapacity(tab.capacity() * 2);
            }
        }

        // Trim to save memory
        tab.trimToSize();
        System.out.println("Trimmed capacity to: " + tab.capacity());

        double total = 0;
        for (double price : tab) {
            total += price;
        }

        System.out.println("Your total is " + total);
    }
}
