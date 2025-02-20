import java.util.Scanner;
public class Qns1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0; i<=6; i++){
            System.out.print("Enter the number for position "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int k:arr){
            System.out.println(k*3);
        }
    }
}
