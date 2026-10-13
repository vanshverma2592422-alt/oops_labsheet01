import java.util.Scanner;

public class Question20MarriageEligibility {
    public void check(int age, String gender) {
        if (gender.equalsIgnoreCase("male")) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible (male age must be at least 21)");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age >= 18) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible (female age must be at least 18)");
            }
        } else {
            System.out.println("Please enter gender as male or female.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = input.nextInt();
            System.out.print("Enter gender (male/female): ");
            String gender = input.next();
            new Question20MarriageEligibility().check(age, gender);
        }
    }
}