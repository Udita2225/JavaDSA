package Heaps2;

public class IsBTaMaxHeap {
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
        return 1 + size(root.left) + size(root.right);
    }
    public static boolean isHeap(Node root){
    if(root==null) return true;
    if(root.left!=null && root.left.val>root.val) return false;
    if(root.right!=null && root.right.val>root.val) return false;
    return isHeap(root.left) && isHeap(root.right);
    }

    public static boolean isCBT(Node root, int idx,int size){
    if(root==null) return true;
    if(idx>=size) return false;
    return isCBT(root.left,2*idx+1,size) && isCBT(root.right,2*idx+2,size);
    }
    public static boolean isMaxHeap(Node root){
        int size = size(root);
        return isHeap(root) && isCBT(root,0,size);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(6);
        Node e = new Node(4);
        a.left=b; a.right=c;
        b.left=d; c.right=e;
        System.out.println(isMaxHeap(a));//false
        System.out.println(isCBT(a,0,size(a)));//false
        System.out.println(isHeap(a));//true
    }
}
