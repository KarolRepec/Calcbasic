package pl.repec.calcbasic;

public class CalcModel {
    private double result;


    Double addTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public void subtractTwoNUmbers(double firstNuber, double secondNumber) {
        result = firstNuber - secondNumber;
    }

    public void multiplyTwoNumbers(double firstNumber, double secondNUmber) {
        result = firstNumber * secondNUmber;
    }

    public void devideTwoNumbers(double firstNumber, double secondNumber) {
        result = firstNumber / secondNumber;
    }

    public double getResult() {
        return result;
    }
}
