package BinaryTrees;
//958. Check Completeness of a Binary Tree
public class LeetCode958CheckCompletenessOfABinaryTree {
/*
Given the root of a binary tree, determine if it is a complete binary tree.
In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level
are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
Example 1:
Input: root = [1,2,3,4,5,6]
Output: true
Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
Example 2:
Input: root = [1,2,3,4,5,null,7]
Output: false
Explanation: The node with value 7 isn't as far left as possible.
Constraints:
The number of nodes in the tree is in the range [1, 100].
1 <= Node.val <= 1000
*/
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
