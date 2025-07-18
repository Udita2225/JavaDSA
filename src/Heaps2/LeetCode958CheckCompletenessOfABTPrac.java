package Heaps2;

public class LeetCode958CheckCompletenessOfABTPrac {
    /*
    class Solution {
    public int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public boolean isCBT(TreeNode root, int idx, int size){
        if(root==null) return true;
        if(idx>=size) return false;
        return isCBT(root.left, 2*idx+1,size) && isCBT(root.right,2*idx+2,size);
    }
    public boolean isCompleteTree(TreeNode root) {
    int size =size(root);
    return isCBT(root,0,size);
    }
}
     */
}
