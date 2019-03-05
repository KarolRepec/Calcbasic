package pl.repec.calcbasic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {

    private CalcView calcView;
    private CalcModel calcModel;

    public CalcController(CalcView calcView, CalcModel calcModel) {
        this.calcView = calcView;
        this.calcModel = calcModel;

        this.calcView.addAddListener(new AddListener());
        this.calcView.addSubtractListener(new SubtractListener());
        this.calcView.addMultiplyListener(new MultiplyListener());
        this.calcView.addDevideListener(new DevideListener());
    }

    public class AddListener implements ActionListener {


        public void actionPerformed(ActionEvent arg0) {

            double firstNumber, secondNumber = 0;

            try {
                firstNumber = calcView.getFirstNumber();
                secondNumber = calcView.getSecondNumber();

                calcModel.addTwoNumbers(firstNumber, secondNumber);

                calcView.setResult(calcModel.getResult());
            }

            catch (NumberFormatException ex) {
                calcView.displayError("you need to input two numbers");
            }

        }
    }

    public class SubtractListener implements ActionListener {


        public void actionPerformed(ActionEvent arg0) {

            double firstNumber, secondNumber = 0;

            try {
                firstNumber = calcView.getFirstNumber();
                secondNumber = calcView.getSecondNumber();

                calcModel.subtractTwoNUmbers(firstNumber, secondNumber);

                calcView.setResult(calcModel.getResult());
            }

            catch (NumberFormatException ex) {
                calcView.displayError("you need to input two numbers");
            }

        }
    }

    public class MultiplyListener implements ActionListener {


        public void actionPerformed(ActionEvent arg0) {

            double firstNumber, secondNumber = 0;

            try {
                firstNumber = calcView.getFirstNumber();
                secondNumber = calcView.getSecondNumber();

                calcModel.multiplyTwoNumbers(firstNumber, secondNumber);

                calcView.setResult(calcModel.getResult());
            }

            catch (NumberFormatException ex) {
                calcView.displayError("you need to input two numbers");
            }

        }
    }

    public class DevideListener implements ActionListener {


        public void actionPerformed(ActionEvent arg0) {

            double firstNumber, secondNumber = 0;

            try {
                firstNumber = calcView.getFirstNumber();
                secondNumber = calcView.getSecondNumber();

                calcModel.devideTwoNumbers(firstNumber, secondNumber);

                calcView.setResult(calcModel.getResult());
            }

            catch (NumberFormatException ex) {
                calcView.displayError("you need to input two numbers");
            }

        }
    }


}
