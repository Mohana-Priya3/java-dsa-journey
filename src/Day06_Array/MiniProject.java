package Day06_Array;
import java.util.Scanner;
public class MiniProject {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice 1.Array Sum 2.Find Maximum 3.Search Element");
        int choice =sc.nextInt();
        if(choice>3){
            System.out.println("Enter valid choice");
            return;
        }
        System.out.println("Enter the size");
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("Enter valid size");
            return;
        }
        int []arr=new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        switch(choice){
            case 1-> {
                int result=add(arr);
                System.out.println("The sum of Array Element is "+result);
            }
            case 2-> {
                int result=max(arr);
                System.out.println("The Maximum Element is "+result);
            }
            case 3->{
                System.out.println("Enter the target");
                int target=sc.nextInt();
                boolean result=search(arr,target);
                if(result){
                    System.out.println("Element is found");
                }else{
                    System.out.println("Element is not found");
                }
            }
            default ->{
                System.out.println("Enter valid choice");
            }
        }
        sc.close();
    }
    static int add(int[]arr){
         int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int max(int []arr ){
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
    static boolean search(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
}
