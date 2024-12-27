
// Take integer input and print the absolute value of that integer.

import java.util.Scanner;
public class Q6_absoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        if (n<0) {
           n= n*(-1);
        }
        System.out.println("The absolute value is = "+ n);
        
    }
    
}
// import java.util.Scanner;
// public class Q6_absoluteValue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number: ");
//         int n = sc.nextInt();
//         n = Math.abs(n);
//         System.out.println("The absolute value is = " + n);
//         sc.close();
//     }
// }