import java.util.Scanner;

public class Question13PositiveNegativeZero {
    public void classify(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        new Question13PositiveNegativeZero().classify(input.nextInt());
    }
}