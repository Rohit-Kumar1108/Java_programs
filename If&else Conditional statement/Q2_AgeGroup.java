
// Write a program to devide people into three age groups depending upon their age .

import java.util.Scanner;
public class Q2_AgeGroup {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        if (age<12) {                                            
            System.out.println("Child ");    
        }else if (age<=18) {
            System.out.println("Teenage");
        }else{
            System.out.println("Adult");
        }
    }
    
}
