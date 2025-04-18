package BinaryTrees;
/*
199. Binary Tree Right Side View
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
Explanation:
Example 2:
Input: root = [1,2,3,4,null,null,null,5]
Output: [1,3,4,5]
Explanation:
Example 3:
Input: root = [1,null,3]
Output: [1,3]
Example 4:
Input: root = []
Output: []
Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
*/
public class LeetCode199BinaryTreeRightSideView {
/*
/*1. Best Solution
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left), levels(root.right));
    }
    public void postorder(TreeNode root, int level, List<Integer> ans){
        if(root==null) return;
        postorder(root.left,level+1,ans);
        postorder(root.right,level+1,ans);
        ans.set(level,root.val);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int n = levels(root);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(0);
        }
        postorder(root,0,ans);
        return ans;
    }
}
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left), levels(root.right));
    }
    public void Inorder(TreeNode root, int level, List<Integer> ans){
        if(root==null) return;
        Inorder(root.left,level+1,ans);
        ans.set(level,root.val);
        Inorder(root.right,level+1,ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int n = levels(root);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(0);
        }
        Inorder(root,0,ans);
        return ans;
    }
}


class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left), levels(root.right));
    }
    public void preorder(TreeNode root, int level, List<Integer> ans){
        if(root==null) return;
        ans.set(level,root.val);
        preorder(root.left,level+1,ans);
        preorder(root.right,level+1,ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int n = levels(root);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(0);
        }
        preorder(root,0,ans);
        return ans;
    }
}


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode lastNode = null;  // Keep track of the last node
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                lastNode = temp;  // Update last node for this level
                // Add left child first to ensure rightmost node is processed first
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            ans.add(lastNode.val);  // Add last node of the level
        }
        return ans;
    }
}


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size = q.size();
            Stack<Integer> st = new Stack<>();
            for(int i=0; i<size; i++){
               TreeNode temp =  q.remove();
               st.push(temp.val);
               if(temp.left!=null) q.add(temp.left);
               if(temp.right!=null) q.add(temp.right);
            }
            ans.add(st.pop());
        }
        return ans;
    }
}
*/

}
