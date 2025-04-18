package BinarySearchTree;
//1008. Construct Binary Search Tree from Preorder Traversal
/*
Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree),
construct the tree and return its root.
It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given
test cases.
A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than
Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses
Node.right.
Example 1:
Input: preorder = [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]
Example 2:
Input: preorder = [1,3]
Output: [1,null,3]
Constraints:
1 <= preorder.length <= 100
1 <= preorder[i] <= 1000
All the values of preorder are unique.
*/
public class LeetCode1008ConstructBSTFromPreorder {
    /*
    class Solution {
        public TreeNode helper(int[] preorder, int[] inorder, int prelow, int prehigh, int inlow, int inhigh){
            if(prelow>prehigh || inlow>inhigh) return null;
            TreeNode root = new TreeNode(preorder[prelow]);
            int i=0;
            while(preorder[prelow]!=inorder[i]) i++;
            int size = i-inlow;
            root.left = helper(preorder,inorder,prelow+1,prelow+size,inlow,i-1);
            root.right = helper(preorder, inorder, prelow+size+1,prehigh, i+1,inhigh);
            return root;
        }
        public TreeNode bstFromPreorder(int[] preorder) {
            int n = preorder.length;
            int[] inorder = Arrays.copyOf(preorder,n);
            Arrays.sort(inorder);
            return helper(preorder, inorder, 0, n-1, 0 ,n-1);
        }
    }*/
}
