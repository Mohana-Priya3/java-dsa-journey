package Loops.DAY3;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Mulplicand");
        int Multiplicand=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(i+ "*" +Multiplicand+" "+"="+(i*Multiplicand));
            i++;
        }
        sc.close();
    }
}
