package Heaps2;

public class GFGCompleteBinaryTreePractice {
    /*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

    class GfG {
        public static int size(Node root){
            if(root==null) return 0;
            return 1+size(root.left)+size(root.right);
        }
        public static boolean isCBT(Node root, int idx, int size){
            if(root==null) return true;
            if(idx>=size) return false;
            return isCBT(root.left,2*idx+1,size) && isCBT(root.right,2*idx+2,size);
        }
        boolean isCompleteBT(Node root) {
            // add code here.
            int size =size(root);
            return isCBT(root,0,size);
        }
    }*/
}
