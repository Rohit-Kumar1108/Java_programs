
// Count total number of digit present in any number :

import java.util.Scanner;
public class Q8_CountOddDigitInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int count=0,d;

        while (n!=0) {
            d=n%10;
            if (d%2!=0) {
                count++;
            }
            n=n/10;
        }
        System.out.println("Total odd digit "+ count);
    }
}
