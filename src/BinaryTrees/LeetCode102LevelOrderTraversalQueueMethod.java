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
/*
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }

            result.add(level);
        }

        return result;
    }
}
*/
/*
class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+(Math.max(levels(root.left), levels(root.right)));
    }
    public void nthLevel(TreeNode root, int level, int lvl, List<Integer> arr){
        if(root==null) return;
        if(level>lvl) return;
        if(level==lvl) arr.add(root.val);
        nthLevel(root.left,level+1,lvl, arr);
        nthLevel(root.right,level+1,lvl,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i=0; i<lvl; i++){
            List<Integer> arr = new ArrayList<>();
            nthLevel(root,0,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}
*/
/*
class Solution {
    public class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node=node;
            this.level = level;
        }
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left), levels(root.right));
    }
    public void BFS(TreeNode root, List<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front =  q.poll();
            TreeNode temp = front.node;
            int level =  front.level;
            ans.get(level).add(temp.val);
            if(temp.left!=null) q.add(new Pair(temp.left, level+1));
            if(temp.right!=null) q.add(new Pair(temp.right, level+1));
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans =  new ArrayList<>();
    int lvl = levels(root);
    for(int i=0; i<lvl; i++){
        List<Integer> arr = new ArrayList<>();
        ans.add(arr);
    }
    BFS(root,ans);
    return ans;
    }
}
*/