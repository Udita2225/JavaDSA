package BinarySearchTree;
public class MinMaxElementOfBST {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static int Min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a =Min(root.left);
        int min = Math.min(root.val,a);
        return min;
    }
    public static int Max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a =Max(root.right);
        int max = Math.max(root.val,a);
        return max;
    }
    public static int findMax(Node root){
        if(root==null) return Integer.MIN_VALUE;
        Node temp=root;
        while(temp.right!=null){
            temp = temp.right;
        }
        return temp.val;
    }
    public static int findMin(Node root){
        if(root==null) return Integer.MAX_VALUE;
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.val;
    }
    public static int findMAX(Node root){
        if(root==null) return Integer.MIN_VALUE;
        //Node temp=root;
        while(root.right!=null){
            root = root.right;
        }
        return root.val;
    }
    public static int findMIN(Node root){
        if(root==null) return Integer.MAX_VALUE;
        //Node temp=root;
        while(root.left!=null){
            root=root.left;
        }
        return root.val;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        System.out.println(Min(a));//2
        System.out.println(Max(a));//19
        System.out.println(findMIN(a));//2
        System.out.println(findMAX(a));//19
        System.out.println(findMin(a));//2
        System.out.println(findMax(a));//19
    }
}
