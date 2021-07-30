package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class PracticeQuestions {
    public static void main(String[] args) {
        Queue < Integer > q = new LinkedList< Integer >();
        q.add(0); // Inserts the element passed as parameter to the end of the queue
        q.add(1);
        for (int i = 0; i < 10; i++)
        {
            int num1 = q.remove(); // Returns and removes the element at the front of queue
            int num2 = q.remove();
            q.add(num2);
            q.add(++num2);
            System.out.println(num1);
        }
    }
}
