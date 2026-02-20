package Day02;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid Input");
            return;
        }

        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
