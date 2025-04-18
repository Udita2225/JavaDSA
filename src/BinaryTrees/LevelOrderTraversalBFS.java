package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalBFS {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val =val;
        }
    }
    public static void LevelOrderLR(Node root){
        //Printing Left To Right
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();//1 2 3 4 5 6 7 8 9
    }
    public static void LevelOrderRL(Node root){
        //Printing Right to Left
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.right!=null) q.add(front.right);
            if(front.left!=null) q.add(front.left);
        }
        System.out.println();
    }
    public static int Level(Node root){
        if(root==null) return 0;
        int a = Level(root.left);
        int b = Level(root.right);
        return 1+ Math.max(a,b);
    }
    //Printing Level Order Without Using Queue
    public static void ByPreorder(Node root,int level, int x){
        if(root==null) return;
        if(level==x) System.out.print(root.val+ " ");
        ByPreorder(root.left,level+1,x);
        ByPreorder(root.right, level+1,x);
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
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        g.left = h;
        g.right = i;
        System.out.println("Level Order : ");
        LevelOrderLR(a);
        LevelOrderRL(a);//1 3 2 7 6 5 4 9 8
        int LevelOfTree = Level(a);
        for (int x = 0; x < LevelOfTree; x++){
            ByPreorder(a, 0, x);
            System.out.println();
        }
    }
}
