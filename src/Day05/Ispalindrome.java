import java.util.Scanner;
public class Ispalindrome{
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        boolean result= ispalindrome(number);
        if(result){
            System.out.println("it is a Palindrome");
        }else{
            System.out.println("it is not a Palindrome");
        }
        sc.close();
    }
    static boolean ispalindrome(int number){
        int temp=number;
        int reverse=0;
        while(temp>0){
           int  digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
            return reverse==number;
        }
    }
