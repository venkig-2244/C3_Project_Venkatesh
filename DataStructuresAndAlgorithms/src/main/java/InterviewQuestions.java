import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InterviewQuestions {

    static void generate(char[] arr, int i, String pass, int len){
        if (i == 0) {
            System.out.println (pass);
            return;
        }

        for (int j = 0; j < len; j++) {
            String fullpwd = pass + arr[j];
            generate (arr, i-1, fullpwd, len);
        }
        return;
    }

    static void generateAllPasswords(char[] arr, int n) {

        for (int i = 0; i <= n; i++) {
            generate (arr, i, "", n);
        }

    }

    static void _printParenthesis(char str[], int pos, int n, int open, int close)
    {
        if(close == n)
        {
            // print the possible combinations
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        }
        else
        {
            if(open > close) {
                str[pos] = '}';
                _printParenthesis(str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '{';
                _printParenthesis(str, pos+1, n, open+1, close);
            }
        }
    }

    // Wrapper over _printParenthesis()
    static void printParenthesis(char str[], int n)
    {
        if(n > 0)
            _printParenthesis(str, 0, n, 0, 0);
        return;
    }

    static int duplicate(int arr[], int n)   {
        //Write code here
        int i;

        for (i = 0; i < n; i++)
        {
            if (arr[arr[i] % n] >= n)
            {
                if (arr[arr[i] % n] < 2 * n)
                {
                    return (arr[i] % n);
                }
            }

            arr[arr[i] % n] += n;
        }

        return -1;
    }

    static int nobleNum(int arr[], int n)
    {
        //Write code here
        for (int i = 0; i < n; i++ )
        {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] < arr[j])
                    count++;

            if (count == arr[i])
                return arr[i];
        }
        return -1;
    }

    static void decToBin(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];

        // counter for binary array
        int i = 0;
        while (n > 0)
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);

    }

    public static int decToBinary(int number){
        //ArrayList<String> binary = new ArrayList<String>();
        String[] binary = new String[50];

        int index=  0;

        while(number != 0){
            //binary.add(String.valueOf(number%2));
            binary[index] = String.valueOf (number%2);
            number /= 2;
        }

        int s = index+1;
        String strNum = "";
        for (int i = s-1; i >= 0; i--) {
            strNum += binary[i];
        }
        int ret = Integer.parseInt (strNum);
        System.out.println (ret);
        return ret;

    }

    static long gp(long a, long r, long n, long m)
    {
        //Write code here
        long curr_term;
        curr_term = a * (int)(Math.pow(r, n - 1));
        long val = curr_term % m;

        return val;
    }

    static void RPRE(int arr[], int n)
    {
        //Write code here
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        int[] product = new int[n];
        int temp = 1;

        for (int index = 0; index < n; index++) {
            product[index] = temp;
            temp = temp * arr[index];
        }
        temp = 1;
        for (int index = n-1; index >= 0; index--) {
            product[index] = product[index] * temp;
            temp = temp * arr[index];
        }
        for (int index = 0; index < product.length; index++) {
            System.out.println (product[index]);
        }
    }

    public static int moves(int n, char s, char d, char a) {
        if (n <= 1)
            return n;

        return moves(n-1, s, a ,d) + 1 + moves(n-1, a, d, s);
    }
    public static void main(String[] args) {
//        int n = 3;
//        char[] str = new char[2 * n];
//        printParenthesis(str, n);

//        int n;
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        char arr[] = new char[n];
//        for(int i = 0; i < n; i++)
//            arr[i] = s.next().charAt(0);
//
//        generateAllPasswords(arr, n);

//        int arr[] = { 1, 6, 3, 11, 5, 6, 6 };
//        int arr_size = arr.length;
//        System.out.println (duplicate (arr, arr_size));

//        int arr[] = {4, 5, 8, 3};
//        System.out.println (nobleNum(arr, 4));

//        int n;
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        decToBinary(n);

//        int a, r, n, m;
//        Scanner s = new Scanner(System.in);
//        a = s.nextInt();
//        r = s.nextInt();
//        n = s.nextInt();
//        m = s.nextInt();
//
//        System.out.println(gp(a, r, n, m) + "\n" );

        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        RPRE(arr, n);


    }
}
