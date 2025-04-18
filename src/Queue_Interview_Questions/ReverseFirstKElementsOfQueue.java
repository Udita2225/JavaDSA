package Queue_Interview_Questions;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        int k = 3;
        while (q.size() != n - k) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}

//Not A Good Code

//        while(q.size()>0){
//            st.push(q.remove());
//        }
//        while(st.size()!=k){
//            qt.push(st.pop());
//        }
//        while(st.size()>0){
//            q.add(st.pop());
//        }
//        while(qt.size()>0){
//            q.add(qt.pop());
//        }
//        System.out.println(q);

