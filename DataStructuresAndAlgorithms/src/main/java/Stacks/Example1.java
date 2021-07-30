package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class Example1 {
//    static Stack<Integer> stack = new Stack<> ();
    public static void main(String[] args) {
//        Stack<Character> s = new Stack<Character>();
//        Scanner in = new Scanner(System.in);
//        String data = in.nextLine();
//        //write your code here
//
//        for (int i = 0; i < data.length(); i++) {
//            s.push(data.charAt(i));
//        }
//
//        for (int i = 0; i < data.length(); i++) {
//            System.out.print(s.pop());
//        }
//        System.out.println("");

        Stack<Character> stack=new Stack<>();
//        Scanner in=new Scanner(System.in);
//        String inputString=in.nextLine();
        String inputString = "(a+((b+c))))+a";

        for(int k=1;k<inputString.length()-1;k++) {
            stack.push(inputString.charAt(k+1));
            if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
                stack.pop();
            if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
                stack.pop();
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }

    }
}
