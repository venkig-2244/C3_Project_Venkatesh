import java.util.Arrays;

public class GradedQuestions {
    public static int func(int x, int n) {
        if (n == 0)
            return 1;
        else if(n%2 == 0)
            return func(x*x, n/2);
        else
            return x*func(x*x, n/2);
    }

    public static int func1(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + func1(n/2);
    }

    public static void factorial1(int n) {

        int factorial = 1;
        int index = 1;
        for (int i = 0; i <= Math.pow(n, n); i++) {
            if (i == factorial * index) {
                factorial = i;
                index += 1;
                if (index == n + 1) {
                    System.out.println(factorial);
                    break;
                }
            }
        }
    }
    public static void factorial2(int n) {
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        System.out.println(factorials[n]);
        int val = factorials[n];

        String num = String.valueOf (factorials[n]);
        System.out.println (num);
        for (int i=num.length ()-1; i > 0; i--) {
            if (num.charAt (i) == '0')
                continue;
            else {
                String s = String.valueOf (num.charAt (i));
                System.out.println (s);
                System.out.println (num.charAt (i));
                break;
            }
        }

    }

//    static int product(int a, int b)
//    {
//        if (a > 0 && b< 0) {
//            return product(b, a);
//        }
//        else if (a < 0 && a < 0) {
//            return product ((-1 * a), (-1 * b));
//        }
//        if (a > b) {
//            return product(a, b);
//        }
//        else if (b != 0) {
//            return a + product (a, b - 1);
//        }
//
//        // if a is less than
//        // b swap the numbers
//        if (a > b)
//            return product(b, a);
//
//            // iteratively calculate
//            // b times sum of a
//        else if (b != 0)
//            return (a + product(a, b - 1));
//
//            // if any of the two numbers is
//            // zero return zero
//        else
//            return 0;
//    }
    static int findProduct(int a, int b)
    {
        // case 1 : a<0 and b>0
        // swap the position of a and b to keep second
        // parameter positive
        if (a > 0 && b < 0) {
            return findProduct (b, a);
        }
        // case 2 : both a and b are less than 0
        // return the product of their absolute values
        else if (a < 0 && b < 0) {
            return findProduct ((-1 * a), (-1 * b));
        }

        // if a>b , swap a and b so that recursion
        // takes less time
        if (a > b) {
            return findProduct (b, a);
        }

        // as long as b is not 0 recursively call multrecur for
        // a and b-1 return sum of a and the product of a times b-1
        else if (b != 0) {
            return a + findProduct (a, b - 1);
        }

        // b=0 then return 0
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        //System.out.println (func (3, 3));
        //System.out.println (func1(12));
        //factorial1(5) ;
        factorial2(10) ;
//        System.out.println (findProduct (-8, 4));
//        System.out.println (findProduct (8, -4));
//        System.out.println (findProduct (8, 4));
//        System.out.println (findProduct (-8, -4));
    }
}
