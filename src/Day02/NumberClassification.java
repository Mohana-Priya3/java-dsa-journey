package Day02;
import java.util.Scanner;
public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid Input");
            return;
        }
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Zero");
        } else if (num > 0) {
            System.out.println((num % 2 == 0)
                    ? "Positive Even"
                    : "Positive Odd");
        } else {
            System.out.println((num % 2 == 0)
                    ? "Negative Even"
                    : "Negative Odd");
        }

        sc.close();
    }
}

