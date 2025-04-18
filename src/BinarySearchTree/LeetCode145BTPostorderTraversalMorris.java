package BinarySearchTree;
//145. Binary Tree Postorder Traversal
/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]
Explanation:
Example 2:
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,6,7,5,2,9,8,3,1]
Explanation:
Example 3:
Input: root = []
Output: []
Example 4:
Input: root = [1]
Output: [1]
Constraints:
The number of the nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
Follow up: Recursive solution is trivial, could you do it iteratively?
*/
public class LeetCode145BTPostorderTraversalMorris {
/*
//Using Morris Traversal
    class Solution {
    public void Morris(TreeNode root){
        TreeNode curr= root;
        while(curr!=null){
            if(curr.right!=null){
                TreeNode l = curr.left;
                curr.left = curr.right;
                TreeNode pred = curr.right;
                while(pred.left!=null)  pred = pred.left;
                pred.left= l;
                curr.right=null;
                curr = curr.left;
            }
            else{
                curr = curr.left;
            }
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    if(root==null) return ans;
    Morris(root);
    TreeNode temp =  root;
    while(temp!=null){
        ans.add(temp.val);
        temp = temp.left;
    }
    Collections.reverse(ans);
    return ans;
    }
}
// Using Stack Iterative Solution
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
      Stack<TreeNode> st = new Stack<>();
      List<Integer> ans = new ArrayList<>();
      if(root!=null) st.push(root);
      while(st.size()>0){
        TreeNode top = st.pop();
        ans.add(top.val);
        if(top.left!=null) st.push(top.left);
        if(top.right!=null) st.push(top.right);
      }
      Collections.reverse(ans);
      return ans;
    }
}
/*
class Solution {
    public void helper(TreeNode root, List<Integer> arr){
        if(root==null) return;
        helper(root.left, arr);
        helper(root.right,arr);
        arr.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        helper(root,arr);
        return arr;
    }
}
*/
}
