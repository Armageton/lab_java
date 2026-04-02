package Day_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    CalculatorGUI() {

        // Labels
        l1 = new JLabel("Enter First Number:");
        l2 = new JLabel("Enter Second Number:");
        l3 = new JLabel("Result:");

        // Text Fields
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        // Buttons
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Multiply");
        b4 = new JButton("Reset");

        // Layout
        setLayout(new GridLayout(4,2,10,10));

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);

        add(b1); add(b2);
        add(b3); add(b4);

        // Action Listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setTitle("Simple Calculator");
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int result = 0;

            if(e.getSource() == b1) {
                result = n1 + n2;
            }
            else if(e.getSource() == b2) {
                result = n1 - n2;
            }
            else if(e.getSource() == b3) {
                result = n1 * n2;
            }

            t3.setText(String.valueOf(result));
        }
        catch(Exception ex) {}

        if(e.getSource() == b4) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String args[]) {
        new CalculatorGUI();
    }
}