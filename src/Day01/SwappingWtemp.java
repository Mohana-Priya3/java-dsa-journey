package Day01;

public class SwappingWtemp {
    public static void main(String[]args){
        int a=3,b=4;
        a=a+b;
        b=a-b;



        a=a-b;
        System.out.println("without temp: "+a +" "+b);
    }
}

