import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid Input");
            return;
        }
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
            return;
        }
        String grade = switch (marks / 10) {
            case 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6, 5 -> "C";
            default -> "Fail";
        };
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
