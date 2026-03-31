
package Day06_Array;
import java.util.Scanner;
public class Count {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("invalid size");
            return;
        }
        int []arr=new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int []result=count(arr);
        System.out.println("The even  elements are :"+result[0]);
        System.out.println("The odd elements are :"+result[1]);
        sc.close();
    }
    static int []count(int arr[]){
        int count_of_even=0;
        int count_of_odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count_of_even++;
            }else{
                count_of_odd++;
            }
    }
        return new int[]{count_of_even,count_of_odd};

    }
}
