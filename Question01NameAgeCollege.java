public class Question01NameAgeCollege {
    
    private String name = "ROHIT";
    private int age = 20;
    private String college = "XYZ College";

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Question01NameAgeCollege student = new Question01NameAgeCollege();
        student.displayDetails();
    }
}