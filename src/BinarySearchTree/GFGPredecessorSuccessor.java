package BinarySearchTree;
/*
Predecessor and Successor
You are given root node of the BST and an integer key. You need to find the in-order successor and predecessor of the given key.
If either predecessor or successor is not found, then set it to NULL.
Note:- In an inorder traversal the number just smaller than the target is the predecessor and the number just greater
than the target is the successor.
Examples :
Input: root[] = [8, 1, 9, N, 4, N, 10, 3, N, N, N]
      8
    /   \
   1     9
   \      \
    4      10
   /
  3
key = 8
Output: 4 9
Explanation: In the given BST the inorder predecessor of 8 is 4 and inorder successor of 8 is 9.
Input: root[] = [10, 2, 11, 1, 5, N, N, N, N, 3, 6, N, 4, N, N]
      10
    /   \
   2     11
  / \
 1   5
    / \
   3   6
    \
     4
key = 11
Output: 10 -1
Explanation: In given BST, the inorder predecessor of 11 is 10 whereas it does not have any inorder successor.
Input: root[] = [2, 1, 3]
      2
    /   \
   1     3
key = 3
Output: 2 -1
Constraints:
1 <= Number of nodes <= 105
1 <= key <= 106
*/
public class GFGPredecessorSuccessor {
/*
class Solution {
    public static void Inorder(Node root,ArrayList<Node> arr){
        if(root==null) return;
        Inorder(root.left,arr);
        arr.add(root);
        Inorder(root.right,arr);
    }
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        if(root==null ){
            pre[0]=null;
            suc[0]=null;
            return;
        }
        ArrayList<Node> arr = new ArrayList<>();
        Inorder(root,arr);
        int i=0;
        while(i<arr.size() && arr.get(i).data<key) i++;
        if(i<arr.size() && arr.get(i).data==key){//Ensure Key Exists
        if(i>0) pre[0]=arr.get(i-1);
        else pre[0]=null;
        if(i<arr.size()-1) suc[0]=arr.get(i+1);
        else suc[0]=null;
        }
        else{//Key Not Found,Determine closest pre and suc
            if(i>0) pre[0]=arr.get(i-1);
            else pre[0]=null;
            if(i<arr.size()) suc[0] = arr.get(i);
            else suc[0]=null;
        }
    }
}
//Modern Code Using Ternary Operator
class Solution {
    public static void Inorder(Node root,ArrayList<Node> arr){
        if(root==null) return;
        Inorder(root.left,arr);
        arr.add(root);
        Inorder(root.right,arr);
    }
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        if(root==null){
            pre[0]=null;
            suc[0]=null;
            return;
        }
        ArrayList<Node> arr = new ArrayList<>();
        Inorder(root,arr);
        int i=0;
        while(i<arr.size() && arr.get(i).data<key) i++;
        if(i<arr.size() && arr.get(i).data==key){
            pre[0] = (i>0)?arr.get(i-1):null;
            suc[0] = (i<arr.size()-1)?arr.get(i+1):null;
        }
        else{
            pre[0] = (i>0)?arr.get(i-1):null;
            suc[0] = (i<arr.size())?arr.get(i):null;
        }

    }
}
*/

//Without Using ArrayList
/*
class Solution {
    static Node prev=null, next=null;
    public static void Inorder(Node root,int key){
        if(root==null) return;
        Inorder(root.left,key);
        if(root.data<key) prev=root;
        else if(next==null && root.data>key) {
            next =root;
        }
        Inorder(root.right,key);
    }
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        prev = null;
        next = null;
        Inorder(root,key);
        pre[0] = prev;
        suc[0] = next;
    }
}

*/
}
