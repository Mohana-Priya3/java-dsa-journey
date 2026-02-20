package Day02;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[]args){
         System.out.println("Enter a: ");
         Scanner sc =new Scanner(System.in);
         int a=sc.nextInt();
         if(a<0)
             System.out.println("Invalid Input");
         else if (a % 2 == 0)
                 System.out.println("Even");
         else
                 System.out.println("Odd");
         sc.close();

    }
}
