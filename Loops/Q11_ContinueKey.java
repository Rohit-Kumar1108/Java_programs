
// Print all the values between 1 and 50 except for the multiple of 3

import java.util.Scanner;

public class Q11_ContinueKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
