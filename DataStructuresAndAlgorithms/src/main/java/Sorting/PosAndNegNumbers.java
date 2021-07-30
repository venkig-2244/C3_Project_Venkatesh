package Sorting;

import java.util.ArrayList;

public class PosAndNegNumbers {
    static void printList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.print (num + " ");
        }
        System.out.println ("");
    }

    static void partitionArray( int n, int[] arr){
        ArrayList<Integer> pos = new ArrayList<Integer> ();
        ArrayList<Integer> neg = new ArrayList<Integer> ();

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0){
                pos.add (arr[i]);
            } else {
                neg.add (arr[i]);
            }
        }
        if (arr[0] >= 0) {
            printList (pos);
            printList (neg);
        } else {
            printList (neg);
            printList (pos);
        }

        if(pos.size () <= 0) {
            System.out.println ("Array does not have positive numbers");
        } else if(neg.size () <= 0) {
            System.out.println ("Array does not have negative numbers");
        }

    }
    static void partitionArrayUsingSignBit( int n, int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<Integer> ();
        ArrayList<Integer> arr2 = new ArrayList<Integer> ();
        System.out.println (arr[0]);

        for (int i = 0; i < n; i++) {
            if ((arr[0] ^ arr[i]) < 0) {
                System.out.println("adding " + arr[i] + " to arr1");
                arr2.add (arr[i]);
            } else {
                System.out.println("adding " + arr[i] + " to arr2");
                arr1.add (arr[i]);
            }
        }
        printList (arr1);
        printList (arr2);

        if (arr[0] >= 0 && arr1.size () <= 0) {
            System.out.println ("Array does not have positive numbers");
        }
        if (arr[0] < 0 && arr1.size () <= 0) {
            System.out.println ("Array does not have negative numbers");
        }
    }

    public static void main(String[] args) {
        //int[] nums = {-7, 1, 5, -4, -9, -11, -39};
        int[] nums = {2, 6, 9, -1, -4, 10, -7, 3, 5, -8};
        partitionArrayUsingSignBit (nums.length, nums);
    }
}
