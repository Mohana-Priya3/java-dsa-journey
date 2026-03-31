package Day06_Array;
import java.util.Scanner;
public class Reverse {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int original_array[] = new int[size];
        if(size<=0){
            System.out.println("Enter valid size");
            return;
        }
        System.out.println("Enter the value");
        for (int i = 0; i < original_array.length; i++) {
            original_array[i] = sc.nextInt();
        }
        int result[] = reversed_array(original_array);
        System.out.println("The reversed array is ");
        for (int k = 0; k < result.length; k++) {
            System.out.println(result[k]);
        }
        sc.close();
    }
        static int []reversed_array(int original_array[]){
        int reverse_array[] = new int[original_array.length];
        int j=0;
        for(int i=original_array.length-1;i>=0;i--){
             reverse_array[j]=original_array[i];
            j++;
        }
        return reverse_array;

    }
}
