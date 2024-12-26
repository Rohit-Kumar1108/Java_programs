public class LogicalOperator {
    public static void main(String[] args) {
        int a=15;
        int b=10;
        int c=5;

        // && Operator (when all condition are true then return true otherwise return false  
        System.out.println((a>b)&&(a>c)); //true
        System.out.println((a>b)&&(a>c)); //true

        // || Operator  (if any one Condition are true then return true )
        System.out.println((a>b)||(a<c)); //true
        System.out.println((a>b)||(a>c)); //true
        System.out.println((a<b)||(a<c)); //false


        // ! Operator  (if condition is true then ! operator return false if condition is false then its return true )
        System.out.println(!(a>b)); //false
        System.out.println(!(a==b)); //true
        System.out.println(!(a<b));  //true
    }
    
}


//Logical Operaytor 
// && (Logical AND)
// || (Logical OR)
// ! (Logical NOT)