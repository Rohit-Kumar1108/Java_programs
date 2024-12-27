import java.util.Scanner;

public class Q12_OnlyDivisibleBtFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 != 0) {
            System.out.println(n + " is divisible by 5 but not divisible by 3");
        } else {
            System.out.println(n + " is not divisible by only  5 ");
        }
    }

}
