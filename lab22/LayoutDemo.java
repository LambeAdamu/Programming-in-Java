
import java.awt.*;
import javax.swing.*;

public class LayoutDemo extends JFrame {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public LayoutDemo() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Layout Demonstration");
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(6, 1));

        JLabel label1 = new JLabel("This is label one.");
        contentPane.add(label1);

        JLabel label2 = new JLabel("This is label two.");
        contentPane.add(label2);

        JLabel label3 = new JLabel("This is label three.");
        contentPane.add(label3);
    }

    public static void main(String[] args) {
        LayoutDemo gui = new LayoutDemo();
        gui.setVisible(true);
    }
}
