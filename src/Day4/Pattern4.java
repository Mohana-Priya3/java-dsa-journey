package Day4;

public class Pattern4 {
    public static void main(String[]args){
        int n=5;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            for(int number=1;number<=n-row+1;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
