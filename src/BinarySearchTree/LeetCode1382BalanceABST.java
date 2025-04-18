package BinarySearchTree;
//1382. Balance a Binary Search Tree
public class LeetCode1382BalanceABST {
/*
Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more
than one answer, return any of them.
A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.
Example 1:
Input: root = [1,null,2,null,3,null,4,null,null]
Output: [2,1,3,null,null,null,4]
Explanation: This is not the only correct answer, [3,1,4,null,2] is also correct.
Example 2:
Input: root = [2,1,3]
Output: [2,1,3]
Constraints:
The number of nodes in the tree is in the range [1, 104].
1 <= Node.val <= 105
*/
}
/*
//By Modifying the existing Binary Tree
class Solution {
    public void Inorder(TreeNode root,ArrayList<TreeNode> arr){
        if(root==null) return;
        Inorder(root.left,arr);
        arr.add(root);
        Inorder(root.right,arr);
    }
    public TreeNode helper(ArrayList<TreeNode> arr, int low, int high){
        if(low>high) return null;
        int mid = (low+high)/2;
        TreeNode root = arr.get(mid);
        root.left = helper(arr,low,mid-1);
        root.right = helper(arr,mid+1,high);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
    ArrayList<TreeNode> arr = new ArrayList<>();
    Inorder(root,arr);
    int n =arr.size();
    return helper(arr,0,n-1);
    }
}
/*
//By creating a brand new Binary Search Tree
class Solution {
    public void Inorder(TreeNode root,ArrayList<TreeNode> arr){
        if(root==null) return;
        Inorder(root.left,arr);
        arr.add(new TreeNode(root.val));
        Inorder(root.right,arr);
    }
    public TreeNode helper(ArrayList<TreeNode> arr, int low, int high){
        if(low>high) return null;
        int mid = (low+high)/2;
        TreeNode root = arr.get(mid);
        root.left = helper(arr,low,mid-1);
        root.right = helper(arr,mid+1,high);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
    ArrayList<TreeNode> arr = new ArrayList<>();
    Inorder(root,arr);
    int n =arr.size();
    return helper(arr,0,n-1);
    }
}
*/
