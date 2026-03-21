package Day4;

public class Floyds {
    public static void main(String[]args){
        int n=5;
        for(int row=1;row<=n;row++){
            for(int number=1;number<=2*row;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
