package Day05;
import java.util.Scanner;
public class Isprime {
    public static void main(String[]args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isprime(n);
        if (result) {
            System.out.println(" It is a Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }
    static boolean isprime(int n){
    if(n<=1){
        return false;
    }
    for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
        }
    }
     return true;
    }
}
