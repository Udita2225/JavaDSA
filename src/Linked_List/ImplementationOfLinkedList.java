package Linked_List;
public class ImplementationOfLinkedList {
    public static class Node{//Data Type
        int data;
        Node next;
        Node(int data){ //Constructor
            this.data =data;
        }
    }
    public static class linkedList{//Yaha par linkedList ko ek Data Structure ki tarah maana gaya hai
        Node head =null; //Node khud me hi ek class hai
        Node tail =null;
        int size =0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp; //tail ab temp ko point kar raha hai
            }
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){//Empty List
                head =temp;//head=tail=temp;
                tail =temp;
                //insertAtEnd(val); This is also right
            }
            else{
                temp.next = head;
                head =temp;
            }
            size++;
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("Wrong index");
                return;
            }
            for(int i=1; i<=idx-1;i++){//temp already head par hai isliye humne 1 se shuru kiya hai
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx) throws Error{
          if(idx == size()-1) return tail.data;
          if(idx<0 || idx>size()){
//              System.out.println("Wrong Index");
//              return -1;
                throw new Error("Invalid Index");
          }
          Node temp =head;
          for(int i =1; i<=idx; i++){
              temp = temp.next;
          }
          return temp.data;
        }
        void deleteAt(int idx){
           if(idx==0){
               head =head.next;
               size--;
               return;
           }
           Node temp =head;
           for(int i=1; i<=idx-1; i++){
               temp = temp.next;
           }
           if(idx == size-1){
                tail=temp;}

           temp.next = temp.next.next;
           //tail =temp; This is wrong
           size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){//O(n)
         Node temp = head;
         int count=0;
         while(temp!=null){
             temp = temp.next;
             count ++;
         }
         return count;
        }
        void set(int idx, int val)throws Error{
            Node temp =head;
            if(idx==size()-1){
                tail.data=val;
            }
            if(idx<0 || idx>=size()){
                throw new Error("Invalid Index");
            }
            for(int i =1; i<= idx-1; i++){
                temp = temp.next;
            }
            temp.data= val;

        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);//4
        ll.display();
        ll.insertAtEnd(5);//4 -> 5
        ll.display();
        ll.insertAtEnd(8);//4 -> 5 -> 8
        ll.display();
        ll.insertAtHead(9);//9 -> 4 -> 5 -> 8
        ll.display();
        System.out.println(ll.size());//4
        ll.insertAt(2,10);//9->4->10->5->8
        ll.display();
        ll.insertAt(0,5);//5 9 4 10 5 8
        ll.display();
        System.out.println(ll.size());
        ll.insertAt(6,100);//5 9 4 10 5 8 100
        ll.display();
        System.out.println(ll.tail.data);//100
        // ll.insertAt(7,66);//Null Pointer Exception
        System.out.println(ll.head.data);//5
        ll.insertAt(-1,77);//Wrong Index
        System.out.println(ll.getAt(3));//10
        System.out.println(ll.getAt(0));//5
        System.out.println(ll.size); //O(1)           //Ye ek attribute hai
        System.out.println(ll.size()); //O(n)         //Ye ek method hai
        ll.display();//5 9 4 10 5 8 100
        ll.deleteAt(4);//5 9 4 10  8 100
        ll.display();//5 9 4 10 8 100
        ll.deleteAt(5);
        ll.display();//5 9 4 10 8
        System.out.println(ll.tail.data);
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.getAt(0));
        ll.set(1,33);
        ll.display();
    }
}
