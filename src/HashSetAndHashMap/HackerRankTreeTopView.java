package HashSetAndHashMap;
//Tree : Top View
public class HackerRankTreeTopView {
/*
Given a pointer to the root of a binary tree, print the top view of the binary tree.
The tree as seen from the top the nodes, is called the top view of the tree.
For example :

   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
Top View : 1->2->5->6
Complete the function  and print the resulting values on a single line separated by space.
Input Format
You are given a function,
void topView(node * root) {
}
Constraints
1<= Nodes in the tree <=500
Output Format
Print the values on a single line separated by space.
Sample Input
   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
Sample Output
1 2 5 6
Explanation
   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
From the top, only nodes 1,2,5,6  are visible.
*/
/*
import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/*

    class Node
    	int data;
    	Node left;
    	Node right;

public static class Pair{
    Node  node;
    int level;
    Pair(Node node, int level){
        this.node=node;
        this.level=level;
    }
}
    public static void topView(Node root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(q.size()>0){
            Pair front = q.remove();
            Node temp = front.node;
            int level = front.level;
            min = Math.min(min,level);
            max = Math.max(max,level);
            if(!map.containsKey(level)){
                map.put(level, temp.data);
            }
            if(temp.left!=null) q.add(new Pair(temp.left, level-1));
            if(temp.right!=null) q.add(new Pair(temp.right,level+1));
        }
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i) + " ");
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}
*/
}
