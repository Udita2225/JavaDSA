package Stacks;

import java.util.Stack;

public class PushElementAtBottomRecursively {
    public static void push(int x, Stack<Integer> st){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top =st.pop();
        push(x,st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        push(8, st);
        System.out.print(st);
    }
}
