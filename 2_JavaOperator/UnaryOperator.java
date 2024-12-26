public class UnaryOperator {
    public static void main(String[] args) {
         int a=5;  // UnaryOperator (++  increment Operator  a++ postfix increment, ++a prefix operator)
        int b=5;   //               (-- decrement Operator  a-- , --a )

        System.out.println(a++); //5
        System.out.println(a);  //6

        System.out.println(++b);  //6
        System.out.println(b);  // 6

        int x = a++;
        int y = ++b;

        System.out.println(x); //6
        System.out.println(y); //7 

        System.out.println(a); //7
        System.out.println(b); //7
    }
}


