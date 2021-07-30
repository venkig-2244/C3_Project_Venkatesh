public class Fibo {
    public static void main(String[] args) {
        //fiboWithRecursion (4);
        //Fibo f = new Fibo ();
        //System.out.print (f.fiboWithRecursion(42));
        System.out.print (Fibo.func (20));

    }

    public static int func(int n) {
        if (n == 1)
            return n;
        else
            return func(n-1);
    }
    public int fiboWithRecursion(int n) {

        if( n < 2)
            return n;

        //System.out.print (n + " ");
        else
            return (fiboWithRecursion(n-1) + fiboWithRecursion (n-2))%10;
    }

    int fiboWithoutRecursion(int n) {

        int arr[] = new int[n+1];

        if (n == 0 || n == 1)
            return n;

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <=n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
