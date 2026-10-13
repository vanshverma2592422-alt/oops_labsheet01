import java.util.Scanner;

public class Question17IntegerPalindrome {
    public void check(long number) {
        if (number < 0) {
            System.out.println(number + " is not a palindrome.");
            return;
        }
        long original = number;
        long reversed = 0;
        while (number > 0) {
            int digit = (int) (number % 10);
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        new Question17IntegerPalindrome().check(input.nextLong());
    }
}