package Day02;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        if (!sc.hasNextInt()) { System.out.println("Invalid Input"); return; }
        int a = sc.nextInt();

        if (!sc.hasNextInt()) { System.out.println("Invalid Input"); return; }
        int b = sc.nextInt();

        if (!sc.hasNextInt()) { System.out.println("Invalid Input"); return; }
        int c = sc.nextInt();

        int largest;

        if (a >= b) {
            if (a >= c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        System.out.println("Largest: " + largest);

        sc.close();
    }
}

