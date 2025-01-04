
import java.util.Scanner;
public class GreaterNUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ");
        int a=sc.nextInt();
        System.out.println("Enter b ");
        int b=sc.nextInt();
        System.out.println("Enter c ");
        int c=sc.nextInt();
        if (a>b&&a>c) {
            System.out.println("A iss greater ");
        }else if (b>c) {
            System.out.println("b iss greater ");
        }else{
            System.out.println("c is greater ");
        }
    }
}
