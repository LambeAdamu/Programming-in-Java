import java.util.ArrayList;
import java.util.Scanner;

public class studytime {
    
    public void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public enum courses
    {
        CSC306("Human Computer Interaction and User inter-face Design",1),
        CSC308("Java Programming",2),
        CSC310("Database Design",3),
        CSC314("Operating Systems",4);
        
        private String title;
        private int a;
        private courses(String a, int b){this.title = a;this.a = b;}
        public String gettitle(){return title;}
        public int geta(){return a;}
    }
    
    public enum Day
    {
        monday(1),
        teusday(2),
        wednesday(3),
        thursday(4),
        friday(5),
        saturday(6),
        sunday(7);
        
        private int d;
        private Day(int a){this.d = a;}
        public int getd(){return d;}
    }
    private ArrayList<Integer> hours = new ArrayList<>();
    private ArrayList<courses> course = new ArrayList<>();
    private ArrayList<Day> day = new ArrayList<>();
    
    public void casedc(int a){for(courses c : courses.values()){if(c.geta()== a){course.add(c);}}}
    public void casedd(int a){for(Day d : Day.values()){if(d.getd() == a){day.add(d);}}}
    
    public void populate()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Day \n monday(1), \nteusday(2), \n wednesday(3), \nthursday(4), \nfriday(5), \nsaturday(6), \nsunday(7) ");
        casedc(s.nextInt());
        clear();
        System.out.println("Enter the course you studied \n 1.CSC306 \n 2.CSC308 \n 3.CSC310 \n 4.CSC314");
        casedd(s.nextInt());
        clear();
        System.out.println("Enter the amount of time you studied for");
        hours.add(s.nextInt());
        clear();
    }
    
    public int total(){int a=0;for(int c : hours){a =+ c;}return a;}
    
    public int menu()
    {
        int a = 0;
        System.out.println("What do you want to do? \n 1.Add an Entry \n 2.Mytotal \n 3.Total on n day");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        return a;
    }
    
    public int totalnd(){System.out.println("Whish day's total do you want to add?\n \n monday(1), \nteusday(2), \n wednesday(3), \nthursday(4), \nfriday(5), \nsaturday(6), \nsunday(7)");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        return a;
    }
    
    public int totaln(int a)
    {
        int b = 0;
        for(Day d : Day.values())
        {
            if(d.getd() == a)
            {
                for(int c=0; c <= day.size(); c++)
                {
                    if(day.get(c) == d){ b =+ hours.get(c);}
                }
            }
        }
        return b;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        studytime s = new studytime();
        boolean running = true;
        
        while(running)
        {
            switch(s.menu())
            {
                case 1: s.clear(); s.populate(); break;
                case 2: s.clear(); System.out.println("The Total number of hours studied is: " + s.total() + "\n"); break;
                case 3: s.clear(); System.out.println("The total of hours studied on this day is: " + s.totaln(s.totalnd())); break;
            }
        }
    }
}
