package BinaryTrees;
//Complete Binary Tree
public class GFGCompleteBinaryTree {
/*
Given a Binary Tree, check whether the given Binary Tree is Complete Binary Tree or not.
A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes should be as much close to left as possible.
Examples:
Input: root = [1, 2, 3]
Output: true
Explanation: The given tree is complete binary tree.
Input: root = [1, 2, 3, 4, N, 5, 6]
Output: false
Explanation: The given tree is not complete binary tree because in last level all nodes are not at left.
Constraints:
1<=number of node<=105
0 <= node -> data <= 106
Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(n)
*/
    /*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class GfG {
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static boolean isCBT(Node root, int idx, int size){
        if(root==null) return true;
        if(idx>=size) return false;
        return isCBT(root.left,2*idx+1,size) && isCBT(root.right,2*idx+2,size);
    }
    boolean isCompleteBT(Node root) {
        // add code here.
        int size =size(root);
        return isCBT(root,0,size);
    }
}
     */
}
