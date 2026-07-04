
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class button extends JFrame implements ActionListener {

    private JButton button1, button2, button3;

    public button() {
        setTitle("Event Handling Demo");
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        add(button1);
        add(button2);
        add(button3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(this, "Button 1 was clicked.");
        } else if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(this, "Button 2 was clicked.");
        } else if (e.getSource() == button3) {
            JOptionPane.showMessageDialog(this, "Button 3 was clicked.");
        }
    }

    public static void main(String[] args) {
        button frame = new button();
        frame.setVisible(true);
    }
}
