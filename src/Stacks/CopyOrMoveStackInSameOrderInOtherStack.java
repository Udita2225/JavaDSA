package Stacks;
import java.util.Stack;
public class CopyOrMoveStackInSameOrderInOtherStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
//            int x = st.peek();
//            st.push(x);
//            st.pop();
        }
        Stack<Integer> rt = new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
//            int x = gt.peek();
//            rt.push(x);
//            gt.pop();
        }
        System.out.println(rt);
        System.out.println(gt);
        System.out.println(st);
        //Now putting the reverse order of elements in st
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}