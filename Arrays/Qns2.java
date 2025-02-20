import java.util.Scanner;
public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array :  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array :  ");
            arr[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                if (arr[i]%2==0) {
                    System.out.println(arr[i]);
                }
            }
    }
}
