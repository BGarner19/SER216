/**
 * @author Bailey Garner
 * @version 1.0.0 Jan. 24, 2018
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Assignment1 class creates the GUI using JFrame
 */

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

    /**
     * Main method to execute the program
     * @param args arguments to execute the program
     */

    public static void main(String[] args) {
        Assignment1 frame = new Assignment1();
        frame.pack();
        frame.setTitle("Assignment 1: Exception Handling");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * ButtonListener is a class that implements the ActionListener interface to handle events from button presses on the GUI
     */

    private class ButtonListener implements ActionListener {

        /**
         * actionPerformed method implemented from ActionListener to define functionality of button presses
         * @param event the event that triggers the listener
         */

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

        /**
         * convertBinary converts a given binary number to decimal format
         * @param binaryString input containing a given binary number to convert
         * @return a string containing the string representation of the decimal number conversion
         * @throws BinaryNumberFormatException when given binaryString is incorrect
         */

        private String convertBinary(String binaryString) {

            long value = 0;

            for (int i = 0; i < binaryString.length(); i++) {
                char ch = binaryString.charAt(i);

                try {
                    if (ch == '0' || ch == '1') {
                        value = value * 2 + binaryString.charAt(i) - '0';
                    }
                    else {
                        throw new BinaryNumberFormatException(ch);
                    }
                }
                catch (BinaryNumberFormatException ex) {
                    return "Invalid format for a binary string - Illegal character: " + ex.getIllegalCharacter();
                }

            }

            return Long.toString(value);
        }

        /**
         * convertHex converts a given hexadecimal number to decimal format
         * @param hexString a given hexadecimal number in string format
         * @return a string containing the string representation of the converted decimal
         * @throws HexNumberFormatException when given hexString is of incorrect format
         */

        private String convertHex(String hexString) {

            long value = 0;
            String digits = "0123456789ABCDEF";

            hexString = hexString.toUpperCase();

            for (int i = 0; i < hexString.length(); i++) {
                char ch = hexString.charAt(i);
                int digit = digits.indexOf(ch);

                try {
                    if (digit != -1) {
                        value = 16*value + digit;
                    }
                    else {
                        throw new HexNumberFormatException(ch);
                    }
                }
                catch (HexNumberFormatException ex) {
                    return "Invalid format for a Hexadecimal string - Illegal character: " + ex.getIllegalCharacter();
                }
            }
            return Long.toString(value);
        }
    }
}
