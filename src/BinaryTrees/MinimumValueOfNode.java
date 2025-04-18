package BinaryTrees;

public class MinimumValueOfNode {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val =val;
        }
    }
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a = min(root.left);
        int b = min(root.right);
        int val = Math.min(root.val , Math.min(a,b));
        return val;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(8);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(9);
        Node h = new Node(-1);
        a.left =b; a.right =c;
        b.left =d; b.right =e;
        c.left =g; c.right =f;
        e.left =h;
        System.out.println(min(a));
    }
}
