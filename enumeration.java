public class enumeration {
  public enum courses
    {
        CSC306("Human Computer Interaction and User inter-face Design"),
        CSC308("Java Programming"),
        CSC310("Database Design"),
        CSC314("Operating Systems");
        
        private String title;
        private courses(String title)
        {this.title = title;}
        
        public String gettitle(){return title;}
    }   
    
    public static void main(String[] arg)
    {
        System.out.println("Hello World");
        
        for (courses c : courses.values()) {
            System.out.println(c + ": " + c.gettitle());
    }
    }
}