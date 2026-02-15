package DynamicProgrammingOnTrees;
/*
124. Binary Tree Maximum Path Sum
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting
them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path.

Example 1:

Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
Example 2:

Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.

Constraints:
The number of nodes in the tree is in the range [1, 3 * 104].
-1000 <= Node.val <= 1000
*/
public class LeetCode124BinaryTreeMaximumPathSum {
    /*
    // Using HashMap
class Solution {
    public int LineSum(TreeNode root,HashMap<TreeNode, Integer> dp){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int left = LineSum(root.left,dp);
        int right = LineSum(root.right,dp);
        int currSum =  Math.max(0,root.val + Math.max(left,right));
        dp.put(root,currSum);
        return currSum;
    }
    public int sum(TreeNode root,HashMap<TreeNode, Integer> dp){
    if(root==null) return Integer.MIN_VALUE;
    int Left = LineSum(root.left,dp);
    int Right = LineSum(root.right,dp);
    int currSum = root.val + Left + Right;
    int LeftSum = sum(root.left,dp);
    int RightSum = sum(root.right,dp);
    return Math.max(currSum, Math.max(LeftSum,RightSum));
    }
    public int maxPathSum(TreeNode root) {
    HashMap<TreeNode, Integer> dp =  new HashMap<>();
    return sum(root,dp);
    }
}
 /*
class Solution {
    public int LineSum(TreeNode root, int[] maxSum){
        if(root==null) return 0;
        int left =  LineSum(root.left,maxSum);
        int right =  LineSum(root.right,maxSum);
        int pathSum = root.val + left + right;
        maxSum[0] =  Math.max(maxSum[0], pathSum);
        return Math.max(0,root.val + Math.max(left,right));
    }
    public int maxPathSum(TreeNode root) {
    int[] maxSum = {Integer.MIN_VALUE};
    LineSum(root,maxSum);
    return maxSum[0];
    }
}*/
/*
class Solution {
    int maxSum;
    public int LineSum(TreeNode root){
        if(root==null) return 0;
        int left =  Math.max(0,LineSum(root.left));
        int right = Math.max(0, LineSum(root.right));
        int currSum = root.val + left +right;
        maxSum = Math.max(maxSum,currSum);
        return Math.max(0,root.val +  Math.max(left,right));
    }
    public int maxPathSum(TreeNode root) {
    maxSum = Integer.MIN_VALUE;
    LineSum(root);
    return maxSum;
    }
}
/*
class Solution {
    public int LineSum(TreeNode root){
        if(root==null) return 0;
        int left =  Math.max(0,LineSum(root.left));
        int right = Math.max(0,LineSum(root.right));
        return Math.max(0,root.val + Math.max(left,right));
    }
    public int sum(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int left = LineSum(root.left);
        int right = LineSum(root.right);
        int currSum = root.val + left + right;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return Math.max(currSum, Math.max(leftSum,rightSum));
    }
    public int maxPathSum(TreeNode root) {
    int maxSum = sum(root);
    return maxSum;
    }
}
*/


}
