package Day06_Array;

public class Array_Sorted {
    public static void main(String[]args){
        int arr[]={2,34,56,8,9};
        boolean result=Sorted(arr);
        if(result) {
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
    static boolean Sorted(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
