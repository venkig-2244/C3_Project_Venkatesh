package Queues;

//import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteSecondHalf {
    public static void main(String args[]) {

        Queue<Integer> queue = new LinkedList<Integer> ();
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int element : elements)
            queue.add(element);

        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        Queue result = new LinkedList ();

        System.out.println ((int) Math.floor(11/2));

        int s = (int) Math.floor(queue.size ()/2);
        if(queue.size () % 2 != 0)
            s += 1;

        for(int i = 0; i < s; i++) {
            result.add (queue.remove ());
        }
        queue.clear ();
        System.out.println (result);
    }
}
