
// Give the lenght and breadth of a rectangle, write a program to find whetherv the area of the rectangle is greater than its perimeter.

import java.util.Scanner;
public class Q8_rectangleAndperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght : ");
        int length = sc.nextInt();
        System.out.println("Enter breadth : ");
        int breadth = sc.nextInt();

        int area = length * breadth;

        int perimeter = 2 * (length + breadth);
        if (area > perimeter) {
            System.out.println("Area is greater than perimeter");
        } else if (perimeter>area) {
            System.out.println("perimeter is greater than area :");

        } else {
            System.out.println("area and perimeter are equal : ");
        }

    }
}
