package Queues;

import java.util.Stack;

public class DuplicateParenthesis {
    public static String findDuplicateParenthesis(String inputString) {
        //write your code here
        Stack<Character> stack = new Stack<> ();
        int size = inputString.length ();

        for (int i = 0; i < size; i++) {
            String contents = "";
            char c = inputString.charAt (i);

            if(c == ')') {
                char element;

                while(true) {
                    element = stack.peek ();
                    if (element != '(') {
                        contents += stack.pop ();
                    }
                    else {
                        break;
                    }
                }
                if(contents.length () <= 0) {
                    return "Duplicate parenthesis found";
                }
            }
            else
                stack.push (c);
        }

        return "Duplicate parenthesis NOT found";
    }

    public static void main(String[] args) {
        System.out.println (findDuplicateParenthesis ("((A+B))"));
        System.out.println (findDuplicateParenthesis ("(A+B)+((B+C))"));
    }
}
