package BinaryTrees;
/*
101. Symmetric Tree
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
Constraints:
The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
Follow up: Could you solve it both recursively and iteratively?
*/
public class LeetCode101SymmetricTree {
/*
class Solution {
    public void invert(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    public boolean isSame(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        if(isSame(p.left,q.left)==false) return false;
        if(isSame(p.right, q.right)==false) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        invert(root.left);
        boolean isSymmetric = isSame(root.left, root.right);
        invert(root.left);
        return isSymmetric;
    }
}
*/
//Optimized Solution
/*
class Solution {
    public boolean isMirror(TreeNode p, TreeNode q) {
        // Base case: if both nodes are null, they are symmetric
        if (p == null && q == null) return true;

        // If one node is null or values do not match, not symmetric
        if (p == null || q == null || p.val != q.val) return false;

        // Check symmetry for subtrees
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        // A tree is symmetric if its left and right subtrees are mirror images
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
}
*/
}
