package Day05;
import java.util.Scanner;
public class MiniProject {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.check Prime");
        System.out.println("2.Check Palindrome");
        System.out.println("3.Factorial");
        System.out.println("Enter the choice");
        int choice = sc.nextInt();
        System.out.println("Enter the value");
        int number = sc.nextInt();
        switch (choice) {
            case 1 -> {
                boolean result = isprime(number);
                if (result) {
                    System.out.println("it is  a prime number ");
                } else {
                    System.out.println("it is  not a prime number ");
                }
            }
            case 2 -> {
                boolean result = ispalindrome(number);
                if (result) {
                    System.out.println("it is  a palindome ");
                } else {
                    System.out.println("it is  not a palindome ");
                }
            }
            case 3 -> {
                int result = factorial(number);
                System.out.println("Factorial of number: " + result);
            }
            default -> {
                System.out.println("Enter valid input");
            }
        }
        sc.close();
    }
        static boolean isprime ( int number){
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <number; i++) {
                if (number%i == 0) {
                    return false;
                }
            }
            return true;
        }
        static boolean ispalindrome ( int number){
            int temp = number;
            int reverse = 0;
            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
            return reverse==number;
        }
        static int factorial ( int number){
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

        return factorial;
    }

                }