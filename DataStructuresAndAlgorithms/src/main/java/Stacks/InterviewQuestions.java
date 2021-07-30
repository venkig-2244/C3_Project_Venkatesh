package Stacks;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class InterviewQuestions {

    static Boolean isOperand(char c)
    {
        // If the character is a digit
        // then it must be an operand
        if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }

    public static int computeResult(String input){
        Stack<Integer> Stack = new Stack<Integer>();

        for (int j = input.length() - 1; j >= 0; j--) {

            if (isOperand(input.charAt(j)))
                Stack.push(input.charAt(j) - 48);
            else {
                if(Stack.isEmpty()) continue;

                // Operator encountered
                // Pop two elements from Stack
                int o1 = Stack.peek();
                Stack.pop();
                int o2 = Stack.peek();
                Stack.pop();

                // Use switch case to operate on o1
                // and o2 and perform o1 O o2.
                switch (input.charAt(j)) {
                    case '+':
                        Stack.push(o1 + o2);
                        break;
                    case '-':
                        Stack.push(o1 - o2);
                        break;
                    case '*':
                        Stack.push(o1 * o2);
                        break;
                    case '/':
                        Stack.push(o1 / o2);
                        break;
                }
            }
        }

        return Stack.peek();
    }


    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();

        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
                stack.push(c - '0');

                //  If the scanned character is an operator, pop two
                // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        //String exp="12+42/*1-";
        String exp = "b+c*d+e+a";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
//        System.out.println (computeResult ("* − 6 / 5 2 − / 8 4 1"));

    }
}
