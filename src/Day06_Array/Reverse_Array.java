package Day06_Array;
import java.util.Scanner;
public class Reverse_Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("Enter valid size");
            sc.close();
            return;
        }
        int original_array[]=new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<original_array.length;i++){
            original_array[i]=sc.nextInt();
        }
        reversed(original_array);
        System.out.println("The reverse array is: ");
        for(int j=0;j<original_array.length;j++){
            System.out.println(original_array[j]);
        }
        sc.close();
    }
    static void reversed(int[]original_array){
        for(int i=0,j=original_array.length-1;i<j;i++,j--){
            int temp=original_array[i];
            original_array[i]=original_array[j];
            original_array[j]=temp;
        }

    }
}
