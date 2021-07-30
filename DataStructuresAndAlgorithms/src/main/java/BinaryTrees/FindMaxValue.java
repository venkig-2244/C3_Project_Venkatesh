package BinaryTrees;
import java.util.*;


class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }
}

public class FindMaxValue {

    private static void preOrder(Node root) {
        if(root != null) {
            System.out.print (root.data + " ");
            preOrder (root.left);
            preOrder (root.right);

        }
    }

    private static void postOrder(Node root) {
        if(root != null) {
            postOrder (root.left);
            postOrder (root.right);
            System.out.print (root.data + " ");
        }
    }
    private static void inOrder(Node root) {
        if(root != null) {
            inOrder (root.left);
            System.out.print (root.data + " ");
            inOrder (root.right);
        }
    }

    static int sumBinaryTree(Node node)
    {
        // Write the logic to recursively create Binary Tree consisting of sum of all its children
        if(node != null) {
            System.out.print(node.data + " ");
            node.data += sumBinaryTree (node.left);
            node.data += sumBinaryTree (node.right);
            return node.data;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Example Tree
        Node root = new Node (25);
        root.left = new Node (51);
        root.right = new Node (13);
        root.left.left = new Node (47);
        root.left.right = new Node (7);
        root.right.left = new Node (6);
        root.right.right = new Node (8);
//            convertToBST (root);
//        preOrder (root);
//        System.out.println ();
//        postOrder (root);
//        System.out.println ();
        inOrder (root);
        System.out.println ("");
        sumBinaryTree (root);
        System.out.println ("");
        inOrder (root);
    }
}

    // Method to construct a binary tree from the given array
//    public Node insertNode(int[] elementsArr, Node node, int i) {
//        if (i < elementsArr.length) {
//            node = new Node (elementsArr[i]);
//
//            node.left = insertNode (elementsArr, node.left, 2 * i + 1);
//            node.right = insertNode (elementsArr, node.right, 2 * i + 2);
//        }
//        return node;
//    }

    // Method to find the largest value in the tree
//    public int findMax(Node node) {
//        //Write your code here.
//        if (node == null)
//            return Integer.MIN_VALUE;
//
//        int res = node.data;
//        int lres = findMax(node.left);
//        int rres = findMax(node.right);
//
//        if (lres > res)
//            res = lres;
//        if (rres > res)
//            res = rres;
//
//        return res;
//
//    }
//}

//public class FindMaxValue {
//    public static void main(String[] x){
//        BinaryTree tree = new BinaryTree();
//
//        int size;
//        Scanner sc = new Scanner(System.in);
//        size = sc.nextInt();
//
//        if(size == 0){
//            System.out.println("-1");
//        }
//
//        else if (size < 0){
//            System.out.println("Size should be a positive integer");
//        }
//
//        else{
//            int[] elementsArr = new int[size];
//            for(int i = 0; i < size; i++){
//                elementsArr[i] = sc.nextInt();
//            }
//
//            tree.root = tree.insertNode(elementsArr,tree.root,0);
//            System.out.println(tree.findMax(tree.root));
//        }
//    }
//}



