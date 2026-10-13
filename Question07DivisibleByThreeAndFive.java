import java.util.Scanner;

public class Question07DivisibleByThreeAndFive {
    public void check(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        new Question07DivisibleByThreeAndFive().check(input.nextInt());
    }
}