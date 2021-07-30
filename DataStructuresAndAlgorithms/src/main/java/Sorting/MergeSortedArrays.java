package Sorting;

import java.util.Scanner;

public class MergeSortedArrays {
    private static int[] performSortAscending(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        return arr;
    }

    private static int[] performSortDescending(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] > arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        return arr;
    }

    private static int[] mergeBothInDescendingOrder(int[] array1, int[] array2) {
        int[] sortedArray = new int[array1.length+array2.length];
        int i = 0;
        for(; i < array1.length; i++) {
            sortedArray[i] = array1[i];
        }
        System.out.println (i);
        for (int j= 0; j < array2.length;j++) {
            sortedArray[i++] = array2[j];
        }

        sortedArray = performSortDescending (sortedArray);

        return sortedArray;
    }
    private static int[] getArrayInput(int size, Scanner scanner) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return performSortAscending(arr);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};

        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);

        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        int[] sorted = mergeBothInDescendingOrder (sortedArray1, sortedArray2);
        for(int i=0; i< sorted.length;i++) {
            System.out.print (sorted[i] + " ");
        }
    }
}
