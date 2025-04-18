package BinarySearchTree;
/*
98. Validate Binary Search Tree
Given the root of a binary tree, determine if it is a valid binary search tree (BST).
A valid BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Example 1:
Input: root = [2,1,3]
Output: true
Example 2:
Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
Constraints:
The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
*/
public class LeetCode98ValidateBinarySearchTree {

/*
//Method 3
class Solution {
    static boolean flag;
    public long MAX(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long leftMax = MAX(root.left);
        if(leftMax>=root.val) flag=false;
        long rightMax = MAX(root.right);
        return Math.max(root.val, Math.max(leftMax,rightMax));
    }
    public long MIN(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long leftMin = MIN(root.left);
        long rightMin = MIN(root.right);
        if(rightMin<=root.val) flag=false;
        return Math.min(root.val,Math.min(leftMin,rightMin));
    }
    public boolean isValidBST(TreeNode root) {
       flag =true;
       MAX(root);
       MIN(root);
       return flag;
    }
}

//Method 2 Without Using ArrayList
class Solution {
    private TreeNode prev = null;
    public boolean Inorder(TreeNode root){
        if(root==null) return true;
        if(!Inorder(root.left)) return false;
        if(prev!=null && prev.val >= root.val) return false;
        prev = root;
        return Inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        prev =null;
        return Inorder(root);
    }
}
//Method-2 Using Inorder Traversal
class Solution {
    public boolean isSorted(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i=1; i<n; i++){
            if(arr.get(i-1)>=arr.get(i)) return false;
        }
        return true;
    }
    public void Inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right,arr);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Inorder(root,arr);
        return isSorted(arr);
    }
}
//Method 1. Using the property min(RST)>node.val>max(LST)
//Not a good code
//because yaha par hum har level par maximum node nikal rahe hain yaani har level par n operations
//Time complexity in Best Case is O(nlogn)
//Time Complexity in Worst Case is O(n^2)
class Solution {
    public long MAX(TreeNode root){
     if(root==null) return Long.MIN_VALUE;
     long a =root.val;
     long b =MAX(root.left);
     long c =MAX(root.right);
     return Math.max(a,Math.max(b,c));
    }
    public long MIN(TreeNode root){
     if(root==null) return Long.MAX_VALUE;
     long a =root.val;
     long b =MIN(root.left);
     long c =MIN(root.right);
     return Math.min(a, Math.min(b,c));
    }
    public boolean isValidBST(TreeNode root) {
    if(root==null) return true;
    if(root.left==null && root.right==null) return true;
    if(root.val<= MAX(root.left)) return false;
    if(root.val>= MIN(root.right)) return false;
    return isValidBST(root.left) && isValidBST(root.right);
    }
}
/* Wrong Code
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
