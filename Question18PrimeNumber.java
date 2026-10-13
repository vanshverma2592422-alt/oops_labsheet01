import java.util.Scanner;

public class Question18PrimeNumber {
    public void check(int number) {
        boolean prime = number >= 2;
        for (int divisor = 2; divisor <= number / divisor && prime; divisor++) {
            if (number % divisor == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        new Question18PrimeNumber().check(input.nextInt());
    }
}