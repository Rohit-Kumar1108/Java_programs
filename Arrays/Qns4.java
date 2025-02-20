
import java.util.Scanner;
public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,avg=0;
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for(int k:arr){
            sum+=k;
            avg=sum/n;
        }
        System.out.println("Sum = " +sum);
        System.out.println("Average = "+ avg);
    }
}


