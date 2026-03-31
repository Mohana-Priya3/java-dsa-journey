package Day06_Array;
import java.util.Scanner;
public class Sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the value");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }int result=sum(arr);
        System.out.println("The Sum of Elements are: "+result);

        sc.close();
    }
    static int sum(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
        }
        return total;
    }
}
