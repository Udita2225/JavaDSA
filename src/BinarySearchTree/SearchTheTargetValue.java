package BinarySearchTree;

public class SearchTheTargetValue {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val =val;
        }
    }
    public static boolean ifPresent(Node root , Node target){
       if(root==null) return false;
       if(root==target) return true;
       else if(root.val>target.val) return ifPresent(root.left,target);
       else return ifPresent(root.right,target);
    }
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);
        Node h = new Node(13);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        f.right=h;
        Node k = new Node(77);
        System.out.println(ifPresent(a,k));//false;
        System.out.println(ifPresent(a,g));//true;
    }
}
