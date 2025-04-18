package DoublyLinkedList;
import java.util.*;
public class ImplementationOfDoublyLL {
    public static class Node {
        Node prev;
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class DoublyLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.prev = tail;
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                head.prev = temp;
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAtIndex(int val, int idx) {
            Node temp = new Node(val);
            Node temp1 = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Invalid Index");
                return;
            } else {
                for (int i = 0; i < idx - 1; i++) {
                    temp1 = temp1.next;
                }
                temp.prev = temp1;
                temp.next = temp1.next;
                temp1.next.prev = temp;
                temp1.next = temp;
            }
            size++;
        }
        int get(int idx) {
            if (idx == size - 1) return tail.val;
            if (idx < 0 || idx > size) {
//              System.out.println("Wrong Index");
//              return -1;
                throw new Error("Invalid Index");
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.val;
        }
        void setAt(int val, int idx) {
            Node temp = head;
            if (idx == size - 1) tail.val = val;
            if (idx < 0 || idx >= size) {
                throw new Error("Invalid Index");
            }
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            temp.val = val;
        }
        void deleteAt(int idx) {
            Node temp =head;
            if (idx < 0 || idx >= size) {
                throw new Error("Invalid Index");
            }
            if(idx==0) {
                head =head.next;
                size--;
                return;
            }
            for(int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            if(idx==size-1){
                tail=temp;
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp.next.next.prev = temp;
            temp.next = temp.next.next;
            size--;
        }
        int size(){
            Node temp =head;
            int count =0;
            while(temp!=null){
                temp = temp.next;
                count++;
            }
            return count;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayrev() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(3);
        dll.insertAtEnd(14);
        dll.insertAtEnd(18);
        dll.display();
        dll.displayrev();
        dll.insertAtHead(15);
        dll.display();
        dll.displayrev();
        dll.insertAtIndex(54, 2);
        dll.display();
        System.out.println(dll.size);
        dll.displayrev();
        System.out.println(dll.get(3));
        // dll.deleteAt(4);
        dll.display();
        dll.deleteAt(3);
        System.out.println(dll.size);
        dll.displayrev();
        dll.display();
        dll.deleteAt(3);
        dll.display();
        dll.setAt(49,2);
        System.out.println(dll.size());
        dll.displayrev();
        dll.display();
    }
}