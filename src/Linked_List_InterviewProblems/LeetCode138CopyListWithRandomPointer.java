package Linked_List_InterviewProblems;
/*
LEETCODE 138. Copy List with Random Pointer
A linked list of length n is given such that each node contains an additional random pointer, which could point to any
node in the list, or null.
Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has
its value set to the value of its corresponding original
node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the
pointers in the original list and copied list represent the same
list state. None of the pointers in the new list should point to nodes in the original list.
For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two
nodes x and y in the copied list, x.random --> y.
Return the head of the copied linked list.
The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of
[val, random_index] where:
val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not
point to any node.
Your code will only be given the head of the original linked list.
Example 1:
Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:
Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:
Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
Constraints: 0 <= n <= 1000
-104 <= Node.val <= 104
Node.random is null or is pointing to some node in the linked list.
*/
public class LeetCode138CopyListWithRandomPointer {
/*
/*
//SOLUTION
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        // 7 13 11 10 1
        // n  7  1 11 7
        Node head2 = new Node(0);
        Node temp1 = head;
        Node temp2 = head2;
        //Step1  Creating Deep copy - 7 13 11 10 1
        while(temp1!=null){
            Node New = new Node(temp1.val);
            temp2.next = New;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp1 = head;
        temp2 = head2;
        //Step2  Alternate Connections
        Node head3 = new Node(-1);
        Node temp3 =head3;
        while(temp1 !=null){
            temp3.next = temp1;
            temp1 = temp1.next;
            temp3 =temp3.next;

            temp3.next = temp2;
            temp2 =temp2.next;
            temp3 =temp3.next;
        }
        temp1 =head;
        temp2 =head2;
        //Step3 Assigning Random Pointers In Deep Copied Linked List
        while(temp1 != null && temp2 !=null){
            if(temp1.random==null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;//temp1 = temp1.next.next;
            if(temp1 != null)
                temp2 = temp1.next;//temp2 = temp2.next.next;
        }
        temp1 =head;
        temp2 =head2;
        //Step4 Separating the Connections (Lists)
        while(temp1 != null){
            temp1.next = temp2.next;
            temp1 =temp1.next;
            if(temp1==null) break;
            temp2.next = temp1.next;
            if(temp2.next==null) break;
            temp2 =temp2.next;
        }
        return head2;
    }
}
*/
}
