package BinaryTrees;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class PrintElementsOfnthLevel {
    public static void ByPreOrder(Node root, int level, int k){
        if(root==null) return;
        if(level==k){
            System.out.print(root.val+ " ");
        }
        ByPreOrder(root.left,level+1,k);
        ByPreOrder(root.right, level+1,k);
    }
    public static void ByUsingBFS(Node root,int k){
        if(root==null){
            System.out.println("Tree is Empty!");
            return;
        }
        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()) {
            int size = q.size();
            if (level == k) {
                for (int i = 0; i < size; i++) {
                    System.out.print(q.remove().val + " ");
                }
                System.out.println();
                return;
            }
             for(int i=0; i<size; i++){
                Node front = q.remove();
                if (front.left != null) q.add(front.left);
                if (front.right != null) q.add(front.right);
            }
            level++;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(7);
        Node c =new Node(9);
        Node d =new Node(2);
        Node e =new Node(6);
        Node f =new Node(9);
        Node g =new Node(5);
        Node h =new Node(11);
        Node i =new Node(5);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        e.left=g; e.right=h;
        f.left=i;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ByPreOrder(a,0,k);//5 11 5
        System.out.println();
        ByUsingBFS(a,k);
    }
}
