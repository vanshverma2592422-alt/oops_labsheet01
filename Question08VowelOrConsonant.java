import java.util.Scanner;

public class Question08VowelOrConsonant {
    public void check(char character) {
        char letter = Character.toLowerCase(character);
        if (letter < 'a' || letter > 'z') {
            System.out.println("Please enter an English alphabet letter.");
        } else if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is a consonant.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one character: ");
        new Question08VowelOrConsonant().check(input.next().charAt(0));
    }
}