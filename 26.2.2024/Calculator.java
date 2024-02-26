import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator() {
        this.setLayout(new BorderLayout());
        JPanel paneNorth = new JPanel();
        JPanel paneCenter = new JPanel();

        // Button buttonHeader = new Button("Hello");
        JTextArea text = new JTextArea("0");
        text.setSize(10, 20);
        Font font = new Font("Arial", Font.PLAIN, 100); // create a new Font with size 12
        text.setFont(font); // set the font for the text area
        text.setEditable(false);
        text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        paneNorth.setLayout(new BorderLayout());
        paneNorth.setSize(300, 300);
        paneNorth.add(text);
        // paneNorth.add(buttonHeader, BorderLayout.NORTH);
        paneCenter.setLayout(new GridLayout(5, 4));  
        paneCenter.add(new Button("CE"));
        paneCenter.add(new Button("C"));
        paneCenter.add(new Button("X"));
        paneCenter.add(new Button("/"));
        paneCenter.add(new Button("7"));
        paneCenter.add(new Button("8"));
        paneCenter.add(new Button("9"));
        paneCenter.add(new Button("X"));
        paneCenter.add(new Button("4"));
        paneCenter.add(new Button("5"));
        paneCenter.add(new Button("6"));
        paneCenter.add(new Button("-"));
        paneCenter.add(new Button("1"));
        paneCenter.add(new Button("2"));
        paneCenter.add(new Button("3"));
        paneCenter.add(new Button("+"));
        paneCenter.add(new Button("%"));
        paneCenter.add(new Button("0"));
        paneCenter.add(new Button("."));
        paneCenter.add(new Button("="));



        this.add(paneNorth, BorderLayout.NORTH);
        this.add(paneCenter, BorderLayout.CENTER);
    }

}