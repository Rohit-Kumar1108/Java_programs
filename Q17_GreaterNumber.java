
// Greater of three number : 
import java.util.Scanner;
public class Q17_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter Second  number : ");
        int b=sc.nextInt();
        System.out.println("Enter third number : ");
        int c=sc.nextInt();



        if(a>b&&a>c){
            System.out.println("Greater number is : "+a);
        }else if (b>c) {
            System.out.println("Greater number is :" +b);
            
        }else{
            System.out.println("Greater number is : "+c);
        }
    }
}
