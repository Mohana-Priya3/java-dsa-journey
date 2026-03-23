package Day05;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = gcd(a, b);
        int lcm=(a*b)/gcd(a,b);
        System.out.println(result);
        System.out.println(lcm);
        sc.close();
    }

    static int gcd(int a, int b) {
        while (b > 0) {
            int temp=b;
            b = a % b;
            a=temp;
        }
        return a;
    }
}
