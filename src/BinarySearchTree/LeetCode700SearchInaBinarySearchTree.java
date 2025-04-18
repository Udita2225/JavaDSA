package BinarySearchTree;
//700. Search in a Binary Search Tree
/*
You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted
with that node. If such a node does not exist, return null.
Example 1:
Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
Example 2:
Input: root = [4,2,7,1,3], val = 5
Output: []
Constraints:
The number of nodes in the tree is in the range [1, 5000].
1 <= Node.val <= 107
root is a binary search tree.
1 <= val <= 107
*/
public class LeetCode700SearchInaBinarySearchTree {
/*Sir's Solution- Easy And Nice Solution
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val<val) return searchBST(root.right,val);
        else if(root.val>val) return searchBST(root.left,val);
        else return root;
    }
}
*/
/* My Solution
class Solution {
    public TreeNode ifExists(TreeNode root, int target){
        if(root==null) return root;
        if(root.val==target) return root;
        else if(root.val>target) return ifExists(root.left,target);
        else return ifExists(root.right,target);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        return ifExists(root,val);
    }
}
*/
//public static void main(String[] args) {
//    System.out.println(10/0);
//}
}