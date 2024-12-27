
// if cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss.also determine how much profit he made or loss he incurred  

import java.util.Scanner;
public class Q7_ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter cost price : ");
        int cp=sc.nextInt();
        
        System.out.println("Enter selling price : ");
        int sp=sc.nextInt();


        if (sp>cp) {
            System.out.println("Your profit is = "+(sp-cp));
        }else{
            System.out.println("You incurred a loss = "+ (sp-cp));
        }
        
    }
}
