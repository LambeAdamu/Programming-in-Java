import java.util.Scanner;
import java.util.ArrayList;

public class exptrack 
{   ArrayList<Integer> price = new ArrayList<>(); 
    ArrayList<String> name = new ArrayList<>(); 
    ArrayList<String> cat = new ArrayList<>(); 
    
    Scanner s = new Scanner(System.in);
    
    public void populate()
    {
        System.out.println("Enter the name of the item: ");
        name.add(s.nextLine());
        System.out.println("Enter the category of the item: ");
        cat.add(s.nextLine());
        System.out.println("Enter the price of the item: ");
        price.add(s.nextInt());
        s.nextLine();
    }
    
    public void print()
    {
        System.out.println("+----+----------------+----------+----------+");
    System.out.println("| #  | Name           | Price    | Category |");
    System.out.println("+----+----------------+----------+----------+");

    for (int i = 0; i < name.size(); i++) {
        System.out.printf("| %-3d| %-15s| %-9d| %-9s|%n",
            i + 1,
            name.get(i),
            price.get(i),
            cat.get(i));
    }

    System.out.println("+----+----------------+----------+----------+");
    }
     
    public void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public int menu(){Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do? \n 1.Create an Entry \n 2.Print all entries \n 3.Calculate totals \n 4.SumIf fruit"); 
        int a = sc.nextInt();
        return a;}
    
    public int total(){int b=0; for(int a: price){b += a;} return b;}
    public int sif()
    {
        int b = 0;
        for(int a=0; a<= cat.size(); a++)
        {
            if (cat.get(a) == "fruit"){ b += price.get(a);}
        }
        return b;
    }
    
    public static void main(String[] args)
    {
        exptrack e = new exptrack();
        boolean running = true;
        // Menu Or options presenting
        while(running)
        {
        switch(e.menu())
        {
            case 1:e.clear();e.populate(); e.clear(); break;
            case 2: e.clear(); e.print(); break;
            case 3: e.clear(); System.out.println("The Total is: " + e.total() + "\n"); break;
            case 4: e.clear(); e.sif(); break;
        }
        }
    }
    
}