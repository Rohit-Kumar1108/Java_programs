import java.util.Scanner;

public class Qns5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a array elements : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("ENTER A ELEMENTS DO YOU WANTS :");
        int s = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (arr[i] == s) {
                System.out.println("ELEMENT FOUND AT INDEX : " + i);

            }
        }
    }
}