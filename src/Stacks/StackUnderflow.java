package Stacks;

import java.util.Stack;
/*
If stack is empty - st.peek() or st.pop() ->Empty Stack Exception Error
*/
public class StackUnderflow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);//1 2 3 4 5
        st.pop();
        System.out.println(st);//1 2 3 4
        st.pop();
        System.out.println(st);//1 2 3
        st.pop();
        System.out.println(st);//1 2
        st.pop();
        System.out.println(st);//1
        st.pop();
        System.out.println(st);//
        //st.pop();//error If our stack is empty then it is not possible to pop anything
        //st.peek();//Error We can't peek anything from an empty stack
        System.out.println(st);
    }
}
