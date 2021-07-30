import java.util.Scanner;

public class SumOfDigits {
    private static int usingLinear(int n) {

        int num, reminder, sum = 0;
        num = n;
        while(num > 0) {
            reminder = num%10;
            sum += reminder;
            num = num/10;
        }
        return sum;
    }

    private static int usingRecursion(int n) {
        int sum = 0;
        if (n <= 0)
            return 0;

        sum += n % 10;
        return (sum + usingRecursion (n/10));
    }

    static int digSum(int n)
    {
        int sum = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter number: ");
        int n = sc.nextInt ();
        System.out.println (usingLinear (n));
        System.out.println (usingRecursion (n));
        System.out.println (digSum (n));
    }
}
