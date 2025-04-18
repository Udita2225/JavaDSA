package BinarySearchTree;
//Min distance between two given nodes of a Binary Tree
/*
Given a binary tree with n nodes and two node values, a and b, your task is to find the minimum distance between them.
The given two nodes are guaranteed to be in the binary tree and all node values are unique.
Examples :
Input: Tree = [1, 2, 3]
        1
      /  \
     2    3
a = 2, b = 3
Output: 2
Explanation: We need the distance between 2 and 3. Being at node 2, we need to take two steps ahead in order to reach
node 3. The path followed will be: 2 -> 1 -> 3. Hence, the result is 2.
Input: Tree = [11, 22, 33, 44, 55, 66, 77]
        11
      /   \
     22  33
    /  \  /  \
  44 55 66 77
a = 77, b = 22
Output: 3
Explanation: We need the distance between 77 and 22. Being at node 77, we need to take three steps ahead in order to
reach node 22. The path followed will be: 77 -> 33 -> 11 -> 22. Hence, the result is 3.
Input: Tree = [1, 2, 3]
        1
      /  \
     2    3
a = 1, b = 3
Output: 1
Constraints:
2 <= number of nodes <= 105
*/
public class GFGMinDistanceBetweenTwoNodesOfBinaryTree {
/*
class GfG {
    boolean exists(Node root, int node){
        if(root==null) return false;
        if(root.data==node) return true;
        return exists(root.left,node) || exists(root.right,node);
    }
    Node LowestCommonAncestor(Node root,int a , int b){
        if(root.data==a || root.data==b) return root;
        boolean aLiesInLST = exists(root.left,a);
        boolean bLiesInLST = exists(root.left,b);
        if(aLiesInLST==true && bLiesInLST==true) return LowestCommonAncestor(root.left,a,b);
        if(aLiesInLST==false && bLiesInLST==false) return LowestCommonAncestor(root.right,a,b);
        else return root;
    }
    int findLevel(Node root,int target, int level){
        if(root==null) return -1;
        if(root.data==target) return level;
        int nextLevel = findLevel(root.left,target,level+1);
        if(nextLevel!= -1) return nextLevel;
        return findLevel(root.right,target,level+1);
    }
    int findDist(Node root, int a, int b) {
        // Your code here
    Node LCA = LowestCommonAncestor(root,a,b);
    int d1 = findLevel(LCA,a,0);
    int d2 = findLevel(LCA,b,0);
    return d1+d2;
    }
}
*/
}
