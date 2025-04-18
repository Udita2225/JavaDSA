package BinaryTrees;

public class MaximumValueOfNode {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a = max(root.left);
        int b = max(root.right);
        int value = Math.max(root.val, Math.max(a,b));
        return value;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(8);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(0);
        Node h = new Node(0);
        a.left =b; a.right =c;
        b.left =d; b.right =e;
        c.left =g; c.right =f;
        e.left =h;
        System.out.println(max(a));
    }
}
