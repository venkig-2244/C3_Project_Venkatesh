package Sorting;
import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);

            merge(numbers, first, mid, last);
        }

        return numbers;
    }

    private static int[] merge(int[] numbers, int i, int m, int j) {
        int left = i;
        int right = m + 1;
        int kIndex = 0;
        int[] t = new int[numbers.length];

        while (left <= m && right <= j) {
            if (numbers[left] <= numbers[right]) {
                t[kIndex] = numbers[left];
                kIndex++;
                left++;
            } else {
                t[kIndex] = numbers[right];
                kIndex++;
                right++;
            }
        }

        while (left <= m) {
            t[kIndex] = numbers[left];
            kIndex++;
            left++;
        }

        while (right <= j) {
            t[kIndex] = numbers[right];
            kIndex++;
            right++;
        }

        left = i;
        kIndex = 0;
        while (left <= j) {
            numbers[left] = t[kIndex];
            left++;
            kIndex++;
        }

        return numbers;
    }

    public static void main(String args[]) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 67, 5, 9};
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
