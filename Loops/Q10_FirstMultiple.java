
// Print the first multiple of 5 which is also a multiple of 7

import java.util.Scanner;

public class Q10_FirstMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (true) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
