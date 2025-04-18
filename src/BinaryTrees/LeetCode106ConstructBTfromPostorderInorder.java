package BinaryTrees;

public class LeetCode106ConstructBTfromPostorderInorder {
/*
106. Construct Binary Tree from Inorder and Postorder Traversal
Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder
is the postorder traversal of the same tree, construct and return the binary tree.
Example 1:
Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]
Example 2:
Input: inorder = [-1], postorder = [-1]
Output: [-1]
Constraints:
1 <= inorder.length <= 3000
postorder.length == inorder.length
-3000 <= inorder[i], postorder[i] <= 3000
inorder and postorder consist of unique values.
Each value of postorder also appears in inorder.
inorder is guaranteed to be the inorder traversal of the tree.
postorder is guaranteed to be the postorder traversal of the tree.
*/
/*
class Solution {
    public TreeNode helper(int[] inorder, int[] postorder, int postlow,int posthi, int inlow, int inhi){
        if(postlow<posthi || inlow> inhi) return null;
        TreeNode root = new TreeNode(postorder[postlow]);
        int idx=0;
        while(inorder[idx]!=postorder[postlow]){
            idx++;
        }
        int RightSize = inhi-idx;
        root.left = helper(inorder,postorder,postlow-RightSize-1,posthi,inlow,idx-1);
        root.right = helper(inorder,postorder, postlow-1,postlow-RightSize,idx+1,inhi);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    int n = postorder.length;
    //postlow =n-1 ,  posthi=0
    //inlow =0  inhi=n-1
    return helper(inorder,postorder,n-1,0,0,n-1);
    }
}
*/
}
