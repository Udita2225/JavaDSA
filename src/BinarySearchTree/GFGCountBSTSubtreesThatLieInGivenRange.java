package BinarySearchTree;
//Count BST subtrees that lie in given range

public class GFGCountBSTSubtreesThatLieInGivenRange {
    /*
    Given a Binary Search Tree (BST) and a range [low, high], the task is to count the number of nodes where all the
    nodes under that node (or subtree rooted with that node) lie in the given range.
    Examples:
    Input : low = 8, high = 10
    Remove-all-leaf-nodes-from-the-binary-search-tree-1
    Output:  1
    Explanation: There is only 1 node with the value 10 whose subtree is in the given range.
    Input: low = 12, high = 20
    Remove-all-leaf-nodes-from-the-binary-search-tree-1
    Output:  3
    Explanation: There are three nodes whose subtree is in the given range. The nodes are 12, 10 and 14
    Approach:
    The idea is to traverse the given Binary Search Tree (BST) in a bottom-up manner. For every node, make recursive
    calls for its subtrees, if subtrees are in range and the nodes are also in range, then increment the count and return true.
    Below is the implementation of the above approach:
    // Java program to count BST subtrees
// that lie in given range
    class Node {
        int data;
        Node left, right;
        Node(int x) {
            data = x;
            left = null;
            right = null;
        }
    }
    class GfG {

        // Recursive function to count
        // subtrees that lie in a range
        static boolean subtreeCntRecur(Node root, int low,
                                       int high, int[] ans) {
            if (root == null) return true;

            // Check for left and right subtree.
            boolean left = subtreeCntRecur(root.left, low, high, ans);
            boolean right = subtreeCntRecur(root.right, low, high, ans);

            // If current subtree lies within range, then increment
            // ans count and return true.
            if (root.data >= low && root.data <= high && left && right) {
                ans[0]++;
                return true;
            }

            // Else return false as this subtree
            // is out of range.
            return false;
        }

        // Function to count subtrees that
        // lie in a given range
        static int subtreeCnt(Node root, int low, int high) {
            int[] ans = {0};
            subtreeCntRecur(root, low, high, ans);
            return ans[0];
        }

        public static void main(String[] args) {

            // Binary tree
            //         10
            //       /    \
            //     5       50
            //   /       /  \
            //  1       40   100
            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(50);
            root.left.left = new Node(1);
            root.right.left = new Node(40);
            root.right.right = new Node(100);
            int low = 1, high = 45;

            System.out.println(subtreeCnt(root, low, high));
        }
    }

    Output
    3
    Time Complexity: O(n), where n is the number of nodes in the tree.
    Auxiliary Space: O(h), where h is the height of the tree.
}
*/}