package Heaps2;
//Is Binary Tree Heap
/*
You are given a binary tree, and the task is to determine whether it satisfies the properties of a max-heap.
A binary tree is considered a max-heap if it satisfies the following conditions:
Completeness: Every level of the tree, except possibly the last, is completely filled, and all nodes are as far
left as possible.
Max-Heap Property: The value of each node is greater than or equal to the values of its children.
Examples:
Input: root[] = [97, 46, 37, 12, 3, 7, 31, 6, 9]
Output: true
Explanation: The tree is complete and satisfies the max-heap property.
Input: root[] = [97, 46, 37, 12, 3, 7, 31, N, 2, 4]
Output: false
Explanation: The tree is not complete and does not follow the Max-Heap Property, hence it is not a max-heap.
Constraints:
1 ≤ number of nodes ≤ 103
1 ≤ node->data ≤ 103
Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(n)
Company Tags
Hike
*/
public class GFGIsBinaryTreeHeap {
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


    class Solution {
        public static int size(Node root){
            if(root==null) return 0;
            return 1+ size(root.left) + size(root.right);
        }
        public static boolean HeapOrderProperty(Node root){
            if(root==null) return true;
            if(root.left!=null && root.left.data>root.data) return false;
            if(root.right!=null && root.right.data>root.data) return false;
            return HeapOrderProperty(root.left) && HeapOrderProperty(root.right);
        }
        public static boolean CompleteBT(Node root,int idx, int size){
            if(root==null) return true;
            if(idx>=size) return false;
            return CompleteBT(root.left, 2*idx+1,size) && CompleteBT(root.right, 2*idx+2, size);
        }
        boolean isHeap(Node tree) {
            // code here
            int size = size(tree);
            return CompleteBT(tree,0,size) && HeapOrderProperty(tree);
        }
    }
    */
}
