package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class SymmetricPairs {

    private static void printSymmetricPairsUsingLoop(int[][] arr) {

        boolean noPair = true;
        if(arr.length <= 0) {
            System.out.println("No Symmetric pair");
            return;
        }

        for(int i= 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println ("(" + arr[i][0] + " " + arr[i][1] + ")");
                    noPair = false;
                }
            }
        }
        if(noPair)
            System.out.println("No Symmetric pair");
    }

    private static void printSymmetricPairsUsingMaps(int[][] arr) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        TreeMap

        for(int i= 0; i < arr.length; i++) {
            if(map.containsKey (arr[i][0])) {
                System.out.println ("Key already exists. No duplicate values allowed.");
            } else {
                map.put (arr[i][0], arr[i][1]);
            }

        }

        for(int i= 0; i < arr.length; i++) {
            for (int k : map.keySet ()) {
                if (k == arr[i][0]) continue;
                    int data = map.get (k);
                    if (data == arr[i][0] )
                        System.out.println (k + " : " + map.get (k));

            }
        }

    }

    public static void main(String[] args) {

//        int[][] arr = { {0, 1}, {1, 0}, {2, 5}, {5, 2}, {3, 6}, {4, 7} };
        int[][] arr = { {1, 2}, {2, 3}, {3, 4} };
        printSymmetricPairsUsingLoop (arr);
    }
}
