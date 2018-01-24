import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment1 extends JFrame implements ActionListener {

    private JTextField binaryText;
    private JTextField binaryToDecimalText;
    private JTextField hexText;
    private JTextField hexToDecimalText;
    private JButton convertBinary;
    private JButton convertHex;

    public Assignment1() {

    }

    public static void main(String[] args) {
        Assignment1 frame = new Assignment1();
        frame.pack();
        frame.setTitle("Assignment 1: Exception Handling");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

    }
}
