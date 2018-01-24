import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment1 extends JFrame {

    private JTextField binaryText;
    private JTextField binaryToDecimalText;
    private JTextField hexText;
    private JTextField hexToDecimalText;
    private JButton convertBinary;
    private JButton convertHex;

    public Assignment1() {

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2));

        binaryText = new JTextField(30);
        binaryToDecimalText = new JTextField(30);
        hexText = new JTextField(30);
        hexToDecimalText = new JTextField(30);
        convertBinary = new JButton("Convert to Decimal");
        convertHex = new JButton("Convert to Decimal");

        mainPanel.add(new Label("Binary String"));
        mainPanel.add(binaryText);
        mainPanel.add(new Label("Decimal String"));
        mainPanel.add(binaryToDecimalText);
        binaryToDecimalText.setEditable(false);
        mainPanel.add(convertBinary);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(3, 2));

        bottomPanel.add(new Label("Hexadecimal String"));
        bottomPanel.add(hexText);
        bottomPanel.add(new Label("Decimal String"));
        bottomPanel.add(hexToDecimalText);
        hexToDecimalText.setEditable(false);
        bottomPanel.add(convertHex);


        getContentPane().add(mainPanel, BorderLayout.CENTER);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        convertBinary.addActionListener(new ButtonListener());
        convertHex.addActionListener(new ButtonListener());
    }

    public static void main(String[] args) {
        Assignment1 frame = new Assignment1();
        frame.pack();
        frame.setTitle("Assignment 1: Exception Handling");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == convertBinary) {
                String decimal = convertBinary(binaryText.getText());
                binaryToDecimalText.setText(decimal);
            }
            else if (event.getSource() == convertHex) {
                String decimal = convertHex(hexText.getText());
                hexToDecimalText.setText(decimal);
            }
        }
    }


    public static String convertBinary(String binaryString) {

        int value = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);

            if (ch == '0' || ch == '1') {
                value = value * 2 + binaryString.charAt(i) - '0';
            }
            else {
                throw new NumberFormatException("Illegal character: " + ch);
            }
        }
        
        return Integer.toString(value);
    }

    public static String convertHex(String hexString) {

        return "example";
    }
}
