import java.util.Scanner;

public class Question03EvenOdd {
    public void check(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            new Question03EvenOdd().check(input.nextInt());
        }
    }
}