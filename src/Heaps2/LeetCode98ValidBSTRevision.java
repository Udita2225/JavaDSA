package Heaps2;

public class LeetCode98ValidBSTRevision {
    public static void main(String[] args) {
        /* // TC- O(n)
// SC- O(h)
class Solution {
    static boolean flag;
    public long Max(TreeNode root){
    if(root==null) return Long.MIN_VALUE;
    long LeftMax = Max(root.left);
    if(LeftMax>=root.val) flag=false;
    long RightMax =Max(root.right);
    return Math.max(root.val, Math.max(LeftMax, RightMax));
    }
    public long Min(TreeNode root){
        if(root==null)  return Long.MAX_VALUE;
        long LeftMin = Min(root.left);
        long RightMin = Min(root.right);
        if(RightMin<=root.val) flag=false;
        return Math.min(root.val, Math.min(LeftMin, RightMin));
    }
    public boolean isValidBST(TreeNode root) {
    flag = true;
    Max(root);
    Min(root);
    return flag;
    }
}
/*
//Without Using Extra ArrayList
//TC =O(n)
//SC =O(h)
class Solution {
    static TreeNode prev =null;
    public boolean Inorder(TreeNode root){
        if(root==null) return true;
        if(!Inorder(root.left)) return false;
        if(prev!=null && prev.val>=root.val) return false;
        prev = root;
        return Inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
    prev = null;
    return Inorder(root);
    }
}
/*
//Time Comlexity :- O(n)
//Space Complexity :- O(n)
class Solution {
    public void Inorder(TreeNode root, ArrayList<Integer> arr){
        if (root==null) return;
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right,arr);
    }
    public boolean isSorted(ArrayList<Integer> arr){
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i-1)>=arr.get(i)) return false;
        }
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Inorder(root,arr);
        return isSorted(arr);
    }
}
/* Not a good Code Because Time Complexity is O(nlogn) in Best Case
And O(n^2) in Worst Case
class Solution {
    public long Max(TreeNode root){
    if(root==null) return Long.MIN_VALUE;
     long a = root.val;
     long b = Max(root.left);
     long c = Max(root.right);
     return Math.max(a,Math.max(b,c));
    }
    public long Min(TreeNode root){
     if(root==null) return Long.MAX_VALUE;
     long a = root.val;
     long b = Min(root.left);
     long c = Min(root.right);
     return Math.min(a, Math.min(b,c));
    }
    public boolean isValidBST(TreeNode root) {
    if(root==null) return true;
    if(root.left==null && root.right==null) return true;
    if(root.val<=Max(root.left)) return false;
    if(root.val>=Min(root.right)) return false;
    return isValidBST(root.left) && isValidBST(root.right);
    }
}
/*
//This is a Wrong code
class Solution {
    public boolean isValidBST(TreeNode root) {
    if(root==null) return true;
    if(root.left!=null && root.left.val>=root.val) return false;
    if(root.right!=null && root.right.val<=root.val) return false;
    return isValidBST(root.left) && isValidBST(root.right);
    }
}
*/

    }
}
