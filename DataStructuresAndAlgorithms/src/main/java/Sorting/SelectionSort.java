package Sorting;

public class SelectionSort {
    public static void performSort(int[] arr) {
        int size = arr.length;
        int temp;
        int min = 0;

        for(int index = 0; index < size-1; index++) {
            min = index;

            for (int j=index; j < size; j++ ) {
                if (arr[min] > arr[j]) {
                    min = j;
                    //for (int i = 0; i < arr.length; i++)
                    //    System.out.print (arr[i] + " ");
                    //System.out.println ("");
                }
            }
            System.out.println ("Min: " + min);

            temp = arr[index];
            arr[index] = arr[min];
            arr[min] = temp;

        }
        for (int i = 0; i < arr.length; i++)
            System.out.print (arr[i] + " ");
    }
    public static void main(String[] args) {
        //int[] arr = {8,7,5,4,1};
        int[] arr = {8,17,5,14,1,88,77};
        //int[] arr = {1 ,4 ,6, 9, 89, 90};
        SelectionSort.performSort (arr);
    }
}
