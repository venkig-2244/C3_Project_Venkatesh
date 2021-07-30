package Sorting.InterviewQuestions;
import java.util.*;

public class FinalUnsortedQuestion1 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int n1 = s.nextInt();
            int[] array1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                array1[i] = s.nextInt();
            }

            int n2 = s.nextInt();
            int[] array2 = new int[n2];
            for (int i = 0; i < n2; i++) {
                array2[i] = s.nextInt();
            }

            // Write your code here

            int find = 0;
            for(int i = 0; i < n1 - 1; i++){
                if(array1[i] > array1[i + 1]){
                    if(i == 0){
                        find = i;
                        break;
                    }
                    if(array1[i + 1] < array1[i - 1]){
                        find = i + 1;
                        break;
                    }
                    find = i;
                    break;

                }
            }

//            quickSort(array2, 0, n2 - 1);
            array2 = performSort (array2);

            int find2 = 0;
            int count = 0;
            for(int j = 0; j < n2; j++){

                if(find == 0){
                    if(array2[j] <= array1[find + 1]) {
                        find2 = j;
                        System.out.println(array2[find2]);
                        count++;
                        break;
                    }
                }
                else if(find == n1 - 2){
                    if(array2[j] >= array1[find - 1] && array2[j] <= array1[find + 1]){
                        find2 = j;
                        System.out.println(array2[find2]);
                        count++;
                        break;
                    }
                }
                else{
                    if ( array2[j] <= array1[find + 1] && array2[j] >= array1[find - 1]) {
                        find2 = j;
                        System.out.println(array2[find2]);
                        count++;
                        break;
                    }
                }
            }
            if(count == 0)
                System.out.println("Not Possible");

        }


        public static int partition(int array[], int low, int high) {
            int pivot = array[high];
            int i = (low - 1);
            for (int j = low; j < high; j++) {

                if (array[j] >= pivot) {

                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;
            return (i + 1);
        }

        public static void quickSort(int array[], int low, int high) {
            if (low < high) {
                int p = partition(array, low, high);
                quickSort(array, low, p - 1);
                quickSort(array, p + 1, high);
            }

        }

    private static int[] performSort(int[] arr) {
        int size = arr.length;
        int temp;
        int min = 0;

        for(int index = 0; index < size-1; index++) {
            min = index;

            for (int j = index; j < size; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

}

