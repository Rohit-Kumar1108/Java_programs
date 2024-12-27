import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNum=sc.nextInt();
        System.out.println("Enter Second number : ");
        int secondNum=sc.nextInt();
        int sum=firstNum+secondNum;
        System.out.println("Sum of two number  =  " +sum);
        sc.close();
    }
}
