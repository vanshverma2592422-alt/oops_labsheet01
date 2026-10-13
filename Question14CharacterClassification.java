import java.util.Scanner;

public class Question14CharacterClassification {
    public void classify(char character) {
        if (Character.isDigit(character)) {
            System.out.println("Digit");
        } else if (Character.isUpperCase(character)) {
            System.out.println("Uppercase letter");
        } else if (Character.isLowerCase(character)) {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Special character");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one character: ");
        new Question14CharacterClassification().classify(input.next().charAt(0));
    }
}