package pl.repec.calcbasic;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CalcCtrl implements ViewControllerCallback {
    private ICalcView iCalcView;
    private CalcModel calcModel;

    CalcCtrl() {
        iCalcView = new ConsoleView(this);
        calcModel = new CalcModel();
        iCalcView.startPresentingUI();
    }

    public Double getResult(Double firstDigit, Double secondDigit, OperationType operationType) {
        switch (operationType) {
            case MULTIPLICATION:
                //TODO: Add implementation
                break;
            case ADDITION: {
                return calcModel.addTwoNumbers(firstDigit, secondDigit);
            }
            case DIVISION:
                //TODO: Add implementation
                break;
            case EXTRACTION:
                //TODO: Add implementation
                break;
            default:
                System.out.println("Add your own actions, you need to handle all of the operation.");
                throw new NotImplementedException();
        }
        return null;
    }
}
