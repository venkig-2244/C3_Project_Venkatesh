package Sorting;

public class ChocolateBarProblem {
    static int numberOfSubarrays(int[] arr, int n, int d, int m){

        /* Write your code here */
        int sum ;
        int count = 0;
        for(int index = 0; index <= n-m; index++) {
            sum = 0;
            for (int j = index; j < index+m; j++) {
                sum += arr[j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 6, 4};
        int month = 4;
        int date = 18;
        System.out.println (numberOfSubarrays (arr, arr.length, date, month));
    }
}
