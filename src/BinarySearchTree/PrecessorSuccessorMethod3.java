package BinarySearchTree;
//When the inorder predecessor and successor lies on the below levels
public class PrecessorSuccessorMethod3 {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void PreSuc(Node root,Node[] pre, Node[] suc,int key){
        if(root==null) return;
        if(root.val==key){
            if(root.left!=null){
                Node p = root.left;
                while(p.right!=null) p=p.right;
                pre[0]=p;
            }
            if(root.right!=null){
                Node q = root.right;
                while(q.left!=null) q=q.left;
                suc[0] = q;
            }
            return;
        }
        if(key<root.val){
            suc[0] = root;
            PreSuc(root.left,pre,suc,key);
        }
        else{
            pre[0]=root;
            PreSuc(root.right,pre,suc,key);
        }
    }
    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(2);
        Node c = new Node(10);
        Node d = new Node(1);
        Node e = new Node(3);
        Node f = new Node(9);
        Node g = new Node(11);
        Node h = new Node(5);
        Node i = new Node(7);
        Node j = new Node(4);
        Node k = new Node(8);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        f.left=i; e.right=h;
        h.left=j; i.right=k;
        Node[] pre = new Node[1];
        Node[] suc = new Node[1];
        PreSuc(a,pre,suc,10);
        System.out.println("Predecessor "+(pre[0]!=null ? pre[0].val : "None"));
        System.out.println("Successor " + (suc[0]!=null ? suc[0].val : "None"));
    }
}
