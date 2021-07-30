public class Q2 {

    public static int evenSum(int n) {
        if(n <= 1)
            return 0;

        else if (n % 2 == 0)
            return (n + evenSum(n - 1));
        else
            return evenSum(n - 1);
    }

    private static int evenSum1(int n){
        return (n/2)*(1 + n/2);
    }
    public static void main(String[] args) {
        System.out.println (evenSum (10));
        System.out.println (evenSum1 (10));
    }
}
