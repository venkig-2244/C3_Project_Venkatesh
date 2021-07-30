package Hashmaps;

import java.util.*;

public class FirstUniqueCharacter {
    public static void printFirstUniqueChar(char[] arr) {
        HashMap<Character, Integer> map = new HashMap<> ();
        for (char ch : arr) {
            if (map.containsKey (ch)) {
                map.put (ch, (map.get (ch)+1));
            }
            else {
                map.put (ch, 1);
            }
        }
        for (char ch : arr) {
            if(map.get (ch) == 1) {
                System.out.println (ch);
                break;
            }
        }

    }
    public static void main(String[] args) {
//            printFirstUniqueChar ("abcdabdef".toCharArray ());

        int[] array = {4, 5, 8, 9, 7, 6, 7, 3, 3};
        Set<Integer> hashSet = new HashSet<> ();

        for (int i = 0; i < array.length; i++)
            hashSet.add(array[i]);

        Object[] array1 = hashSet.toArray ();
        boolean ret = true;
        System.out.println (array1.length);
        for(int i = 0; i < array1.length-1; i++) {

            if((int) array1[i+1] - (int) array1[i] != 1) {
                ret = false;
                break;
            }
        }
        System.out.println (ret);

    }


}
