package Sorting.InterviewQuestions;

public class MergeTwoSortedArrays {
    static void merge(int arr1[], int arr2[], int m, int n) {

        // Move all -1's to end of an arr1
        for(int i = 0; i < m; i++) {
            if (arr1[i] == -1) {
                int savedIndex = i;
                for(int j = i; j < m; j++) {
                    if (arr1[j] != -1) {
                        arr1[savedIndex] = arr1[j];
                        arr1[j] = -1;
                        break;
                    }
                }
            }
        }

//        for (int index = 0; index < m; index++) {
//            System.out.print (arr1[index] + " ");
//        }
//        System.out.println ("");

        int lastIndex = m-1;
        while(arr1[lastIndex] == -1) {
            lastIndex--;
        }
        int j = n-1;
        int newIndex = m-1;
        while(j >= 0) {
            if(arr1[lastIndex] > arr2[j]) {
                arr1[newIndex] = arr1[lastIndex];
                lastIndex--;
            } else {
                arr1[newIndex] = arr2[j];
                j--;
            }
            newIndex--;
        }
        for (int index = 0; index < m; index++) {
            System.out.print (arr1[index] + " ");
        }
        System.out.println ("");
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int[] arr2 = {5, 7, 9, 25};

        merge(arr1, arr2, arr1.length, arr2.length);
    }
}
