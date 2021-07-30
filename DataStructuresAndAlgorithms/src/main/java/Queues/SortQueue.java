package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class SortQueue {
    public static int getMinIndex(Queue<Integer> queue, int sortIndex) {
        int min_index = -1;
        int min = Integer.MAX_VALUE;
        int size = queue.size ();
        for (int i = 0; i < size; i++) {
            int current = queue.peek ();
            queue.poll ();

            if (current <= min && i <= sortIndex) {
                min_index = i;
                min = current;
            }
            queue.add (current);
        }
        return min_index;
    }
    public static void addMinToEnd(Queue<Integer> queue, int min_index)
    {
        int min = 0;
        int size = queue.size();
        for (int i = 0; i < size; i++)
        {
            int current = queue.peek();
            queue.poll();
            if (i != min_index)
                queue.add(current);
            else
                min = current;
        }
        queue.add(min);
    }

    public static void sort(Queue<Integer> queue)
    {
        for(int i = 1; i <= queue.size(); i++)
        {
            int min_index = getMinIndex (queue,queue.size() - i);
            addMinToEnd (queue, min_index);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<Integer> ();
        int[] inp = {6, 12, 3, 4, 5, 1, 7, 8, 10, 9, 11, 2};

        for(int i : inp){
            list.add(i);
        }
//        list.add(30);
//        list.add(11);
//        list.add(15);
//        list.add(4);

        //Sort Queue
        sort(list);

        //print sorted Queue
        while(list.isEmpty()== false)
        {
            System.out.print(list.peek() + " ");
            list.poll();
        }

    }
}
