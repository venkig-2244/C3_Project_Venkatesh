import java.util.Scanner;

public class Palindrome {

    static Boolean usingRecursion(int[] num) {
        return false;
    }

    static Boolean usingLinear(int[] num) {

        int lastLen = num.length;
        Boolean retVal = true;

        for(int i = 0; i < num.length/2; i++, lastLen--) {
            if(num[i] != num[lastLen-1])
                retVal = false;
                break;
        }

        return retVal;
    }

    static Boolean usingRecursion(int[] num, int index) {
        int lastIndex = num.length - 1 - index;

        if (num[index] != num[lastIndex])
            return false;
        else if(index > lastIndex)
            return true;

        index += 1;
        return usingRecursion (num, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];

        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();

       //System.out.println (usingLinear (num));
        System.out.println (usingRecursion (num, 0));
    }
}

