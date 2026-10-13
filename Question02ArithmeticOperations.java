import java.util.Scanner;

public class Question02ArithmeticOperations {
    public void calculate(int first, int second) {
        System.out.println("Addition: " + (first + second));
        System.out.println("Subtraction: " + (first - second));
        System.out.println("Multiplication: " + (first * second));
        if (second == 0) {
            System.out.println("Division: undefined (cannot divide by zero)");
            System.out.println("Modulus: undefined (cannot divide by zero)");
        } else {
            System.out.println("Division: " + ((double) first / second));
            System.out.println("Modulus: " + (first % second));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter two integers: ");
            int first = input.nextInt();
            int second = input.nextInt();
            new Question02ArithmeticOperations().calculate(first, second);
        } finally {
            input.close();
        }
    }
}