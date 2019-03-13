package pl.repec.calcbasic;


public class CalcCtrl implements ViewControllerCallback {
     ICalcView iCalcView;
     CalcModel calcModel;

    public CalcCtrl() {
//        this.iCalcView = iCalcView;
//        iCalcView.setCallbackHandler(this);
//        this.calcModel = calcModel;
        //init();
    }

    public void init(ViewControllerCallback callback) {
        iCalcView.setCallbackHandler(callback);
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
                System.out.println("Add your own actions");
        }
        return null;
    }
}
