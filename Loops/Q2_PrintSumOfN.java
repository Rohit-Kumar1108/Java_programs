
// Print the sum of the first n natural numbers, where n is the input

import java.util.Scanner;

public class Q2_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while (num <= n) {
            sum = sum + num;
            num++;
        }
        System.out.println("Sum of n Natural number is = " + sum);
    }
}
