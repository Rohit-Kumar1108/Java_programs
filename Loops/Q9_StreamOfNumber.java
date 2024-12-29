
// Print the sum of the stream of integer in the input

import java.util.Scanner;

public class Q9_StreamOfNumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int sum=0;
        while (n!=-1) {
            sum=sum+n;
            n=sc.nextInt();
        }
        System.out.println("Sum of all number = "+ sum);
    }
}
