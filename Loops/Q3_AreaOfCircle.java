
// Write a program to display area of 8 diffrent circle

import java.util.Scanner;
public class Q3_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=1;
        while (a<=8) {
            System.out.println("Enter radious : ");
            int r=sc.nextInt();
            System.out.println(" area of circle = "+ (3.14*r*r));
            a++;
        }
    }
}
