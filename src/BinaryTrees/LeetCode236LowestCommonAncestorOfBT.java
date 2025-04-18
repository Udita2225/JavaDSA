package BinaryTrees;
/*
236. Lowest Common Ancestor of a Binary Tree
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined
between two nodes p and q as the lowest node in T that has both p and q as descendants
 (where we allow a node to be a descendant of itself).”
Example 1:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
Example 2:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself
according to the LCA definition.
Example 3:
Input: root = [1,2], p = 1, q = 2
Output: 1
Constraints:
The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the tree.
*/
/*
public class LeetCode236LowestCommonAncestorOfBT {
    class Solution {
        public boolean exists(TreeNode root, TreeNode node){
            if(root==node) return true;
            if(root==null) return false;
            return exists(root.left, node) || exists(root.right,node);
        }
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(p==root || q==root) return root;
            //does 'p' lie in Left-Subtree
            boolean pLiesInLST = exists(root.left,p);
            boolean qLiesInLST = exists(root.left,q);
            if(pLiesInLST==true && qLiesInLST==true) return lowestCommonAncestor(root.left,p,q);
            if(pLiesInLST==false && qLiesInLST==false) return lowestCommonAncestor(root.right,p,q);
            else return root;
        }
    }
/*
        boolean pLiesInLST = exists(root.left,p);
        boolean qLiesInLST = exists(root.left,q);
        if(pLiesInLST==true && qLiesInLST==false) return root;
        if(pLiesInLST==false && qLiesInLST==true) return root;
        if(pLiesInLST==true && qLiesInLST==true) return lowestCommonAncestor(root.left,p,q);
        if(pLiesInLST==false && qLiesInLST==false) return lowestCommonAncestor(root.right,p,q);
        //In Leetcode we have to give a return statement if the ifcondition is not true so we will club  3 and 4
        statement
*/

