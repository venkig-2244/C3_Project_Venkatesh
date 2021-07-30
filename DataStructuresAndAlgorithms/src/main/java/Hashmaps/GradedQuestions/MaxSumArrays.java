package Hashmaps.GradedQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Java program to implement Max Heap
class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    // Constructor to initialize an
    // empty max heap with given maximum
    // capacity.
    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    // Returns position of parent
    private int parent(int pos)
    {
        return pos / 2;
    }

    // Below two functions return left and
    // right children.
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    // Returns true of given node is leaf
    private boolean isLeaf(int pos)
    {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // A recursive function to max heapify the given
    // subtree. This function assumes that the left and
    // right subtrees are already heapified, we only need
    // to fix the root.
    private void maxHeapify(int pos)
    {
        if (isLeaf(pos))
            return;

        if (Heap[pos] < Heap[leftChild(pos)] ||
                Heap[pos] < Heap[rightChild(pos)]) {

            if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    // Inserts a new element to max heap
    public void insert(int element)
    {
        Heap[++size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " +
                    Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    // Remove an element from max heap
    public int extractMax()
    {
        int popped = Heap[1];
        Heap[1] = Heap[size--];
        maxHeapify(1);
        return popped;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] arg)
    {
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
        System.out.println("The max val is " + maxHeap.extractMax());
    }
}

public class MaxSumArrays {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayL1 = new ArrayList<Integer> ();
        ArrayList<Integer> ArrayL2 = new ArrayList<Integer> ();

        Scanner in = new Scanner (System.in);
        int n, i;

        // size of ArrayL1 = size of ArrayL2 = n
        n = in.nextInt ();

        for (i = 0; i < n; i++) {
            ArrayL1.add (in.nextInt ());
        }
        for (i = 0; i < n; i++) {
            ArrayL2.add (in.nextInt ());
        }

        //write your code here
        if (n == 1) {
            System.out.println (ArrayL1.get(0) + ArrayL2.get (0));
            return;
        }
        if (n > 0) {
//            ArrayList<Integer> resultList = new ArrayList<> ();
//            for (i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    resultList.add (ArrayL1.get (i) + ArrayL2.get (j));
//                }
//            }
//
//            Object[] result = resultList.toArray ();
//            Arrays.sort (result, Collections.reverseOrder ());
//            for (int index = 0; index < 3; index++)
//                System.out.println ((int) result[index]);

            MaxHeap maxHeap = new MaxHeap (n*n);

            for (i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    maxHeap.insert (ArrayL1.get (i) + ArrayL2.get (j));
                }
            }
//            maxHeap.print ();
            for (int index = n; index > 0; index--) {
                System.out.println (maxHeap.extractMax ());
            }
        }
    }
}

