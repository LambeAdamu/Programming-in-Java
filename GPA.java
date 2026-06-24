import java.util.Scanner;

public class GPA 
{
    private int[] marks = new int[7];
    private int[] credits = new int[7];
    private int[] points = new int[7];
    
    Scanner s = new Scanner(System.in);
    int[] arr = new int[7];
    
    public void enterm(){System.out.println("Enter the marks: ");
                        for(int a=0; a < 7; a++){marks[a] = s.nextInt();}}
    
    public void enterc(){System.out.println("Enter the Credits: ");
                        for(int b=0; b < 7; b++){credits[b] = s.nextInt();}}
    
    public void calcp()
    {
        for(int a: marks)
        {
            for(int c = 0; c < 7; c++)
            {
                if(80 <= marks[c] && marks[c] <=100){points[c] = 4;}
                else if(marks[c] >= 60 && marks[c] < 80){points[c] = 3;}
                else if(50 <= marks[c] && marks[c] < 60){points[c] = 2;}
                else if(40 <= marks[c] && marks[c] < 50){points[c] = 1;}
                else{points[c] = 0;}
            }
        }
    }
    
    public int calcpc()
    {
        int f = 0;
        int i = 0;
        for(int d: points)
        {
            f += d* credits[i];
            i++;
        }
        return f;
    }
    
    public int sumc()
    {
        int g =0;
        for(int h: credits){g += h;}
        return g;
    }


    public static void main(String[] args)
    {
        System.out.println("Hello World");
        GPA g = new GPA();
        g.enterm();
        g.enterc();
        g.calcp();
        g.calcpc();
        g.sumc();
        float a = (float) g.calcpc()/g.sumc();
        System.out.println("Your GPA is: " + a );
        
    }
    
}