package pl.repec.calcbasic;


public class CalcBasicApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }
}

class Calculator {

    Calculator() {
        ICalcView view = new ConsoleView();
        CalcModel model = new CalcModel();
        CalcCtrl calcCtrl = new CalcCtrl();

        calcCtrl.calcModel = model;
        calcCtrl.iCalcView = view;
        calcCtrl.init(calcCtrl);
    }
}