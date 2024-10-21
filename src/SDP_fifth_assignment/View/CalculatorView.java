package View;

import javax.swing.*;
import java.awt.*;

// form
public class CalculatorView extends JFrame {
    // first input
    private JTextField firstNumber = new JTextField(10);
    // second input
    private JTextField secondNumber = new JTextField(10);
    // button sections
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    // result input
    private JTextField resultField = new JTextField(10);

    public CalculatorView() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("First Number:"));
        panel.add(firstNumber);

        panel.add(new JLabel("Second Number:"));
        panel.add(secondNumber);

        panel.add(new JLabel("Result:"));
        panel.add(resultField);

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        // close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // size of the window
        this.setSize(400, 300);
        this.add(panel);

        resultField.setEditable(false);
    }

    public int getFirstNumber() throws Exception {
        String input = firstNumber.getText();
        if (input.isEmpty()) {
            showAlert("First number is empty!");
            throw new Exception("First number is empty");
        }
        return Integer.parseInt(input);
    }

    public int getSecondNumber() throws Exception {
        String input = secondNumber.getText();
        if (input.isEmpty()) {
            showAlert("Second number is empty!");
            throw new Exception("Second number is empty");
        }
        return Integer.parseInt(input);
    }

    public void setResult(int result) {
        resultField.setText(Integer.toString(result));
    }

    public void showAlert(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubtractButton() {
        return subtractButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }
}
