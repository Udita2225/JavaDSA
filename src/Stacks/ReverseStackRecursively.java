package Stacks;

import java.util.Stack;

public class ReverseStackRecursively {
    public static void insertAtBase(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        insertAtBase(st,ele);
        st.push(top);
    }
    public static void Reverse(Stack<Integer> st){
        if(st.size()==1){
           return;
        }
        int top = st.pop();
        Reverse(st);
        insertAtBase(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
}
