package Day06_Array;
public class Minimum {
    public static void  main(String[]args){
        int []arr={10,3,5,8,1};
        if(arr.length==0){
            System.out.println("Your array is empty");
            return;
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum Element is "+min);
    }
}
