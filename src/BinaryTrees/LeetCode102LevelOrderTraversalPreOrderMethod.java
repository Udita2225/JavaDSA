package BinaryTrees;
/*
102. Binary Tree Level Order Traversal
Given the root of a binary tree, return the level order traversal of
its nodes' values. (i.e., from left to right, level by level).
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:
Input: root = [1]
Output: [[1]]
Example 3:
Input: root = []
Output: []
Constraints:
The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
*/
public class LeetCode102LevelOrderTraversalPreOrderMethod {
/*
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
            TreeNode front = q.remove();
            level.add(front.val);
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        ans.add(level);
        }
        return ans;
    }
}

Another Solution
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
    public void nthLevel(TreeNode root, int level, int i, List<Integer> arr){
        if(root==null) return;
        if(level>i) return;
        if(level==i){
            arr.add(root.val);
            return;
        }
        nthLevel(root.left,level+1,i,arr);
        nthLevel(root.right,level+1,i,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> ans =new ArrayList<>();
     int lvl =levels(root);
     for(int i=0; i<lvl; i++){
        List<Integer> arr =new ArrayList<>();
        nthLevel(root,0,i,arr);
        ans.add(arr);
     }
     return ans;
    }
}
*/

}
