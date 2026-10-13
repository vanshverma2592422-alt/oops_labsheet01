import java.util.Scanner;

public class Question10GreatestOfTwo {
    public void findGreatest(int first, int second) {
        if (first > second) {
            System.out.println("Greatest: " + first);
        } else if (second > first) {
            System.out.println("Greatest: " + second);
        } else {
            System.out.println("Both numbers are equal: " + first);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        new Question10GreatestOfTwo().findGreatest(first, second);
    }
}