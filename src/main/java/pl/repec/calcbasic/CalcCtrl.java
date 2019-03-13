package pl.repec.calcbasic;


public class CalcCtrl {
    private ICalcView iCalcView;
    private CalcModel calcModel;

    public CalcCtrl(ICalcView iCalcView, CalcModel calcModel) {
        this.iCalcView = iCalcView;
        this.calcModel = calcModel;
    }

    public void addNumbers() {

        double firstNumber, secondNumber = 0;

        try {
            firstNumber = iCalcView.getFirstNumber();
            secondNumber = iCalcView.getSecondNumber();

            calcModel.addTwoNumbers(firstNumber, secondNumber);

            iCalcView.setResult(calcModel.getResult());
        }

        catch (NumberFormatException ex) {
            iCalcView.displayError("you need to input two numbers");
        }

    }

    public void subtractNumbers() {

        double firstNumber, secondNumber = 0;

        try {
            firstNumber = iCalcView.getFirstNumber();
            secondNumber = iCalcView.getSecondNumber();

            calcModel.subtractTwoNUmbers(firstNumber, secondNumber);

            iCalcView.setResult(calcModel.getResult());
        }

        catch (NumberFormatException ex) {
            iCalcView.displayError("you need to input two numbers");
        }

    }

    public void multiplyNumbers() {

        double firstNumber, secondNumber = 0;

        try {
            firstNumber = iCalcView.getFirstNumber();
            secondNumber = iCalcView.getSecondNumber();

            calcModel.multiplyTwoNumbers(firstNumber, secondNumber);

            iCalcView.setResult(calcModel.getResult());
        }

        catch (NumberFormatException ex) {
            iCalcView.displayError("you need to input two numbers");
        }

    }

    public void devideNumbers() {

        double firstNumber, secondNumber = 0;

        try {
            firstNumber = iCalcView.getFirstNumber();
            secondNumber = iCalcView.getSecondNumber();

            calcModel.devideTwoNumbers(firstNumber, secondNumber);

            iCalcView.setResult(calcModel.getResult());
        }

        catch (NumberFormatException ex) {
            iCalcView.displayError("you need to input two numbers");
        }

    }
}
