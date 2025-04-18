package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderIterative {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val =val;
        }
    }
    public static List<Integer> PostOrderIterative(Node root){
    Stack<Node> st = new Stack<>();
    List<Integer> arr = new ArrayList<>();
    if(root!=null) st.push(root);
    while(st.size()>0){
        Node top = st.pop();
        arr.add(top.val);
        if(top.left!=null) st.push(top.left);
        if(top.right!=null) st.push(top.right);
    }
    Collections.reverse(arr);
    return arr;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left =b; a.right =c;
        b.left =d; b.right =e;
        c.left =f; c.right =g;
        List<Integer> ans  = PostOrderIterative(a);//4 5 2 6 7 3 1
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }
    }
}
