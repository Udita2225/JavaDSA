package Stacks;

import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
public class RemoveElementIteratively {
    public static void Remove(Stack<Integer> st, int idx){
        Stack<Integer> temp =new Stack<>();
        while (st.size() > idx + 1) {
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()!=0){
        st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Scanner sc =new Scanner(System.in);
        int idx =sc.nextInt();
        System.out.println(st);
        Remove(st,idx);
        System.out.println(st);
    }
}
