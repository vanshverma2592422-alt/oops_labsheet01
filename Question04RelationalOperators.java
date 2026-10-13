import java.util.Scanner;

public class Question04RelationalOperators {
    public void compare(int first, int second) {
        System.out.println(first + " == " + second + ": " + (first == second));
        System.out.println(first + " != " + second + ": " + (first != second));
        System.out.println(first + " > " + second + ": " + (first > second));
        System.out.println(first + " < " + second + ": " + (first < second));
        System.out.println(first + " >= " + second + ": " + (first >= second));
        System.out.println(first + " <= " + second + ": " + (first <= second));
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter two integers: ");
            int first = input.nextInt();
            int second = input.nextInt();
            new Question04RelationalOperators().compare(first, second);
        }
    }
}