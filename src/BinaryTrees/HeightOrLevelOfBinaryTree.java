package BinaryTrees;
// Height Of Binary Tree =  Level - 1
public class HeightOrLevelOfBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val =val;
        }
    }
    public static int level(Node root){
    if(root==null) return 0;
    int a = level(root.left);
    int b = level(root.right);
    return 1+ Math.max(a,b);
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
        System.out.println(level(a));
        int Height = level(a)-1;
        System.out.println(Height);
    }
}
