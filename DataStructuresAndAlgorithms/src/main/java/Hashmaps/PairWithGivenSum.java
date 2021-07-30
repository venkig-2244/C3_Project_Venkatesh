package Hashmaps;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
    public static boolean perform(int[] arr, int targetSum) {
        Set<Integer> hashSet = new HashSet<> ();
        for(int i = 0; i < arr.length; i++) {
            hashSet.add (arr[i]);
        }

        Object[] arr1 = hashSet.toArray();

        for(int i = 0; i < arr1.length; i++) {
            int diff = targetSum - (int)arr1[i];
            if(hashSet.contains (diff))
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 40, 8, -7, 3, 15};

        System.out.println (perform (arr, 17));
    }
}
