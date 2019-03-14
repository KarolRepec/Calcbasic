package pl.repec.calcbasic;


public class CalcBasicApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }
}

class Calculator {

    Calculator() {
        CalcCtrl calcCtrl = new CalcCtrl();
    }
}