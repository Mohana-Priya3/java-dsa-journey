package Day05;

public class Reverse {
    public static void main(String[]args){
        int number=549;
        int result=reverse(number);
        System.out.println("Reverse of a number is "+result);
    }
    static int reverse(int number){
        int digit=0;
        int reverse=0;
        while(number>0){
            digit=number%10;
            reverse=reverse*10+digit;
            number/=10;
        }
        return reverse;
    }
}
