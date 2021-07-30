package Sorting.InterviewQuestions;

public class IncAndDec {
    static int max(int arr[], int low, int high) {
        //Write code here
        int mid = low + (high - low) / 2;

        if ( (arr[mid-1] < arr[mid]) && (arr[mid+1] < arr[mid]) ){
            return arr[mid];
        } else {
            if (arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1] ) {
                return max(arr, low, mid);
            } else {
                return max(arr, mid, high);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 10, 9, 5, 3};
//        int[] arr = {22, 38, 15, 8, 1};
        System.out.println(max(arr, 0, arr.length-1));
    }
}
