package Stacks;

import java.util.Stack;

public class ReverseAStackIteratively {
    public static void Reverse(Stack<Integer> st){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        Stack<Integer> kt =new Stack<>();
        while(rt.size()>0){
            kt.push(rt.pop());
        }
        while(kt.size()>0){
            st.push(kt.pop());
        }
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
