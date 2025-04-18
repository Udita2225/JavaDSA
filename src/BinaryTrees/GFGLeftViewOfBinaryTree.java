package BinaryTrees;
/*
Left View of Binary Tree
You are given the root of a binary tree. Your task is to return the left view of the binary tree.
The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.
If the tree is empty, return an empty list.
Examples :
Input: root[] = [1, 2, 3, 4, 5, N, N]
Output: [1, 2, 4]
Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.
Input: root[] = [1, 2, 3, N, N, 4, N, N, 5, N, N]
Output: [1, 2, 4, 5]
Explanation: From the left side of the tree, the nodes 1, 2, 4, and 5 are visible.
Input: root[] = [N]
Output: []
Constraints:
0 <= number of nodes <= 106
0 <= node -> data <= 105
*/
public class GFGLeftViewOfBinaryTree {
/*
class Solution {
    // Function to return list containing elements of left view of binary tree.
    public int levels(Node root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
    public void dfs(Node root, int level, ArrayList<Integer> ans){
        if(root==null) return;
        dfs(root.right,level+1,ans);
        dfs(root.left,level+1,ans);
        ans.set(level,root.data);
    }
    ArrayList<Integer> leftView(Node root) {
        // code here
        int n = levels(root);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(0);
        }
        dfs(root,0,ans);
        return ans;
    }
}
//Solution 2
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size =q.size();
            Node firstNode =null;
            for(int i=0; i<size; i++){
            Node temp = q.remove();
            firstNode =temp;
            if(temp.right!=null) q.add(temp.right);
            if(temp.left!=null) q.add(temp.left);
            }
            ans.add(firstNode.data);
        }
        return ans;
    }
}

Solution 3
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size =q.size();
            Stack<Integer> st = new Stack<>();
            for(int i=0; i<size; i++){
            Node temp = q.remove();
            st.push(temp.data);
            if(temp.right!=null) q.add(temp.right);
            if(temp.left!=null) q.add(temp.left);
            }
            ans.add(st.pop());
        }
        return ans;
    }
}
*/
}
