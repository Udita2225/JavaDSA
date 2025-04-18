package BinarySearchTree;
//450. Delete Node in a BST
/*
Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node
reference (possibly updated) of the BST.
Basically, the deletion can be divided into two stages:
Search for a node to remove.
If the node is found, delete the node.
Example 1:
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
Example 2:
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.
Example 3:
Input: root = [], key = 0
Output: []
Constraints:
The number of nodes in the tree is in the range [0, 104].
-105 <= Node.val <= 105
Each node has a unique value.
root is a valid binary search tree.
-105 <= key <= 105
Follow up: Could you solve it with time complexity O(height of tree)?
*/
public class LeetCode450DeleteNodeInABST {
    /*
    class Solution {
        public TreeNode iopred(TreeNode root){
            TreeNode pred = root.left;
            while(pred.right!=null) pred=pred.right;
            return pred;
        }
        public TreeNode iopredParent(TreeNode root,TreeNode pred){
            if(root.left==pred || root.right==pred) return root;
            TreeNode predParent = root.left;
            while(predParent.right!=pred) predParent = predParent.right;
            return predParent;
        }
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root==null) return null;
            if(root.val==key){//Deletion
                //Case 1: 0 Child Nodes
                if(root.left==null && root.right==null){
                    return null;
                }
                //Case 2: 1 Child Node
                else if(root.left==null || root.right==null){
                    if(root.left==null) return root.right;
                    else return root.left;
                }
                //Case 3: 2 Child Nodes
                else{
                    TreeNode pred =  iopred(root);
                    TreeNode predParent = iopredParent(root,pred);
                    if(predParent==root){
                        pred.right = root.right;
                        return pred;
                    }
                    predParent.right = pred.left;
                    pred.left = root.left;
                    pred.right = root.right;
                    return pred;
                    }
                }
                else if(root.val>key){// LST will Change
                    root.left = deleteNode(root.left,key);
                }
                else{// root.val<key : RST will change
                    root.right = deleteNode(root.right,key);
                }
                return root;
        }
    }
*/

//By Using Inorder Successor
/*
class Solution {
    public TreeNode suc(TreeNode root){
        TreeNode suc = root.right;
        while(suc.left!=null) suc = suc.left;
        return suc;
    }
    public TreeNode ParentSuc(TreeNode root,TreeNode suc){
        if(root.left==suc || root.right==suc) return root;
        TreeNode ParentSuc = root.right;
        while(ParentSuc.left!=suc) ParentSuc = ParentSuc.left;
        return ParentSuc;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key){
            root.left = deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else if(root.val==key){
            if(root.left==null && root.right==null) return null;
            else if(root.left==null || root.right==null){
                if(root.left==null) return root.right;
                else return root.left;
            }
            else if(root.left!=null && root.right!=null){
                TreeNode suc = suc(root);
                TreeNode ParentSuc = ParentSuc(root,suc);
                if(ParentSuc==root){
                    suc.left = root.left;
                    return suc;
                }
                ParentSuc.left = suc.right;
                suc.left = root.left;
                suc.right = root.right;
                return suc;
            }
        }
        return root;
    }
}

*/

}
