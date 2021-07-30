package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IdentifyPalindromic {
//    static Queue<Character> charQueue = new LinkedList<> ();
//    static Stack<Character> charStack = new Stack<> ();
    static Stack<Character> stack = new Stack<> ();

//    static boolean isPalindrome(String inputStr) {
//        if(inputStr.isEmpty ()) return  false;
//
//        char[] charStr = inputStr.toCharArray ();
//        int size = inputStr.length ();
//
//        for (char c : charStr) {
//            charQueue.add (c);
//            charStack.push (c);
//        }
//        for (int i = 0; i < size/2; i++) {
//            if(charQueue.peek () != charStack.peek ())
//                return false;
//        }
//        return true;
//    }

    static boolean isPalindrome(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString)) {
            System.out.println ("The input String is a palindrome.");
            return true;
        }
        else{
            System.out.println ("The input String is not a palindrome.");
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println (isPalindrome ("malayalam"));
        System.out.println (isPalindrome ("malayalama"));
    }
}
