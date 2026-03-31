package Day06_Array;
import java.util.Scanner;
public class Maximum {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Enter valid size");
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result = max(arr);
        System.out.println("The maximum Element is: "+result);
        sc.close();
    }
        static int max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
