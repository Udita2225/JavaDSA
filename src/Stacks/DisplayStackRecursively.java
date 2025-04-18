package Stacks;
import java.util.Stack;
public class DisplayStackRecursively {
    public static void displayRecursively(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayRecursively(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayRecursively(st);
    }
}
