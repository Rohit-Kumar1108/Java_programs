
import java.util.Scanner;
public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[12];
        for(int i=0; i<12; i++){
            System.out.print("Enter the number :  ");
            arr[i]=sc.nextInt();
        }
        for(int k:arr){
            if(k%2==0){
                System.out.println(k);
            }
        }

    }
}
