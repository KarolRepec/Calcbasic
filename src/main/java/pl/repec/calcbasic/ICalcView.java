package pl.repec.calcbasic;


public interface ICalcView {
    double getFirstNumber();
    double getSecondNumber();
    void setResult(double calcResult);
    void addNumbers();
    void subtractNumbers();
    void multiplyNumbers();
    void devideNumbers();
    void displayError(String errorMessage);
}
