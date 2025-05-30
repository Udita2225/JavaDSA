package BinaryTrees;
/*
105. Construct Binary Tree from Preorder and Inorder Traversal
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is
the inorder traversal of the same tree, construct and return the binary tree.
Example 1:
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
Example 2:
Input: preorder = [-1], inorder = [-1]
Output: [-1]
Constraints:
1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder and inorder consist of unique values.
Each value of inorder also appears in preorder.
preorder is guaranteed to be the preorder traversal of the tree.
inorder is guaranteed to be the inorder traversal of the tree.
*/
public class LeetCode105ConstructBTfromPreorderInorder {
/*
class Solution {
    public TreeNode helper(int[] preorder, int[] inorder, int prelow, int prehi, int inlow, int inhi){
        if(prelow>prehi || inlow>inhi) return null;
        TreeNode root = new TreeNode(preorder[prelow]);
        int idx=0;
        while(inorder[idx]!=preorder[prelow]){
            idx++;
        }
        int leftSize = idx-inlow;
        root.left = helper(preorder,inorder,prelow+1,prelow+leftSize,inlow,idx-1);
        root.right = helper(preorder,inorder,prelow+leftSize+1,prehi,idx+1,inhi);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    int n= preorder.length;
    return helper(preorder,inorder,0,n-1,0,n-1);
    }
}
*/
}
