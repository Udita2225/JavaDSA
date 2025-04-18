package Stacks;
import java.util.ArrayList;//header File
import java.util.Stack;//Stack Header File
import java.util.*;
public class BasicsOfStacks {
    public static void main(String[] args) {
        //ArrayList<Integer> arr = new ArrayList<>(); Built-In ArrayList Declaration
        Stack<Integer> st = new Stack<>(); //Built-In Stack
        System.out.println(st.isEmpty()); //Returns Boolean Value
        System.out.println("Size is : "+ st.size());
        System.out.println(st);
        st.push(1);
        System.out.println("Size is : " + st.size());
        System.out.println(st);
        st.push(23);
        System.out.println("Size is : " + st.size());
        System.out.println(st);
        st.push(90);
        System.out.println("Size is : " + st.size());
        System.out.println(st);
        st.push(5);
        st.push(88);
        st.push(45);
        System.out.println(st.peek());//45
        //Printing all the elements of the Stack
        //1 23 90 5 88 45 In the exact order they were pushed in the stack
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is:  "+ st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
