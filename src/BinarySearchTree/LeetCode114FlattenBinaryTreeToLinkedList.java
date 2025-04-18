package BinarySearchTree;
//114. Flatten Binary Tree to Linked List
public class LeetCode114FlattenBinaryTreeToLinkedList {
/*
Given the root of a binary tree, flatten the tree into a "linked list":
The "linked list" should use the same TreeNode class where the right child pointer points to the next
node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.
Example 1:
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]
Example 2:
Input: root = []
Output: []
Example 3:
Input: root = [0]
Output: [0]
Constraints:
The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100
Follow up: Can you flatten the tree in-place (with O(1) extra space)?
*/
// Morris Traversal
/*
class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode r = curr.right;
                curr.right = curr.left;
                TreeNode pred =  curr.left;
                while(pred.right!=null) pred =pred.right;
                pred.right = r;
                curr.left=null;//IMPORTANT
                curr =curr.right;
            }
            else{
                curr =curr.right;
            }
        }
    }
}
//Method 3 Using Magic Of Recursion
/*
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        TreeNode lst =  root.left;
        TreeNode rst = root.right;
        flatten(lst);
        flatten(rst);
        root.left =null;
        root.right = lst;
        TreeNode temp = root;
        while(temp.right!=null) temp =temp.right;
        temp.right = rst;
    }
}
*/
// Method 2 Without Using ArrayList
/*
class Solution {
    public TreeNode prev = null;
    public void Preorder(TreeNode root){
        if(root==null) return;
        TreeNode left =root.left;
        TreeNode right = root.right;
        if(prev!=null){
            prev.left=null;
            prev.right=root;
        }
        prev =root;
        Preorder(left);
        Preorder(right);
    }
    public void flatten(TreeNode root) {
    prev=null;
    Preorder(root);
    }
}*/
/*
// Method 1 By Using ArrayList
class Solution {
    public void Preorder(TreeNode root, ArrayList<TreeNode> arr){
        if(root==null) return;
        arr.add(root);
        Preorder(root.left,arr);
        Preorder(root.right,arr);
    }
    public void flatten(TreeNode root) {
    ArrayList<TreeNode> arr =  new ArrayList<>();
    Preorder(root,arr);
    // int i=1;
    // while(i<arr.size()){
    //     arr.get(i-1).left=null;
    //     arr.get(i-1).right=arr.get(i);
    //     i++;
    //    }

    int n=arr.size();
    for(int i=0; i<n; i++){
        if(i!=n-1) arr.get(i).right =  arr.get(i+1);
        arr.get(i).left = null;
      }
    }
}
*/
}
