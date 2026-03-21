package Day4;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[]args){
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            for(int star=n;star>=row;star--){
                System.out.print("*");
            }
            System.out.println();
        }
        scr.close();
    }
}
