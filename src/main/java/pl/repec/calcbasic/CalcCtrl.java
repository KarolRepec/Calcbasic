package pl.repec.calcbasic;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CalcCtrl implements ViewControllerCallback {
    private ICalcView iCalcView;
    private ICalcModel iCalcModel;

    CalcCtrl() {
        iCalcView = new ConsoleView(this);
        iCalcModel = new CalcModel();
        iCalcView.startPresentingUI();
    }

    public Double getResult(Double firstDigit, Double secondDigit, OperationType operationType) {
        switch (operationType) {
            case MULTIPLICATION: {
                return iCalcModel.multiplyTwoNumbers(firstDigit, secondDigit);
            }
            case ADDITION: {
                return iCalcModel.addTwoNumbers(firstDigit, secondDigit);
            }
            case DIVISION: {
                return iCalcModel.divideTwoNumbers(firstDigit, secondDigit);
            }
            case EXTRACTION: {
                return iCalcModel.subtractTwoNUmbers(firstDigit, secondDigit);
            }
            default:
                System.out.println("Add your own actions, you need to handle all of the operation.");
                throw new NotImplementedException();
        }
    }
}
