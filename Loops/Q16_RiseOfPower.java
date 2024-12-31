
// Given 2 number a and b. Find a raise to the power b.

import java.util.Scanner;
public class Q16_RiseOfPower {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a ");
        int a=sc.nextInt();

        System.out.println("Enter b : ");
        int b=sc.nextInt();
        int power=1;
        for(int i=1; i<=b; i++){
            power=power*a;
        }
        System.out.println(power);
    }
}