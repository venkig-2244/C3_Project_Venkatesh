package Sorting;

public class InsertionSort {
    private static void performSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i =0; i< arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int[] arr = {8,17,5,14,1,88,77};
        InsertionSort.performSort (arr);
    }
}
