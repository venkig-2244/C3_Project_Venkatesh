package Sorting.InterviewQuestions;

public class SumCloseToZero {
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

    static void sumClosestToZero(int arr[], int n)
    {
        //Write code here
        int sum, min_sum = 999999;
        int l = 0, r = n-1;

        // variable to keep track of the left and right pair for min_sum
        int min_l = l, min_r = n-1;
        if(n < 2)
        {
            System.out.println("Invalid Input");
            return;
        }

        arr = performSort (arr);
        while(l < r)
        {
            sum = arr[l] + arr[r];

            /*If abs(sum) is less then update the result items*/
            if(Math.abs(sum) < Math.abs(min_sum))
            {
                min_sum = sum;
                min_l = l;
                min_r = r;
            }
            if(sum < 0)
                l++;
            else
                r--;
        }


        System.out.println (arr[min_l] + " " + arr[min_r]);
    }

    public static void main(String[] args) {
        int[] arr = {-4, 7, 6, 2, -5};
//        int[] arr = {8, -50, 34, -19, 24, 33, 10, -46, -38};
        if (arr.length < 2) {
            System.out.println ("Invalid input.");
        }
        else
            sumClosestToZero (arr, arr.length);
    }
}
