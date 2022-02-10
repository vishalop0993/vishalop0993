package main.ds.tree;

public class BSTVerifier {
    class Node{
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    boolean isBST(Node node, int min, int max)
    {
        if(node == null)
            return true;
        else if(node.left.data>max || node.right.data<min)
        {
            return false;
        }
        return isBST(node.left, root.data-1,max ) && isBST(root.right, min,root.data+1);
    }
}

