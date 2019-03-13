package pl.repec.calcbasic;

public class CalcBasicApplication {

    public static void main(String[] args) {

//        ICalcView iCalcView = new ConsoleView();
//
//        CalcModel calcModel = new CalcModel();

        CalcCtrl calcCtrl = new CalcCtrl(new ConsoleView(),new CalcModel());

//        calcView.setVisible(true);

    }
}
