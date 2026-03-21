package Day4;
import java.util.Scanner;
public class MiniProject {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.right triangle");
        System.out.println("2.reverse triangle");
        System.out.println("3.Number triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your option; ");
        int choice=sc.nextInt();
        if(choice==4){
            System.out.println("Existig option ");
            System.exit(0);
        }
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        switch(choice){
            case 1->{
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            case 2->{
                for(int i=1;i<=n;i++){
                    for(int j=n;j>=n;j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            case 3->{
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
            default->{
                System.out.println("Invalid option ");
            }
        }
        sc.close();
    }
}
