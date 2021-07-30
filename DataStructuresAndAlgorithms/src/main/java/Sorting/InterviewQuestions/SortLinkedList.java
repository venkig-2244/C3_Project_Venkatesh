package Sorting.InterviewQuestions;

import java.util.Random;

public class SortLinkedList {
    static class Node {
        int data;
        Node next;
    }

    private static void sortLinkedList(Node head) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        Node node = head;
        while(node != null) {
            if(node.data == 0)
                ++zeroCount;
            else if(node.data == 1)
                ++oneCount;
            else
                ++twoCount;
            node = node.next;
        }

        node = head;
        for(int i = 0; i < zeroCount; i++){
            node.data = 0;
            node = node.next;
        }

        for(int i = 0; i < oneCount; i++){
            node.data = 1;
            node = node.next;

        }

        for(int i = 0; i < twoCount; i++){
            node.data = 2;
            node = node.next;
        }
    }

    private static void traverseLinkedList(Node head) {
        Node node = head;
        while(node != null) {
            System.out.print (node.data + " ");
            node = node.next;
        }
        System.out.println ("");
    }

    public static void main(String[] args) {
        Random randomNoGenerator = new Random ();
        Node head = new Node();
        Node node = head;
        node.data = randomNoGenerator.nextInt (3);

        for(int i = 0; i < 10; i++) {
            node.next = new Node();
            node = node.next;
            node.data = randomNoGenerator.nextInt(3);
            node.next = null;
        }

        traverseLinkedList(head);
        sortLinkedList (head);
        traverseLinkedList (head);
    }
}
