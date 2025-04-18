package BinaryTrees;
/*
103. Binary Tree Zigzag Level Order Traversal
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to
right, then right to left for the next level and alternate between).
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:
Input: root = [1]
Output: [[1]]
Example 3:
Input: root = []
Output: []
Constraints:
The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100
*/
public class LeetCode103BTZigZagLevelOrderTraversal {
/*Solution 1
class Solution{
    public class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node =node;
            this.level =level;
        }
    }
    public int level(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(level(root.left), level(root.right));
    }
    public void BFS(TreeNode root, List<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl= front.level;
            ans.get(lvl).add(temp.val);
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
      List<List<Integer>> ans = new ArrayList<>();
      if(root==null) return ans;
      int lvl = level(root);
      for(int i=0; i<lvl; i++){
        List<Integer> arr = new ArrayList<>();
        ans.add(arr);
      }
      BFS(root,ans);
      for(int i=0; i<lvl; i++){
        if(i%2!=0){
            Collections.reverse(ans.get(i));
        }
      }
      return ans;
    }
}
/*Solution 2 Best Solution
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);
        boolean LeftToRight = true;
        while(q.size()>0){
            int size =q.size();
            List<Integer> arr = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode front =q.remove();
                arr.add(front.val);
                    if(front.left!=null) q.add(front.left);
                    if(front.right!=null) q.add(front.right);
            }
            if(!LeftToRight){
                Collections.reverse(arr);
            }
            ans.add(arr);
            LeftToRight = !LeftToRight;
        }
        return ans;
    }
}
*/
/*Solution 3
class Solution {
    public int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public void nthLevelLR(TreeNode root, List<Integer> arr, int i,int level){
        if(root==null) return;
        if(level==i){
            arr.add(root.val);
        }
        nthLevelLR(root.left,arr,i,level+1);
        nthLevelLR(root.right,arr,i,level+1);
    }
    public void nthLevelRL(TreeNode root, List<Integer> arr, int i,int level){
        if(root==null) return;
        if(level==i){
            arr.add(root.val);
        }
        nthLevelRL(root.right,arr,i,level+1);
        nthLevelRL(root.left,arr,i,level+1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = level(root);
        for(int i=0; i<lvl; i++){
            List<Integer> arr= new ArrayList<>();
            if(i%2==0){
            nthLevelLR(root,arr,i,0);
            }
            else{
            nthLevelRL(root,arr,i,0);
            }
            ans.add(arr);
        }
        return ans;
    }
}
*/

}
