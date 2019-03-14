package pl.repec.calcbasic;


public class CalcBasicApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }
}

class Calculator {

    Calculator() {
        CalcModel model = new CalcModel();
        CalcCtrl calcCtrl = new CalcCtrl();
//        ICalcView view = new ConsoleView(calcCtrl);
//
//        calcCtrl.calcModel = model;
//        calcCtrl.iCalcView = view;
    }
}