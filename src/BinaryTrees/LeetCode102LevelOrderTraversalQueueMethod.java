package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;
public class LeetCode102LevelOrderTraversalQueueMethod {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val =val;
        }
    }
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node=node;
            this.level=level;
        }
    }
    public static void levelOrder(Node root){
        int prevLevel =0;
        Queue<Pair> q = new LinkedList<>();
//        Pair p = new Pair(root,0);
//        if(root!=null) q.add(p);
        if(root!=null) q.add(new Pair(root,0));
        while(q.size() > 0) {
            Pair front =q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl!=prevLevel){
                System.out.println();
                prevLevel++;
            }
            System.out.print(temp.val+ " ");
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        g.left=h;
        levelOrder(a);
    }
}
