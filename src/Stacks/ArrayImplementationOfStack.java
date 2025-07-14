package Stacks;
//In Java by default values in array is 0;
public class ArrayImplementationOfStack {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx =0; //Array Iterator which will iterate through the array and tells the size
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
        arr[idx] = x;
        idx++;
        }
        int peek(){
            if(idx == 0){//checkmark
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){//It returns the element as well as delete it from stack
           if(idx==0){
               System.out.println("Stack is empty");
               return -1;
           }
           int top =arr[idx-1];
           arr[idx-1] = 0;
           idx--;
           return top;
        }
        void display(){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();//1
        st.push(2);
        st.display();//1 2
        st.push(3);
        st.display();//1 2 3
        st.push(4);
        st.display();//1 2 3 4
        System.out.println(st.size());//4
        st.pop();
        st.display();//1 2 3
        System.out.println(st.peek());//3
        st.display();//1 2 3
        System.out.println(st.isFull());//false
        st.push(5);
        st.display();//1 2 3 5
        st.push(6);
        st.display();//1 2 3 5 6
        st.push(8);//Stack is full
        st.display();//1 2 3 5 6
        System.out.println(st.isFull());//true
    }
}
