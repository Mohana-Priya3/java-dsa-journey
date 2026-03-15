package Loops.DAY3;

public class Pattern2 {
    public static void main(String[]args){
        for(int rows=1;rows<=5;rows++){
            for(int star=5;star>=rows;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
