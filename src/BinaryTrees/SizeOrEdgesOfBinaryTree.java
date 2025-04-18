package BinaryTrees;
//Size = No. Of Nodes In Binary Tree
//No of Edges = Size-1
public class SizeOrEdgesOfBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int size(Node root){
        if(root==null) return 0;
        int value = 1+ size(root.left) +size(root.right);
        return value;
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
        int Edges = size(a)-1 ;
        System.out.println(size(a));//8
        System.out.println(Edges);//7
    }
}
