import java.util.Scanner;

public class Question09MarksAndResult {
    public void calculate(double first, double second, double third) {
        double total = first + second + third;
        double percentage = total / 3.0;
        System.out.println("Total marks: " + total + " / 300");
        System.out.println("Percentage: " + percentage + "%");
        if (first >= 40 && second >= 40 && third >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail (at least 40 marks are required in each subject)");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks for three subjects (out of 100 each): ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        new Question09MarksAndResult().calculate(first, second, third);
    }
}