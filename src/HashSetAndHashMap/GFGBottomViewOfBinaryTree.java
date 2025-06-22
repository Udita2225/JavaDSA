package HashSetAndHashMap;
//Bottom View of Binary Tree
public class GFGBottomViewOfBinaryTree {
/*
Given a binary tree, return an array where elements represent the bottom view of the binary tree from left to right.
Note: If there are multiple bottom-most nodes for a horizontal distance from the root, then the later one in the level
order traversal is considered. For example, in the below diagram, 7 and 34 both are the bottommost nodes at a
horizontal distance of 0 from the root, here 34 will be considered.
For the above tree, the output should be 5 8 34 22 25
Examples :
Input: root[] = [1, 3, 2]
Output: [3 1 2]
Explanation: First case represents a tree with 3 nodes and 2 edges where root is 1, left child of 1 is 3 and right
child of 1 is 2.
Thus bottom view of the binary tree will be 3 1 2.
Input: root[] = [10, 20, 30, 40, 60]
Output: [40 20 60 30]
Constraints:
1 <= number of nodes <= 105
1 <= node->data <= 105
*/

/*
/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}


    class Solution {
        public static class Pair{
            Node node;
            int level;
            Pair(Node node, int level){
                this.node = node;
                this.level =level;
            }
        }
        public ArrayList<Integer> bottomView(Node root) {
            // Code here
            ArrayList<Integer> ans = new ArrayList<>();
            Queue<Pair> q = new LinkedList<>();
            HashMap<Integer, Integer>  map = new HashMap<>();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            if(root!=null) q.add(new Pair(root,0));
            while(q.size()>0){
                Pair front = q.remove();
                Node temp = front.node;
                int level = front.level;
                min = Math.min(min,level);
                max = Math.max(max,level);
                map.put(level,temp.data);
                if(temp.left!=null) q.add(new Pair(temp.left,level-1));
                if(temp.right!=null) q.add(new Pair(temp.right, level+1));
            }
            for(int i=min; i<=max; i++){
                ans.add(map.get(i));
            }
            return ans;
        }
    }
*/
}
