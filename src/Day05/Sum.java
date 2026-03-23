package Day05;

public class Sum {
    public static void main(String[]args){
        int number = 2345;
        int result=sumofdigit(number);
        System.out.println("Sum of Digit is "+result);
    }
    static int sumofdigit(int number){
        int sum=0;
        while(number>0){
            int digit=number%10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }
}
