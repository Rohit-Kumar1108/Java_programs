import java.util.Scanner;

public class Q11_CheckThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr a number : ");
        int num = sc.nextInt();
        sc.close();
        if (num >= 100 && num <= 999) {
            System.out.println(num +" is a three digit number");
        } else {
            System.out.println(num +" is not a three digit number");
        }
    }
}