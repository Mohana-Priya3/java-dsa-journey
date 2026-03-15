package Loops.DAY3;
import java.util.Scanner;
public class Count {
    public static void main(String[]args){
        System.out.println("Enter the digit");
        Scanner sc=new Scanner(System.in);
        int Digit=sc.nextInt();
        int count=0;
        while(Digit>0){
            Digit=Digit/10;
            count++;
        }
        System.out.println("Count : "+count);
        sc.close();
    }
}
