package Day4;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[]args){
        System.out.println("Enter the value of n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
           for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int number=1;number<=row;number++){
                System.out.print(number);
            }
            System.out.println();
        }
        sc.close();

    }
}
