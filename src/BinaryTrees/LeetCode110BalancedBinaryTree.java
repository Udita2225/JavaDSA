package BinaryTrees;

public class LeetCode110BalancedBinaryTree {
/*
110. Balanced Binary Tree
Given a binary tree, determine if it is
height-balanced
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:
Input: root = []
Output: true
Constraints:
The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104
*/
/*
//Boolean Data Type is Passed By Value that's why we have made an array here which is passed
//by reference
class Solution {
    //static boolean ans;
    public int levels(TreeNode root, boolean[] ans){
        if(root==null) return 0;
        int leftlevels = levels(root.left, ans);
        int rightlevels = levels(root.right, ans);
        int diff = Math.abs(leftlevels-rightlevels);
        if(diff>1) ans[0]=false;
        return 1+Math.max(leftlevels, rightlevels);
    }
    public boolean isBalanced(TreeNode root) {
    boolean[] ans ={true};
    levels(root,ans);//TC = O(n);
    return ans[0];
    }
}

/*
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.right),levels(root.left));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = levels(root.left);
        int right = levels(root.right);
        if(Math.abs(left-right)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
*/
/* Not a good code
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.right),levels(root.left));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = levels(root.left);
        int right = levels(root.right);
        if(Math.abs(left-right)>1) return false;
        boolean LST = isBalanced(root.left);
        if(LST==false) return false;
        boolean RST = isBalanced(root.right);
        if(RST==false) return false;
        return true;
        //return isBalanced(root.left) && isBalanced(root.right);
    }
}
*/
}
