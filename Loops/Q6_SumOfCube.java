
// Write a program to display sum of cube of 1 to n

import java.util.Scanner;
public class Q6_SumOfCube{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt();
        int a=1;
        int sum=0;
        while (a<=n) {
            sum=sum+a*a*a;
            a++;
        }
        System.out.println(sum);
    }
}
