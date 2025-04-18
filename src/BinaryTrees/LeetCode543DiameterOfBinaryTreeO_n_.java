package BinaryTrees;
//Time Complexity :- O(n)
public class LeetCode543DiameterOfBinaryTreeO_n_ {
/*
543. Diameter of Binary Tree
Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.
Example 1:
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:
Input: root = [1,2]
Output: 1
Constraints:
The number of nodes in the tree is in the range [1, 104].
-100 <= Node.val <= 100
*/

/*
class Solution {
    public int levels(TreeNode root, int[] ans){
        if(root==null) return 0;
        int leftlevels = levels(root.left,ans);
        int rightlevels =levels(root.right,ans);
        int myDia = leftlevels + rightlevels;
        ans[0] = Math.max(myDia, ans[0]);
        return 1+Math.max(leftlevels,rightlevels);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans ={0};
        levels(root,ans);
        return ans[0];
    }
}
*/
}
