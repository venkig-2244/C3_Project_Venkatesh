package Sorting;
import java.util.Scanner;

public class BubbleSort {
    private static void performSort(int[] arr) {
        int size = arr.length;
        int temp;
        for(int i = 0; i < size-1; i++) {
            int index = 0;
            for (int j=index+1; j < size-i; j++ ) {
                if (arr[index] > arr[j]) {
                    temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                }
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print (arr[i] + " ");
    }

    private static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        //Write your code here
        int temp;

        for(int i = 0; i < size-1; i++) {
            int index = 0;
            for (int j=index+1; j < size-i; j++ ) {
                if (array[index] < array[j]) {
                    temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                    totalSwaps++;
                }
                index++;
            }

            if (i+1 == M) {
                break;
            }
        }
        return totalSwaps;
    }

    private static void printIterations(int[] arr) {
        int size = arr.length;
        int temp;
        for(int i = 0; i < size-1; i++) {
            int index = 0;
            for (int j=index+1; j < size-i; j++ ) {
                if (arr[index] > arr[j]) {
                    temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                }
                System.out.print ("Iteration " + i+1 + ": ");
                for (int ii = 0; ii < arr.length; ii++)
                    System.out.print (arr[ii] + " ");
                System.out.println("");
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print (arr[i] + " ");
    }

    public static void main(String[] args) {
//        int[] arr = {8,7,5,4,1};
//        BubbleSort.performSort (arr);

//        Scanner input = new Scanner(System.in);
//        int M = input.nextInt ();
//        int n = input.nextInt();
//        int i = 0;
//
//        int[] arr = new int[n];
//        for (i = 0; i < n; i++) {
//            arr[i] = input.nextInt();
//        }

//        System.out.println (totalBubbleSortSwaps (arr, M));
        int[] arr = {12, 8, 9, 10, 15, 4, 3, 6, 7};
        performSort(arr);
        //printIterations(arr);
    }
}
