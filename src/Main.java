import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Welcome to Calculator");

        boolean running = true;

        while (running) {
            System.out.println("Please, type the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Please, type the second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("Please, choose the operator: (+ , - , * , / )");
            String operator = scanner.next();

            double result = 0;

            switch (operator) {
                case "+":
                    result = calculator.sum(firstNumber, secondNumber);
                    break;
                case "-":
                    result = calculator.subtract(firstNumber, secondNumber);
                    break;
                case "*":
                    result = calculator.multiply(firstNumber, secondNumber);
                    break;
                case "/":
                    result = calculator.divide(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("Please, choose a valid operator");
                    break;
            }

            System.out.println("The result between: " + firstNumber + " " + operator + " " + secondNumber + " is: " + result);

            System.out.print("Do you want to continue calculating? (yes/no): ");
            String answer = scanner.next().toLowerCase();

            if (!answer.equals("yes")) {
                System.out.print("Thanks for using calculator!");

                running = false;
            }
        }

        scanner.close();
    }
}