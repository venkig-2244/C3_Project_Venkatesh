package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FindMax {

    static Queue<Integer> q = new LinkedList<Integer>();
    public static void func() {
        //write your code here
        Queue<Integer> temp = new LinkedList<> (q);

        int s = q.size ();
        int max = q.remove ();

        for(int i = 1; i < s; i++) {
            if (max < q.peek ())
                max = q.remove ();
            else
                q.remove ();
        }
        for(int i = 0; i < s; i++) {
            if(temp.peek () != max) {
                q.add (temp.remove ());
            } else {
                temp.remove ();
            }
        }
        q.add(max);
    }
    public static void func1() {
        Stack<Integer> temp = new Stack<> ();
        while(!q.isEmpty ()){
            temp.push (q.remove ());
        }
        while(!temp.isEmpty ()) {
            q.add (temp.pop ());
        }
    }

    public static void main(String[] args) {

        //Queue<Integer> queue = new LinkedList<Integer> ();
        int[] elements = {3, 5, 2, 6, 4};

        for (int element : elements)
            q.add(element);

        func1();
        System.out.println(q);
    }
}
