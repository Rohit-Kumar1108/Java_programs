//  Print 1 to n Number 

import java.util.Scanner;

public class Q1_PrintNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;

        }

    }
} 