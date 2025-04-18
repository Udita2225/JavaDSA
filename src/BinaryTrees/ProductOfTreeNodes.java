package BinaryTrees;
public class ProductOfTreeNodes {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);
        a.left =b; a.right =c;
        b.left =d; b.right =e;
        c.left =g; c.right =f;
        e.left =h;
        display(a);
        System.out.println();
        System.out.println(product(a));
    }
}
