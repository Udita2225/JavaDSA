package BinarySearchTree;
//1038. Binary Search Tree to Greater Sum Tree
/*
Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is
changed to the original key plus the sum of all keys greater than the original key in BST.
As a reminder, a binary search tree is a tree that satisfies these constraints:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Example 1:
Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
Example 2:
Input: root = [0,null,1]
Output: [1,null,1]
Constraints:
The number of nodes in the tree is in the range [1, 100].
0 <= Node.val <= 100
All the values in the tree are unique.
Note: This question is the same as 538: https://leetcode.com/problems/convert-bst-to-greater-tree/
*/
public class LeetCode1038BSTtoGreaterSumTree {
/*
//**Method 3 Best Code Without using ArrayList
//Time Complexity - O(n);
//Space Complexity - O(h); WorstCase - O(n)  BestCase - O(logn)
//h- level/height of tree
class Solution {
    int sum =0;
    public void RevInorder(TreeNode root){
        if(root==null) return;
        RevInorder(root.right);
        sum += root.val;
        root.val = sum;
        RevInorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
       //In inorder, if we call the right sub-tree first then we get reverse of increasing order ..i.e.,
       //Decreasing Order
       sum=0;
       if(root==null) return null;
       RevInorder(root);
       return root;
    }
}

/**Method 2 better than method 1 We have used an extra Array
Time Complexity - O(n);
Space Complexity - O(n);
class Solution {
    //List<TreeNode> arr =  new ArrayList<>();
    public void Inorder(TreeNode root, List<TreeNode> arr){
        if(root==null) return;
        Inorder(root.left,arr);
        arr.add(root);
        Inorder(root.right,arr);
    }
    public TreeNode bstToGst(TreeNode root) {
    List<TreeNode> arr = new ArrayList<>();
    Inorder(root,arr);
    int n = arr.size();
    for(int i=n-2; i>=0; i--){
        arr.get(i).val += arr.get(i+1).val;
    }
    return root;
    }
}
*/
/*
**Method 1 Very Bad Code
* This is a very Bad code coz while searching for the  arr.indexOf(root.val) on every call ,
makes the time complexity 0(n^2)

class Solution {
    public void Inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right,arr);
    }
    public void NewTree(TreeNode root,ArrayList<Integer> arr, int size){
        if(root==null) return;
        NewTree(root.left,arr,size);
        for(int i=arr.indexOf(root.val)+1; i<size; i++){
            root.val += arr.get(i);
        }
        NewTree(root.right,arr,size);
    }
    public TreeNode bstToGst(TreeNode root) {
    if(root==null) return null;
    ArrayList<Integer> arr =  new ArrayList<>();
    Inorder(root,arr);
    NewTree(root,arr, arr.size());
    return root;
    }
}
*/

}