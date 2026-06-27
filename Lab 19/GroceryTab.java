import java.util.*;

public class GroceryTab {
    public static void main(String[] args) {
        double[] tab = new double[10];
        int count = 0;
        String input;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program tally's the contents");
        System.out.println("of a shopping cart......\n");
        System.out.print("Enter the price of the item or Q to quit: ");
        input = keyboard.next();

        while (!input.equalsIgnoreCase("Q")) {
            tab[count] = Double.parseDouble(input);
            count++;
            System.out.print("Enter the price of the item or Q to quit: ");
            input = keyboard.next();
        }

        double total = 0;
        for (int i = 0; i < count; i++)
            total += tab[i];

        System.out.println("Your total is " + total);
    }
}