package IndustryRelevant;
import java.util.*;

public class MedianSeries {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int array[] = new int[100];
        int n = in.nextInt();
        for(int i=0;i<n;i++){

            array[i] = in.nextInt();
        }
//        array[0] = 2;
//        array[1] = 6;
//        array[2] = 1;
//        array[3] = 5;
//        array[4] = 8;

        //write your code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {

            arr.add(array[i]);
            double sum = 0;

            for(int j = 0; j < arr.size(); j++) {
                sum += arr.get(j);
            }
            System.out.println(sum/arr.size());
        }
    }
}

