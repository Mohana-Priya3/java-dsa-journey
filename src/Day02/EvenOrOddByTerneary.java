package Day02;
import java.util.Scanner;
public class EvenOrOddByTerneary {
    public static void main(String[]args){
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String result=(a%2==0)?"Even":"Odd";
        System.out.println(result);
        sc.close();

    }
}
