package BinarySearchTree;
import java.util.*;
//Count BST subtrees that lie in given range
/*
Given a Binary Search Tree (BST) of integer values and a range [low, high], return count of nodes where all the nodes
under that node (or subtree rooted with that node) lie in the given range.
Input format
The first line contains a number n showing the length of the inorder array of BST The next n line contains an integer
denoting the elements of the array
The next line contains two integers denoting the value of low and high
Output format
Single integer showing the count
Example 1
Input
6
10 20 33 45 55 67
1 66
Output
3
Constraints
2 ≤ N ≤ 10^3
*/
public class CodingBlocksCountBSTSubtreesThatLieInGivenRange {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
        public static Node buildBSTFromSortedArray(int[] arr, int start, int end) {
            if (start > end) return null;

            int mid = (start + end) / 2;
            Node root = new Node(arr[mid]);
            root.left = buildBSTFromSortedArray(arr, start, mid - 1);
            root.right = buildBSTFromSortedArray(arr, mid + 1, end);
            return root;
        }

        static int count = 0;

        static boolean isSubtreeInRange(Node root, int low, int high) {
            if (root == null) return true;

            boolean left = isSubtreeInRange(root.left, low, high);
            boolean right = isSubtreeInRange(root.right, low, high);

            if (left && right && root.data >= low && root.data <= high) {
                count++;
                return true;
            }

            return false;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] inorder = new int[n];
            for (int i = 0; i < n; i++) {
                inorder[i] = sc.nextInt();
            }

            int low = sc.nextInt();
            int high = sc.nextInt();

            Node root = buildBSTFromSortedArray(inorder, 0, n - 1);
            count = 0;
            isSubtreeInRange(root, low, high);
            System.out.println(count);
        }
    }



