package Queues;
public class ArrayImplementationOfDeque {
    public static class DequeAI {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100];
        int n = arr.length;

        public void add(int val) {
            if (size == n) {
                System.out.println("Queue is Full!");
                return;
            }
            else if (size == 0) {
                front = 0;
                rear = 0;
                arr[0] = val;
            }
            else {
                arr[++rear] = val;
            }
            size++;
        }

        public void addFirst(int val) {
            if (size == n) {
                System.out.println("Queue is Full!");
                return;
            } else if (size == 0) {
                front = 0;
                rear = 0;
                arr[0] = val;
            } else {
                for (int i = size; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                rear =size;
                front=0;
                arr[0] = val;
            }
            size++;
        }

        public void addLast(int val) {
            if (size == n) {
                System.out.println("Queue is Full!");
                return;
            } else if (size == 0) {
                front = 0;
                rear = 0;
                arr[0] = val;
            } else {
                arr[++rear] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty !");
            } else {
                int val = arr[front];
                front++;
                size--;
                return val;
            }
        }

        public int removeFirst() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty !");
            } else {
                int val = arr[front];
                front++;
                size--;
                return val;
            }
        }

        public int removeLast() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty !");
            }
            else{
                 int val = arr[rear];
                 size--;
                 rear--;
                 return val;
            }
        }
        public int[] removeAll(){
            if(size ==0){
                System.out.println("Queue is Already Empty");
                return arr;
            }
            else{
                for(int i=front; i<=rear; i++){
                    arr[i]=0;
                }
                front=rear =-1;
                size=0;
                return arr;
            }
        }
        public int[] removeFirstOccurence(int val){
            boolean flag =false;
            if(size==0){
                System.out.println("Queue is Empty!");
                return arr;
            }
            else{
                for(int i=front; i<=rear; i++) {
                    if (arr[i] == val) {
                        int j = i;
                        while (j < rear) {
                            arr[j] = arr[j + 1];
                            j++;
                        }
                        arr[rear] = 0;
                        size--;
                        rear--;
                        flag=true;
                    }
                    if(flag==true) break;
                }
                if(flag==false){
                    System.out.println("No Element Found");
                }
                return arr;
            }
        }
        public int[] removeLastOccurence(int val){
            boolean flag = false;
            if(size==0){
                System.out.println("Queue is Empty!");
                return arr;
            }
            else {
                for (int i = rear; i >= front; i--) {
                    if (arr[i] == val) {
                        int j = i;
                        while (j < rear) {
                            arr[j] = arr[j + 1];
                            j++;
                        }
                        arr[rear] = 0;
                        size--;
                        rear--;
                        flag = true;
                        break;
                    }
                }
                if(flag==false) System.out.println("Element Not Found");
                return arr;
            }
        }
        public int getFirst(){
            if(size==0){
                System.out.println("Queue is Empty !");
                return -1;
            }
            else{
                return arr[front];
            }
        }
        public int getLast(){
            if(size==0){
                System.out.println("Queue is Empty !");
                return -1;
            }
            else{
                return arr[rear];
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            else{
                for(int i=front; i<=rear; i++){
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }

    public static void main(String[] args) throws Exception{
        DequeAI dq = new DequeAI();
        dq.add(1);
        dq.add(10);
        dq.add(78);
        dq.display();
        dq.addFirst(2);
        dq.display();
        dq.addLast(5);
        dq.display();
        System.out.println(dq.size);
        System.out.println(dq.isEmpty());//false
        dq.remove();
        dq.display();//1 10 78 5
        dq.removeFirst();
        dq.display();//10 78 5
        dq.removeLast();
        dq.display();//10 78
        dq.add(88);
        dq.add(10);
        dq.add(66);
        dq.display();//10 78 88 10 66
        dq.removeFirstOccurence(10);
        dq.display();//78 88 10 66
        dq.removeLastOccurence(10);
        dq.display();//78 88 66
        System.out.println(dq.getFirst());//78
        System.out.println(dq.getLast());//66
        dq.removeAll();
        System.out.println(dq.size);
        dq.display();
    }
}
