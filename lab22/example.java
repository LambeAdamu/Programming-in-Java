
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class example extends JFrame implements ActionListener {

    public static final int w = 300;
    public static final int h = 200;
    public JButton button;

    public example() {
        setSize(w, h);
        setTitle("My App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Increment");

    }

    public static void main(String[] args) {
        example we = new example();
        we.setVisible(true);
    }

}
