package pl.repec.calcbasic;

import java.util.Scanner;

public class ConsoleView implements ICalcView {
    private Scanner scanner = new Scanner(System.in);
    private CalcCtrl calcCtrl;
//    private double firstNumber;
//    private double secondNumber;
//    private double result;

    public ConsoleView() {
        this.calcCtrl = calcCtrl;

        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("\nEnter action:   (6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    this.getFirstNumber();
                    break;

                case 2:
                    this.getSecondNumber();
                    break;

                case 3:
                    this.addNumbers();
                    break;

                case 4:
                    this.subtractNumbers();
                    break;

                case 5:
                    this.multiplyNumbers();
                    break;

                case 6:
                    this.devideNumbers();
                    break;
            }

        }

    }

    public double getFirstNumber() {
        return Double.parseDouble(scanner.nextLine());
    }

    public double getSecondNumber() {
        return Double.parseDouble(scanner.nextLine());
    }

    public void addNumbers() {
        calcCtrl.addNumbers();
    }

    public void subtractNumbers() {
        calcCtrl.subtractNumbers();
    }

    public void multiplyNumbers() {
        calcCtrl.multiplyNumbers();
    }

    public void devideNumbers() {
        calcCtrl.devideNumbers();
    }

    public void setResult(double calcResult) {
        System.out.println(calcResult);
    }

    public void displayError(String errorMessage) {
        System.out.println(errorMessage);
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - type first number\n" +
                "2 - type second number\n" +
                "3 - add numbers\n" +
                "4 - subtract numbers\n" +
                "5 - multiply numbers\n" +
                "6 - devide numbers");
        System.out.println("Choose your action: ");
    }

}
