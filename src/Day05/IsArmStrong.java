package Day05;
import java.util.Scanner;
public class IsArmStrong{
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean result=isArmStrong(number);
        if(result){
            System.out.println("It is a Armstrong Number");
        }
        else{
            System.out.println("It is not a Armstrong Number");
        }
        sc.close();
    }
    static boolean isArmStrong(int number){
        int temp=number;
        int count=0;
        while (temp > 0){
            temp/=10;
            count++;

        }
        temp=number;
        int sum=0;

        while(temp>0) {
            int power=1;
            int digit = temp % 10;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp /= 10;
        }
        return sum==number;
    }
}