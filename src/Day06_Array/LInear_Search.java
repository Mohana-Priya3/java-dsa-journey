package Day06_Array;
import java.util.Scanner;
public class LInear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int a[] = {2, 8, 9, 0, 7, 5};
        int target = sc.nextInt();
        boolean found = linear(a,target);
        if (!found) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is found");
        }
        sc.close();
    }
    static boolean linear(int []a,int target){

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
               return true;
            }
        }
        return false;
        }
}
