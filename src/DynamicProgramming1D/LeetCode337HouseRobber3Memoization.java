package DynamicProgramming1D;
/*
337. House Robber III
The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root.
Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that all houses
in this place form a binary tree. It will automatically contact the police if two directly-linked houses were broken
into on the same night.
Given the root of the binary tree, return the maximum amount of money the thief can rob without alerting the police.
Example 1:
Input: root = [3,2,3,null,3,null,1]
Output: 7
Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
Example 2:
Input: root = [3,4,5,1,3,null,1]
Output: 9
Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.
Constraints:
The number of nodes in the tree is in the range [1, 104].
0 <= Node.val <= 104
*/
public class LeetCode337HouseRobber3Memoization {
    public static void main(String[] args) {
/*
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
        /*
        class Solution {
            public int Amount(TreeNode root, HashMap<TreeNode, Integer> map){
                if(root==null) return 0;
                if(map.containsKey(root)) return map.get(root);
                int take =  root.val;
                if(root.left!=null){
                    take += Amount(root.left.left,map);
                    take += Amount(root.left.right,map);
                }
                if(root.right!=null){
                    take += Amount(root.right.left,map);
                    take += Amount(root.right.right,map);
                }
                int skip =  Amount(root.left,map) + Amount(root.right,map);
                int result =  Math.max(take,skip);
                map.put(root,result);
                return result;

            }
            public int rob(TreeNode root) {
                HashMap<TreeNode, Integer> map = new HashMap<>();
                return Amount(root,map);
            }
        }

/*  ******* Completely Wrong Code. I have kept it just to realize that Array Cannot be used Here .
   We will have to use HashMaps because we dont know the exact size. Also indexing cannot be done in binary tree.

class Solution {
    public int size(TreeNode root){
    if(root==null) return 0;
    return 1 + size(root.left) + size(root.right);
    }
    public int Amount(TreeNode root, int[] dp, int i){
        if(root==null) return 0;
        if(dp[i]!=-1) return dp[i];
        int take =  root.val;
        if(root.left!=null){
            take += Amount(root.left.left,dp,i+3);
            take += Amount(root.left.right,dp,i+4);
        }
        if(root.right!=null){
            take += Amount(root.right.left,dp,i+5);
            take += Amount(root.right.right,dp,i+6);
        }
        int skip =  Amount(root.left,dp,i+1) + Amount(root.right,dp,i+2);
        return dp[i] = Math.max(take,skip);
}
    public int rob(TreeNode root) {
    int size = size(root);
    int[] dp = new int[size];
    Arrays.fill(dp,-1);
    return Amount(root,dp,0);
    }
}
/* Simple Recursion -  Time Limit Exceeded Error
class Solution {
    public int rob(TreeNode root) {
    if(root==null) return 0;
    int take = root.val;

if (root.left != null) {
    take += rob(root.left.left);
    take += rob(root.left.right);
}

if (root.right != null) {
    take += rob(root.right.left);
    take += rob(root.right.right);
}
    int skip = rob(root.left) + rob(root.right);
    return Math.max(take,skip);
    }
}
*/
    }
}
