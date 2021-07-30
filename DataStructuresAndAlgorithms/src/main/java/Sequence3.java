import java.util.Scanner;

public class Sequence3 {

    private  static int fibonacci(int n) {

        int a = 0;
        int b = 1;
        int c = n;

        //System.out.print (a + " " + b);
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

            //System.out.print (" " + c);
        }
        //System.out.println ();

        return c;
    }

    public static void main(String[] args) {
        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println (Sequence3.fibonacci (n));
    }
}
