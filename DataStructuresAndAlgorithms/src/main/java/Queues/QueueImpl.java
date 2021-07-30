package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String arg[]) {
//        Queue<Character> q=new LinkedList<> ();
//        System.out.println(q.isEmpty());
//        q.add('a');
//        q.add('b');
//        q.add('c');
//        q.add('d');
//        System.out.println(q);
//        System.out.println(q.size());
//        System.out.println(q.peek());
//        System.out.println(q.remove());
//        System.out.println(q);
//        System.out.println(q.isEmpty());

//        Queue<Character> q=new LinkedList<>();
//        System.out.println(q.isEmpty());
//        q.add('a');
//        q.add('b');
//        q.add('c');
//        q.add('d');
//        System.out.println(q);
//        System.out.println(q.size());
//        System.out.println(q.peek());
//        System.out.println(q.remove());
//        System.out.println(q);
//        System.out.println(q.isEmpty());

        Queue numbers = new LinkedList();
        List(numbers);

        // Write your code here
        // You should only add some numbers, dequeue, or peek to change the elements in the queue
        // so that the queue becomes [1,4,9,14,15]
        System.out.println(numbers);

        numbers.remove();
        numbers.add(1);

        System.out.println(numbers);
    }
    public static void List(Queue numbers) {
        int i = 0;
        while(i <= 12) {
            if(i%2==0) {
                numbers.add(i);
            }
            i++;
        }
    }
}
