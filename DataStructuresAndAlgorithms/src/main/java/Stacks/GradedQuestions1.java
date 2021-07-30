package Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GradedQuestions1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<> ();

//        stack.push(9);
//        stack.push(7);
//        stack.push(6);
//        stack.push(1);
//        stack.push(5);
//        stack.push(3);
//
//        System.out.println (stack.peek ());
//        int size = stack.size ();
//        Stack<Integer> stack1 = new Stack<> ();
//        for (int i = 0; i < size; i++) {
//            stack1.push (stack.pop());
//        }
//        System.out.println (stack1);
//        System.out.println (stack1.peek ());
//
//        System.out.println (stack1.pop ());
//        System.out.println (stack1.pop ());
//        System.out.println (stack1.peek ());

        Queue<Integer> queue = new LinkedList<> ();
//        queue.add(1);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(5);
//        queue.add(8);
//
//        System.out.println (queue.peek ());
//        int s = queue.size ();
//        for(int i = 0; i < s; i++) {
//            stack.add (queue.remove ());
//        }
//        System.out.println (stack.peek ());
//        for(int i = 0; i < s; i++) {
//            queue.add (stack.pop ());
//        }
//        for(int i = 0; i < s; i++) {
//            System.out.println (queue.remove ());
//        }

//        for(int i = 7; i >= 1; i--)
//            stack.push (i);
        //int s = stack.size ();
//        System.out.println (stack.peek ());
//        stack.push(stack.pop());
//        stack.push(stack.peek());
//        int s = stack.size ();
//        for(int i = 0; i < s; i++) {
//            System.out.println (stack.pop());
//        }
        for(int i = 1; i <= 7; i++) {
            queue.add (i);
            stack.add (i);
        }
        int s = queue.size ();
        //System.out.println (queue.peek ());
        for(int i = 0; i < s; i++) {
            System.out.println ("Removing " + queue.remove ());
        }
        System.out.println ("==================");
        for(int i = 0; i < s; i++) {
            System.out.println ("Removing " + stack.pop ());
        }
    }
}
