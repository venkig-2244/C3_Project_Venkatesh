package BinarySearchTree;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinarySearchTreeImpl {
    Node root;
    BinarySearchTreeImpl() {
        root = null;
    }

    // Function to insert nodes in level order
    public Node insertLevelOrder(int[] arr, Node root, int i)
    {
        // Base case for recursion
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,2 * i + 2);
        }
        return root;
    }
    // Function to print tree nodes in InOrder fashion
    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    // Function to print tree nodes in InOrder fashion
    public void preOrder(Node root)
    {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    int sumBinaryTree(Node node)
    {
        // Write the logic to recursively create Binary Tree consisting of sum of all its children
        if(node != null) {
            int leftSum = sumBinaryTree (node.left);
            int rightSum = sumBinaryTree (node.right);
            root.data = root.data + leftSum + rightSum;

            return root.data;
        }
        return 0;
    }


}

public class BinarySearchTree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        BinarySearchTreeImpl bst = new BinarySearchTreeImpl ();
        Node root = bst.insertLevelOrder (arr, bst.root, 0);
//        bst.inOrder (root);
//        System.out.println ("");
        bst.preOrder (root);
        System.out.println ("");
//        bst.sumBinaryTree (root);
//        bst.preOrder (root);
    }
}