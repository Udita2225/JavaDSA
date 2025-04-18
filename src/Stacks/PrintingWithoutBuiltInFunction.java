package Stacks;
import java.util.Stack;
public class PrintingWithoutBuiltInFunction {
    public static void print(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        while(temp.size()>0){
            System.out.print(temp.peek() + " ");
            st.push(temp.pop());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        print(st);
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        System.out.println(temp);
        while(temp.size()>0){
            System.out.print(temp.peek() +" " );
            st.push(temp.pop());
        }
        System.out.println();
        print(st);
    }
}
/*
Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
//            int x = st.pop();
//            temp.push(x);
        temp.push(st.pop());
        }
        while(temp.size()>0){
int x = temp.pop();
            System.out.print(x + " ");
            st.push(x);
        }

*/