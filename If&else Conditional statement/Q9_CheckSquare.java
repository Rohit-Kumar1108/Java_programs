import java.util.Scanner;

public class Q9_CheckSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght : ");
        int lenght=sc.nextInt();
        System.out.println("Enter breath : ");
        int breadth=sc.nextInt();
        if (lenght==breadth) {
            System.out.println("yes it is square ");
        }else{
            System.out.println("not square :import java.util");
        }
    }
}