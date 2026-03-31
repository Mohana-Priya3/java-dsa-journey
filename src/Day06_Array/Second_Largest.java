package Day06_Array;
public class Second_Largest {
    public static void main(String[]args){
        int[]arr={ 1,3,45,60,8,5,23,95,70,46,9};
        if(arr.length==0){
            System.out.println("Your Array is Empty");
            return;
        }
        int result=second(arr);
        System.out.println("The Second Largest Element is "+result);
    }
    static int second(int arr[]){
        int maximum=arr[0];
        int second_maximum=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > maximum) {
                second_maximum = maximum;
                maximum = arr[i];
            }else if(arr[i]>second_maximum&&arr[i]!=maximum){
                second_maximum=arr[i];
            }
        }
            return second_maximum;
    }
}
