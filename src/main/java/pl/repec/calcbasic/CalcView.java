package pl.repec.calcbasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JTextField result = new JTextField(20);

    private JButton add = new JButton("+");
    private JButton subtract = new JButton("-");
    private JButton multilpy = new JButton("x");
    private JButton devide = new JButton("/");

    public CalcView() throws HeadlessException {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 120);

        calcPanel.add(firstNumber);
        calcPanel.add(secondNumber);

        calcPanel.add(add);
        calcPanel.add(subtract);
        calcPanel.add(multilpy);
        calcPanel.add(devide);

        calcPanel.add(result);

        this.add(calcPanel);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public double getResult() {
        return Double.parseDouble(result.getText());
    }

    public void setResult(double calcResult) {
        result.setText(Double.toString(calcResult));
    }

    public void addAddListener(ActionListener listenerForAddButton) {
        add.addActionListener(listenerForAddButton);
    }

    public void addSubtractListener(ActionListener listenerForSubtractButton) {
        subtract.addActionListener(listenerForSubtractButton);
    }

    public void addMultiplyListener(ActionListener listenerForMultiplyButton) {
        multilpy.addActionListener(listenerForMultiplyButton);
    }

    public void addDevideListener(ActionListener listenerForDevideButton) {
        devide.addActionListener(listenerForDevideButton);
    }

    public void displayError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
