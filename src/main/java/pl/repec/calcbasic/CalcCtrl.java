package pl.repec.calcbasic;


public class CalcCtrl implements ViewControllerCallback {
     ICalcView iCalcView;
     CalcModel calcModel;

    CalcCtrl() {
        iCalcView = new ConsoleView(this);
        calcModel = new CalcModel();

        iCalcView.start();
    }


    public void addNumbers() {

        double firstNumber, secondNumber = 0;

        try {
            firstNumber = iCalcView.getFirstNumber();
            secondNumber = iCalcView.getSecondNumber();

            calcModel.addTwoNumbers(firstNumber, secondNumber);

            iCalcView.setResult(calcModel.getResult());
        } catch (NumberFormatException ex) {
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
        } catch (NumberFormatException ex) {
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
        } catch (NumberFormatException ex) {
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
        } catch (NumberFormatException ex) {
            iCalcView.displayError("you need to input two numbers");
        }

    }

    public Double getResult(Double firstDigit, Double secondDigit, OperationType operationType) {
        switch (operationType) {
            case ADDITION: {
                calcModel.addTwoNumbers(firstDigit, secondDigit);
            }
            default:
                System.out.println("Add your own actions, you need to handle all of the operation.");
        }
        return null;
    }
}
