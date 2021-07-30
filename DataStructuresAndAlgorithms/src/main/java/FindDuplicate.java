import java.util.HashMap;

public class FindDuplicate {
    private static HashMap<Integer, Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < arr.length; index++) {
            if (map.containsKey(arr[index])) {
                int count = map.get (arr[index]);
                map.put (arr[index], count+1);
            } else {
                map.put (arr[index], 1);
            }
        }

        return map;
    }

    private static String reverse(String str) {
        int length = str.length ();
        String reversedStr="" ;
        int index2 = length-1;

        for (int i = 0; i < length; i++, index2--) {
            reversedStr += str.charAt (index2);
        }
        return reversedStr;
    }

    private static char[] reverse1(char[] str) {
        int length = str.length;
        int index2 = length-1;

        for (int i = 0; i < length/2; i++, index2--) {
            char temp = str[i];
            str[i] = str[index2];
            str[index2] = temp;
        }
        return str;
    }
   static void print(int n)

    {
        if (n == 0)
            return;
        System.out.println (n%2);
        System.out.println(n/2);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{3, 1, 7, 3,2,4,1,3,6,8,2,4,9,8,9};
        HashMap<Integer, Integer> dup = findDuplicates (arr);

        System.out.println (dup);
        String name = "Venkatesh";
        char[] name1 = {'V','e','n','k','a','t','e','s'};
        System.out.println (reverse1 (name1));
        print(12);
    }
}
