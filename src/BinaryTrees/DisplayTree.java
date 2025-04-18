package BinaryTrees;
public class DisplayTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);
        a.left =b; a.right =c;
        b.left =d; b.right =e;
        c.right=f; c.left = g;
        e.left = h;
        displayNLR(a);//1 4 2 6 20 3 10 5
        System.out.println();
        displayNRL(a);//1 3 5 10 4 6 20 2
        System.out.println();
        displayLRN(a);//2 20 6 4 10 5 3 1
    }
    private static void displayNLR(Node root){
        if(root==null) return;//Base Case
        System.out.print(root.val + " ");//Self
        displayNLR(root.left);//Left Subtree
        displayNLR(root.right);//Right Subtree
    }
    private static void displayNRL(Node root) {
        if (root == null) return;//Base Case
        System.out.print(root.val + " ");//Self
        displayNRL(root.right);//Right Subtree
        displayNRL(root.left);//Left Subtree
    }
    private static void displayLRN(Node root){
        if(root==null) return;//Base Case
        displayLRN(root.left);//Left Subtree
        displayLRN(root.right);//Right Subtree
        System.out.print(root.val+" ");//Self
    }
}

