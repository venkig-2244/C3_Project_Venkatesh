package Sorting.InterviewQuestions;

public class SortIncrDescArray {
    static int sortIncDec(int arr[], int n)
    {
        //Write code here
        int maxE = -1;

        // Find the maximum element of
        // arr[]
        for (int i = 0; i < n; i++) {
            maxE = Math.max(maxE, arr[i]);
        }

        // Create frequency array freq[]
        int freq[] = new int[maxE + 1];

        // Update the frequency array as
        // per the occurence of element in
        // arr[]
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Initialise cnt to 0
        int cnt = 0;

        // Traversing freq[]
        for (int i = 0; i <= maxE; i++) {

            // If freq of an element is
            // greater than 0 update the
            // value of arr[] at index cnt
            // & increment cnt
            if (freq[i] > 0) {

                int value = 100000 - i;
                arr[cnt] = 100000 * freq[i] + value;
                cnt++;
            }
        }

        // Return cnt
        return cnt;
    }

    public static void main(String[] args) {

    }
}
