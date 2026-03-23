package Day05;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int result=factorialofnumber(number);
        System.out.println( "factorial of "+number+" is "+result);
        sc.close();
    }
    static int factorialofnumber(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        return factorial;
    }
}
