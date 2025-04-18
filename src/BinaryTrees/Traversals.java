package BinaryTrees;

import java.sql.SQLOutput;

public class Traversals {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    private static void preorder(Node root){//RootLR
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){//LRootR
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(Node root){//LRRoot
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left =b; a.right =c;
        b.left =d; b.right =e;
        c.left =f; c.right =g;
        e.left =h;
        f.right=i;
        System.out.print("Preorder : ");
        preorder(a);//1 2 4 5 8 3 6 9 7
        System.out.println();
        System.out.print("Inorder : ");
        inorder(a);//4 2 8 5 1 6 9 3 7
        System.out.println();
        System.out.print("Postorder : ");
        postorder(a);//4 8 5 2 9 6 7 3 1
    }
}
