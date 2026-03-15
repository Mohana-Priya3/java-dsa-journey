package Loops.DAY3;

public class Pattern4 {
    public static void main(String[]args){
        for(int row=1;row<=5;row++){
            for(int number=5;number>=row;number--){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
