package BinarySearchTree;
/*
230. Kth Smallest Element in a BST
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values
of the nodes in the tree.
Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1
Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
Constraints:
The number of nodes in the tree is n.
1 <= k <= n <= 104
0 <= Node.val <= 104
Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the
kth smallest frequently, how would you optimize?
*/
public class LeetCode230kthSmallestElementinBST {
    /*
    class Solution {
        public void Inorder(TreeNode root, List<Integer> arr){
            if(root==null) return;
            Inorder(root.left,arr);
            arr.add(root.val);
            Inorder(root.right,arr);
        }
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> arr =  new ArrayList<>();
            Inorder(root,arr);
            return arr.get(k-1);
        }
    }
    /*
    class Solution {
    public int ele =0;
    public int result;
    public void Inorder(TreeNode root,int k){
        if(root==null) return;
        Inorder(root.left,k);
        ele++;
        if(ele==k){
            result = root.val;
            return;
        }
        Inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
    ele=0;
    Inorder(root,k);
    return result;
    }
}
*/
}
