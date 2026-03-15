import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        System.out.println("Enter the Number to Reverse");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int reverse=0;
        while(number>0){
            reverse=reverse*10+number%10;
            number=number/10;
        }

        System.out.println("Reverse Number "+reverse);
        sc.close();
    }
}