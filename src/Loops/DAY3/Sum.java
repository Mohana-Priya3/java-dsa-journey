package Loops.DAY3;
import java.util.Scanner;
public class Sum {
    public static void main(String[]args){
        System.out.println("Enter the value of N");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Sum=0;
        int i=0;
        while(i<N) {
            Sum = Sum + i;
            i++;
        }
            System.out.println(Sum);
        sc.close();
    }
}
