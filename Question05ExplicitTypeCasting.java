import java.util.Scanner;

public class Question05ExplicitTypeCasting {
    public void convert(double number) {
        int converted = (int) number;
        System.out.println("Original value: " + number);
        System.out.println("Converted integer: " + converted);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a floating-point number: ");
            new Question05ExplicitTypeCasting().convert(input.nextDouble());
        }
    }
}