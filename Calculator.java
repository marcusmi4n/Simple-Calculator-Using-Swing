import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField result = new JTextField();
        JButton add = new JButton("+");

        t1.setBounds(50, 20, 150, 20);
        t2.setBounds(50, 50, 150, 20);
        add.setBounds(50, 80, 50, 30);
        result.setBounds(50, 120, 150, 20);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                result.setText("Sum: " + (a + b));
            }
        });

        f.add(t1); f.add(t2); f.add(add); f.add(result);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
