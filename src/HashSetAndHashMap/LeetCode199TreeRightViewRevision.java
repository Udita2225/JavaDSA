package HashSetAndHashMap;
//199. Binary Tree Right Side View
public class LeetCode199TreeRightViewRevision {
/*
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
/*
class Solution {
    public void preorder(int level, List<Integer> arr, TreeNode root){
        if(root==null) return;
        if(arr.size()==level) arr.add(root.val);
        preorder(level+1,arr,root.right);
        preorder(level+1, arr, root.left);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preorder(0,arr,root);
        return arr;
    }
}
*/
}
