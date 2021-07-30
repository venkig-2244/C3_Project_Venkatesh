public class RecursionExample {
    static void printNumbers(int n) {
        if (n == 0) return;
        System.out.print (n + " ");
        printNumbers (--n);
    }
    public static void main(String[] args) {
        printNumbers (100);
    }
}
