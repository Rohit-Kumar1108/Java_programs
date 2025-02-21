

// Write program to factorial of a number 

import java.util.Scanner;
public class Q7Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to display factorial : ");
        int n=sc.nextInt();
        int fact=1;
        int a=1;
        while (a<=n) {
            fact=fact*a;
            a++;
        }
        System.out.println("factorial = "+fact);
    }
}
