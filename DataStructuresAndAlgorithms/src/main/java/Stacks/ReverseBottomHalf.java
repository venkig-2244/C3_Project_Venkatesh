package Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseBottomHalf {
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
        System.out.println (stack);
        LinkedList<Integer> temp = new LinkedList<>();
        int s = stack.size ()/2;
        for (int i = 0; i < s; i++) {
            temp.add (stack.pop());
        }
        System.out.println (temp);
        System.out.println (stack);

        for(int i = 0; i < temp.size (); i++) {
            stack.push (temp.get(i));
        }
        System.out.println (stack);

    }

    public static void main(String[] args) {
        int[] e = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Stack<Integer> stack = new Stack<> ();
        for (int elem1 : e) {
            stack.add(elem1);
        }
        reverseSecondHalf (stack);
    }
}
