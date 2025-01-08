
// Write a program to print the value if it is even and devisible by.

import java.util.Scanner;
public class Q3_EvenAndDivideBy3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        if (n%2==0&&n%3==0) {
            System.out.println("Found Result = "+n);
        }
    }
    
}
