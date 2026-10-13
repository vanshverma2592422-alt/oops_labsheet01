import java.util.Scanner;

public class Question16SalaryTax {
    public void calculate(double income) {
        if (income < 0) {
            System.out.println("Income cannot be negative.");
            return;
        }
        double rate;
        if (income <= 250000) {
            rate = 0.0;
        } else if (income <= 500000) {
            rate = 0.05;
        } else if (income <= 1000000) {
            rate = 0.20;
        } else {
            rate = 0.30;
        }
        double tax = income * rate;
        System.out.println("Tax rate: " + (rate * 100) + "%");
        System.out.println("Tax amount: " + tax);
        System.out.println("Income after tax: " + (income - tax));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual income: ");
        new Question16SalaryTax().calculate(input.nextDouble());
    }
}