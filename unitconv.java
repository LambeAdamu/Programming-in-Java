import java.util.Scanner;

public class unitconv{
    private int a = 0;
    public double conv(double b,double c,double d)
    {
       if(c < d){double e = (d - c); b = b * Math.pow(10, e);}
       else{double e = (c - d); b = b * Math.pow(10, e);}
       return b; 
    }
    public static void main(String[] args) {
        unitconv u = new unitconv();
        Scanner s = new Scanner(System.in);
        System.out.println("The levels include \n Kilo(6), \nHecto(5),\nDeca(4),\nBase(3),\nDeci(2),\nCenti(1),\nMilli(0)");       
        System.out.println("Enter your current level"); 
        double a = s.nextDouble();
        System.out.println("Enter the level you want to convert to:");
        double b = s.nextDouble();
        System.out.println("Enter the value you want to convert; ");
        double c = s.nextDouble();
        System.out.println( c + "Converted as asked is" + u.conv(c,a,b));
    }
}

