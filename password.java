import java.util.Random;

public class password{
    private String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lower = "abcdefghijklmnopqrstuvwxyz";
    private String numeric = "1234567890";
    private String special = "!@$%^&*<>";
    private String allchar = Upper + lower + numeric + special; 

    public String create()
    {
    Random random = new Random();
    char[] pass = new char[12];
    pass[0] = Upper.charAt(random.nextInt(Upper.length()));
    pass[1] = lower.charAt(random.nextInt(lower.length()));
    pass[2] = numeric.charAt(random.nextInt(numeric.length()));
    pass[3] = special.charAt(random.nextInt(special.length()));
    for(int i=4; i <= 11; i++)
    {
        pass[i] = allchar.charAt(random.nextInt(allchar.length()));
    }
    return new String(pass);

    }

    public static void main()
    {
        pass p = new pass();
        System.out.println("Th password is" + p.create());
    }

}