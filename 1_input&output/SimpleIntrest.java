import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle : ");
        float p=sc.nextFloat();
        System.out.println("Enter Rate : ");
        float r=sc.nextFloat();
        System.out.println("Enter Time : ");
        float t=sc.nextFloat();

        float si=(p*r*t)/100;

        System.out.println("Simple intrest = "+ si);
        
    }
    
}
