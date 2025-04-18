package Stacks;
import java.util.Stack;
public class DisplayReverseStackRecursively {
    public static void displayReverseRecursively(Stack<Integer> st){
        //Stack is pass by Reference
        //st.push(6);
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayReverseRecursively(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displayReverseRecursively(st);
        //System.out.println(st); [1, 2, 3, 4, 5]
    }
}
