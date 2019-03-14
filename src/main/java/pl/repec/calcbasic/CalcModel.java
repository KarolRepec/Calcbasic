package pl.repec.calcbasic;

public class CalcModel implements ICalcModel {
//    private double result;


    public Double addTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public Double subtractTwoNUmbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public Double multiplyTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public Double divideTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

//    public double getResult() {
//        return result;
//    }
}
