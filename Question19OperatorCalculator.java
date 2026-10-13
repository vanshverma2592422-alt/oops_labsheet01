import java.util.Scanner;

public class Question19OperatorCalculator {
    public void calculate(char operator, double first, double second) {
        if (operator == '+') {
            System.out.println("Result: " + (first + second));
        } else if (operator == '-') {
            System.out.println("Result: " + (first - second));
        } else if (operator == '*') {
            System.out.println("Result: " + (first * second));
        } else if (operator == '/') {
            if (second == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                System.out.println("Result: " + (first / second));
            }
        } else {
            System.out.println("Invalid operator. Use +, -, *, or /.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.print("Enter two numbers: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        new Question19OperatorCalculator().calculate(operator, first, second);
    }
}