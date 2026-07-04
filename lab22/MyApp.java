
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyApp extends JFrame implements ActionListener {

    int count = 0;
    JLabel label;
    JButton btn;
    JTextField textField;       // regular text input
    JPasswordField passField;   // masks input with dots

    MyApp() {
        label = new JLabel("Count: 0");
        btn = new JButton("Increment");
        textField = new JTextField(10);  // 10 columns wide
        passField = new JPasswordField(10);

        btn.addActionListener(this);

        // Top panel: label LEFT, button CENTER, textfield RIGHT
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(label, BorderLayout.WEST);
        topPanel.add(btn, BorderLayout.CENTER);
        topPanel.add(textField, BorderLayout.EAST);

        // Add topPanel to frame, password field below
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(passField, BorderLayout.SOUTH); // password sits below

        setTitle("My App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // always last
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Count: " + count);
    }

    public static void main(String[] args) {
        new MyApp();
    }
}
