import java.util.Scanner;

public class Question15ArmstrongNumber {
    public void check(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Please enter a positive 3-digit number.");
            return;
        }
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit integer: ");
        new Question15ArmstrongNumber().check(input.nextInt());
    }
}