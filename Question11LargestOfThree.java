import java.util.Scanner;

public class Question11LargestOfThree {
    public void findLargest(int first, int second, int third) {
        if (first >= second) {
            if (first >= third) {
                System.out.println("Largest: " + first);
            } else {
                System.out.println("Largest: " + third);
            }
        } else if (second >= third) {
            System.out.println("Largest: " + second);
        } else {
            System.out.println("Largest: " + third);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        new Question11LargestOfThree().findLargest(first, second, third);
    }
}