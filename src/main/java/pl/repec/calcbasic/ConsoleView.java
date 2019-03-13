package pl.repec.calcbasic;

import java.util.Scanner;

public class ConsoleView implements ICalcView {
    private Scanner scanner = new Scanner(System.in);
    private ViewControllerCallback callback;
    private OperationType operationType;
    private Double firstNumber;
    private Double secondNumber;

    //ConsoleView() {}

        public void start() {
            boolean quit = false;
            printActions();

            firstNumber = 2.0;
            secondNumber = 2.0;
            operationType = OperationType.ADDITION;

            handleOperation();
        }
//        while (!quit) {
//            System.out.println("\nEnter action:   (6 to show available actions");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\nShutting down...");
//                    quit = true;
//                    break;
//
//                case 1:
//                    this.getFirstNumber();
//                    break;
//
//                case 2:
//                    this.getSecondNumber();
//                    break;
//
//                case 3:
//                    this.addNumbers();
//                    break;
//
//                case 4:
//                    this.subtractNumbers();
//                    break;
//
//                case 5:
//                    this.multiplyNumbers();
//                    break;
//
//                case 6:
//                    this.devideNumbers();
//                    break;
//            }

   // }

//    }

    public double getFirstNumber() {
        firstNumber = Double.parseDouble(scanner.nextLine());
        return firstNumber;
    }

    public double getSecondNumber() {
        secondNumber = Double.parseDouble(scanner.nextLine());
        return secondNumber;
    }

    public void setResult(double calcResult) {
        // Dunno what to do here, view should hold state imho
    }

    public void addNumbers() {
        if (firstNumber != null && secondNumber != null && operationType != null) {
            handleOperation();
        }
    }

    public void subtractNumbers() {
        operationType = OperationType.EXTRACTION;
        handleOperation();
    }

    private void handleOperation() {
        callback.getResult(firstNumber, secondNumber, operationType);
    }

    public void multiplyNumbers() {
        operationType = OperationType.MULTIPLICATION;
    }

    public void devideNumbers() {
        operationType = OperationType.DIVISION;
    }

    public void displayError(String errorMessage) {
        System.out.println("Booom muther fucker " + errorMessage);
    }

    public void setCallbackHandler(ViewControllerCallback callbackHandler) {
        this.callback = callbackHandler;
    }

    private void printActions() {
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
