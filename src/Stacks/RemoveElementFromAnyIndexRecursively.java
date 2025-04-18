package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class RemoveElementFromAnyIndexRecursively {
    public static void Remove(Stack<Integer> st, int idx){
        if(st.size()==idx+1){
            st.pop();
            return;
        }
        int temp = st.pop();
        Remove(st,idx);
        st.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of element to be removed: ");
        int idx = sc.nextInt();
        Remove(st, idx);
        System.out.println(st);
    }
}
