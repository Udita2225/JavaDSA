package BinaryTrees;

public class LeetCode257BinaryTreePaths {
/*
257. Binary Tree Paths
Given the root of a binary tree, return all root-to-leaf paths in any order.
A leaf is a node with no children.
Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:
Input: root = [1]
Output: ["1"]
Constraints:
The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100
*/
/*
class Solution {
    public void path(TreeNode root, List<String> ans, String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
        s += root.val;
        ans.add(s);
        return;
        }
        path(root.left,ans,s+root.val+"->");
        path(root.right,ans, s+root.val+"->");
        }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        path(root, ans, "");
        return ans;
    }
}
*/
}
