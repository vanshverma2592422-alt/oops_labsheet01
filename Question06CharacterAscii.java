import java.util.Scanner;

public class Question06CharacterAscii {
    public void printCode(char character) {
        System.out.println("Character: " + character);
        System.out.println("ASCII/Unicode code value: " + (int) character);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one character: ");
        new Question06CharacterAscii().printCode(input.next().charAt(0));
    }
}