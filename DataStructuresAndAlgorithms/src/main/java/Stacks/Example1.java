package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class Example1 {
//    static Stack<Integer> stack = new Stack<> ();
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here

        for (int i = 0; i < data.length(); i++) {
            s.push(data.charAt(i));
        }

        for (int i = 0; i < data.length(); i++) {
            System.out.print(s.pop());
        }
        System.out.println("");
    }
}
