package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class CheckSequence {
    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
        boolean retVal = false;

        while(!sequence1.isEmpty ()) {
            int s1 = sequence1.peek ();

            while(!sequence2.isEmpty ()) {
                int s2 = sequence2.peek ();
                if (s1 == s2) {
                    sequence1.pop();
                    sequence2.pop();
                    break;
                }
                else {
                    sequence2.pop();
                }
            }
            if(sequence2.isEmpty ()) {
                retVal = false;
                break;
            }
        }
        if(sequence1.isEmpty ())
            retVal = true;

        return retVal;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line1 = scanner.nextLine();
//        String line2 = scanner.nextLine();

        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();

        int[] a1 = {1, 2, 3, 6};
        int[] a2 = {1, 5, 4, 2, 3};
        for (int elem1 : a1) {
            sequence1.add(elem1);
        }
        for (int elem2 : a2) {
            sequence2.add(elem2);
        }

        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}
