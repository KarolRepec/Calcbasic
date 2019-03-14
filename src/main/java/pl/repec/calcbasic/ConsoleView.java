package pl.repec.calcbasic;

import java.util.Scanner;

public class ConsoleView implements ICalcView {
    private Double firstNumber;
    private Double secondNumber;
    private OperationType operationType;
    private ViewControllerCallback callback;
    private Scanner scanner = new Scanner(System.in);
    private boolean quit = false;

    ConsoleView(ViewControllerCallback callback) {
        this.callback = callback;
    }

    private void awaitUsersAction() {
        while (!quit) {
            System.out.println("\nEnter action:   (7 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    System.out.println("Provide first number");
                    this.getFirstNumber();
                    break;

                case 2:
                    System.out.println("Provide second number");
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
                    this.divideNumbers();
                    break;

                case 7:
                    this.printPossibleActions();
                    break;
            }

        }

    }

    private void getFirstNumber() {
        try {
            firstNumber = Double.parseDouble(scanner.nextLine());
        }catch (NumberFormatException e) {
            displayError("Input digits only");
        }

//        return firstNumber;
    }

    private void getSecondNumber() {
        try {
            secondNumber = Double.parseDouble(scanner.nextLine());
        }catch (NumberFormatException e) {
            displayError("Input digits only");
        }

//        return secondNumber;
    }

    private void addNumbers() {
        operationType = OperationType.ADDITION;
        handleOperation();
    }

    private void subtractNumbers() {
        operationType = OperationType.EXTRACTION;
        handleOperation();
    }

    private void handleOperation() {
        if (firstNumber == null) {
            displayError("Use '1' to input first number");
        }
        if (secondNumber == null) {
            displayError("Use '2' to input second number");
        }
        if (firstNumber != null && secondNumber != null && operationType != null) {
            System.out.println(firstNumber + " " + operationType + " " + secondNumber + " = " + callback.getResult(firstNumber, secondNumber, operationType));
        }
    }

    private void multiplyNumbers() {
        operationType = OperationType.MULTIPLICATION;
        handleOperation();
    }

    private void divideNumbers() {
        operationType = OperationType.DIVISION;
        handleOperation();
    }

    private void displayError(String errorMessage) {
        System.out.println("Booom muther fucker " + errorMessage);
    }

    public void setCallbackHandler(ViewControllerCallback callbackHandler) {
        this.callback = callbackHandler;
    }

    public void startPresentingUI() {
        printPossibleActions();
        awaitUsersAction();
    }

    private void printPossibleActions() {
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
