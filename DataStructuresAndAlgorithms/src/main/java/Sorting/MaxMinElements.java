package Sorting;

/*
Another efficient approach is to solve the problem in O(n) time complexity by simply traversing the
array, and while doing so, maintaining eight variables, 4 to maintain the first four maximum elements
of the array and 4 to maintain the first four minimum elements

 */
public class MaxMinElements {

    private static int[] performSort(int[] arr) {
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

    // Function to find first four max and min elements in an array
    private static int[] MaxElements(int[] arr, int max_nos) {
        int[] max = new int[max_nos];
        int max_no = arr[0];

        for (int index = 1; index < arr.length; index++) {
            if(max_no < arr[index]) {
                max_no = arr[index];
            }
        }
        max[0] = max_no;
        for(int index = 1; index < max_nos; index++) {
            max_no = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > max_no && arr[j] < max[index-1]) {
                    max_no = arr[j];
                }
            }
            max[index] = max_no;
        }

        return max;

    }

    private static int[] MinElements(int[] arr, int min_nos) {
        int[] min = new int[min_nos];
        int[] sortedArray = performSort (arr);

        for (int index = 0; index < min_nos; index++) {
            min[index] = sortedArray[index];
        }

//        for (int index = 1; index < arr.length; index++) {
//            if(min_no > arr[index]) {
//                min_no = arr[index];
//            }
//        }
//        min[0] = min_no;
//        for(int index = 1; index < min_nos; index++) {
//            min_no = 0;
//            for(int j = 0; j < arr.length; j++) {
//                if(arr[j] < min_no || arr[j] > min[index-1]) {
//                    min_no = arr[j];
//                }
//            }
//            min[index] = min_no;
//        }

        return min;

    }

    static int maxProdQuad(int n, int[] arr){
        // Write your code here
        int[] max_nos = MaxElements (arr, 4);
        int[] min_nos = MinElements (arr, 4);

        int x = max_nos[0] * max_nos[1] * max_nos[2] * max_nos[3];
        int y = min_nos[0] * min_nos[1] * min_nos[2] * min_nos[3];
        int z = min_nos[0] * min_nos[1] * max_nos[0] * max_nos[1];

        if (x > y && x > z) return x;
        else if(y > x && y > z) return y;
        else return z;
    }

    public static void main(String[] args) {
        //int[] arr = {1, 12, 343, 41, 5, 6, 7};
//        int[] arr = {1, -2, 3, 4, 5};
//        int[] mx = MaxElements (arr, 3);
//        for (int i : mx) {
//            System.out.print(i + " ");
//        }
//        System.out.println ("");
//        int[] mi = MinElements (arr, 3);
//        for (int i : mi) {
//            System.out.print(i + " ");
//        }
//        System.out.println ("");
//        System.out.println (maxProdQuad (arr.length, arr));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {8, 9, 10, 11, 12};
        // Jagged arrays
        int[][] arr = {arr1, arr2, arr3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

