
// Print "Odd" if the input value is odd, otherwise print "Even".
// Note: value inputed by user 

import java.util.Scanner;
public class Q1_OddEven {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        if (n%2!=0) {                                            
            System.out.println("odd ");                        
        }else{
            System.out.println("Even ");
        }
    }
}
