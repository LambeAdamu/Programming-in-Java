
import java.util.*;

public class GroceryGenericList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Scanner keyboard = new Scanner(System.in);
        String input;

        System.out.println("Grocery List (Generic LinkedList version)");
        System.out.print("Enter an item (or 'done' to quit): ");
        input = keyboard.nextLine();

        while (!input.equalsIgnoreCase("done")) {
            list.addToStart(input);
            System.out.print("Enter an item (or 'done' to quit): ");
            input = keyboard.nextLine();
        }

        System.out.println("\n--- Your Grocery List ---");
        list.showList();
        System.out.println("Total items: " + list.length());
    }
}
