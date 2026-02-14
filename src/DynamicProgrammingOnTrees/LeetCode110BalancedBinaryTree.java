package DynamicProgrammingOnTrees;
/*
110. Balanced Binary Tree
Given a binary tree, determine if it is height-balanced.

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
public class LeetCode110BalancedBinaryTree {
    /*
    Recursion + Memoization
    class Solution {
    public int levels(TreeNode root, HashMap<TreeNode, Integer> dp){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int Left = levels(root.left,dp);
        int Right = levels(root.right,dp);
        int level = 1 + Math.max(Left,Right);
        dp.put(root,level);
        return level;
    }
    public boolean Balanced(TreeNode root, HashMap<TreeNode,Integer> dp){
        if(root==null) return true;
        int LeftLevel = levels(root.left,dp);
        int RightLevel = levels(root.right,dp);
        if(Math.abs(LeftLevel-RightLevel)>1) return false;
        boolean LeftBalanced = Balanced(root.left,dp);
        boolean RightBalanced =  Balanced(root.right,dp);
        if(!LeftBalanced || !RightBalanced) return false;
        return true;
    }
    public boolean isBalanced(TreeNode root) {
    HashMap<TreeNode, Integer> dp = new HashMap<>();
    return Balanced(root,dp);
    }
}
    */
    /*
    class Solution {
    public int levels(TreeNode root, boolean[] ans){
        if(root==null) return 0;
        int Left = levels(root.left,ans);
        int Right =  levels(root.right,ans);
        int ifBalanced = Math.abs(Left-Right);
        if(ifBalanced>1) ans[0] = false;
        return 1+Math.max(Left,Right);
    }
    public boolean isBalanced(TreeNode root) {
    boolean[] ans =  {true};
    levels(root,ans);
    return ans[0];
    }
}
/*
class Solution {
    boolean flag;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int Left = levels(root.left);
        int Right = levels(root.right);
        int myBalan = Math.abs(Left-Right);
        if(myBalan>1) flag=false;
        return 1 + Math.max(Left,Right);
    }
    public boolean isBalanced(TreeNode root) {
        flag = true;
        levels(root);
        return flag;
    }
}
/*  Not a Good Code -> Coneverting it to one Recursive Code
class Solution {
    public int length(TreeNode root){
        if(root==null) return 0;
        int left = length(root.left);
        int right =  length(root.right);
        return 1 + Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int LeftLen = length(root.left);
        int RightLen = length(root.right);
        if(Math.abs(LeftLen-RightLen)>1) return false;
        boolean LeftBalan = isBalanced(root.left);
        boolean RightBalan = isBalanced(root.right);
        if(!LeftBalan || !RightBalan) return false;
        return true;
    }
}
*/
}
