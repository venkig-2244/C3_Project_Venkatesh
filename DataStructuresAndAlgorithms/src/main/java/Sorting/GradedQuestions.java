package Sorting;

public class GradedQuestions {

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

    private static int getIndexOfUnsortedElement(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return i+1;
            }
        }
        return -1;
    }

    private static int findMaxPossibleElement(int[] arr, int[] arr1) {
        int indexToReplace = getIndexOfUnsortedElement (arr);
        if (indexToReplace < 0 || indexToReplace == 0 || indexToReplace == arr.length-1)
            return -1;

        int[] eligibleItems = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr[indexToReplace] && arr1[i] < arr[indexToReplace+1]) {
                eligibleItems[index++] = arr1[i];
            }
        }
        if (eligibleItems.length <= 0) {
            return -1;
        }

        eligibleItems = performSort (eligibleItems);

        return eligibleItems[eligibleItems.length-1];
    }

    public static void main(String[] args) {
//        int[] arr = {2, 7, 8, 6, 13};
        int[] arr1 = {15, 11, 9, 5};
        int[] arr = {2, 7, 9, 11, 2, 17};

        if(arr.length <= 1) {
            System.out.println ("Not possible");
        }
        int retVal = findMaxPossibleElement (arr, arr1);
        if (retVal == -1) {
            System.out.println ("Not possible");
        }
        else {
            System.out.println (retVal);
        }

    }
}
