package Day06_Array;
import java.util.Scanner;
public class Input {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the value");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Elements are :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
