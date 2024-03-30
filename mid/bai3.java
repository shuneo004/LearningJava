import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;
class App extends JFrame {
    String[] Cal = {"1 January", "2 February", "3 March", "4 April", "5 May", "6 June"};
    final int N = 6;
    JButton[] button = new JButton[N];

    public App() {
        for (int i = 0; i < N; ++i) {
            button[i] = new JButton(Cal[i]);
        }
        JPanel body = new JPanel();
        body.setLayout(new GridLayout(2, 2));
        body.add(button[0]);
        body.add(button[1]);
        body.add(button[2]);
        JPanel leave = new JPanel();
        leave.setLayout(new GridLayout(2, 2));
        leave.add(button[3]);
        leave.add(button[4]);
        leave.add(button[5]);

        ActionListener ac = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(App.this, " Hello Calender!");
            }
        };
        for (int i = 0; i < N; ++i) {
            button[i].addActionListener(ac);
        }

        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(500, 500);
        add(body);
        body.add(leave);
    }
}
public class bai3 {
    public static void main(String[] args) {
        new App();
    }
}
