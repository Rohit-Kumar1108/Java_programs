
// Any year is input through the keyboard. write a program to determine whether the year is a leap year or not.

import java.util.Scanner;
public class Q5_LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year : ");
        int year=sc.nextInt();

        // divisible by 4, not by 100, or divisible by 400

        if ((year%4==0)&&(year%100!=0||year%400==0) ){
            System.out.println(year+ "  is a Leap year ");
        }else{
            System.out.println(year+"  is not a leap year");
        }
    }
}
