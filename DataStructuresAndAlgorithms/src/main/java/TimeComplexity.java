import java.util.LinkedList;
import java.util.ListIterator;

public class TimeComplexity {

    public static void main(String[] args) {

        // Develop algorithm lenear
        int arr[] = { 4, 9, 13, 10 };
        // we want to search 6

        // go visit each and every element in an array sequencially
        // break if we find an element
        int searchVal = 10;
        for (int i = 0; i < arr.length; i++) {
            if (searchVal == arr[i]) {
                System.out.println ("It is present in a array. Index: " + i);
                break;
            }
        }
        double a = 1.0;
        int b = (int) a;

        System.out.println(b);

        LinkedList<String> myList = new LinkedList<String> ();
        myList.add ("Venkatesh");
        myList.add ("Vibhas");

        ListIterator iter = myList.listIterator ();

        System.out.println (myList.getFirst ());
        System.out.println (myList.getLast ());
    }


}
