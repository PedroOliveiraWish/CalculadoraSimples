// A class calculator
public class Calculator {
    // A method that return the sum between two numbers
    public double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    // A method that return to subtract between two numbers
    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    // A method that return the multiplication between two numbers
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    // A method that return the division between two numbers
    public double divide(double firstNumber, double secondNumber) {
        // if anyone try to divide a number by zero, it won't run.
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }

        return firstNumber / secondNumber;
    }
}
