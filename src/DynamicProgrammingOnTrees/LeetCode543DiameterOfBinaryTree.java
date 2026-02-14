package DynamicProgrammingOnTrees;

/*
543. Diameter of Binary Tree

Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

Example 1:

Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1

Constraints:

The number of nodes in the tree is in the range [1, 104].
-100 <= Node.val <= 100

*/
public class LeetCode543DiameterOfBinaryTree {
    /*
    Using Recursion +  Memoization
    // Using Recursion and Memoization
class Solution {
    public int levels(TreeNode root, HashMap<TreeNode, Integer> dp){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int LeftLevel = levels(root.left,dp);
        int RightLevel = levels(root.right,dp);
        int level =  1 + Math.max(LeftLevel, RightLevel);
        dp.put(root,level);
        return level;
    }
    public int Diameter(TreeNode root, HashMap<TreeNode,Integer> dp){
        if(root==null) return 0;
        int Left = levels(root.left,dp);
        int Right  =  levels(root.right,dp);
        int myDia =  Left + Right;
        int LeftDia = Diameter(root.left,dp);
        int RightDia =  Diameter(root.right,dp);
        return Math.max(myDia, Math.max(LeftDia, RightDia));
    }
    public int diameterOfBinaryTree(TreeNode root) {
    HashMap<TreeNode, Integer> dp = new HashMap<>();
    return Diameter(root,dp);
    }
}
    */



    /*
    /* Using A Custom Class
class Solution {
    public class Int{
        int val;
        public Int(int val){
            this.val = val;
        }
    }
    public int levels(TreeNode root, Int maxDia){
        if(root==null) return 0;
        int LeftLevel = levels(root.left,maxDia);
        int RightLevel =  levels(root.right,maxDia);
        int myDia = LeftLevel + RightLevel;
        maxDia.val = Math.max(maxDia.val,myDia);
        return 1 + Math.max(LeftLevel, RightLevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Int maxDia = new Int(0);
        levels(root,maxDia);
        return maxDia.val;
    }
}
/* Using Array -> Best Method
class Solution {
    public int levels(TreeNode root, int[] maxDia){
        if(root==null) return 0;
        int LeftLevel =  levels(root.left,maxDia);
        int RightLevel =  levels(root.right,maxDia);
        int myDia = LeftLevel + RightLevel;
        maxDia[0] =  Math.max(maxDia[0],myDia);
        return 1 +  Math.max(LeftLevel, RightLevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
    int[] maxDia = {0};
    levels(root,maxDia);
    return maxDia[0];
    }
}
/* Instead of Global Variable we can use Array or A custom class as well
class Solution {
    int maxDia;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int LeftLevel = levels(root.left);
        int RightLevel = levels(root.right);
        int myDia = LeftLevel + RightLevel;
        maxDia =  Math.max(maxDia, myDia);
        return 1 +  Math.max(LeftLevel, RightLevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
    maxDia = 0;
    levels(root);
    return maxDia;
    }
}
/*
// We can merge these recursive codes into  a single one.
class Solution {
    public int Depth(TreeNode root){
        if(root==null) return 0;
        int Left = Depth(root.left);
        int Right =  Depth(root.right);
        return 1 + Math.max(Left, Right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
    if(root==null) return 0;
    int LeftDepth = Depth(root.left);
    int RightDepth = Depth(root.right);
    int myDiameter = LeftDepth + RightDepth;
    int LeftDiameter = diameterOfBinaryTree(root.left);
    int RightDiameter =  diameterOfBinaryTree(root.right);
    return Math.max(myDiameter, Math.max(LeftDiameter, RightDiameter));
    }
}
*/
}
