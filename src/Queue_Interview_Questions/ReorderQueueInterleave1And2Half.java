package Queue_Interview_Questions;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReorderQueueInterleave1And2Half {
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       q.add(6);
       q.add(7);
       q.add(8);
       int n =q.size();
       System.out.println(q); //1 2 3 4 5 6 7 8
       Stack<Integer> st = new Stack<>();
       for(int i=1; i<=n/2; i++){
          st.push(q.remove());
       }// q = 5 6 7 8      st(top-bottom) = 4 3 2 1
        while(st.size()>0){
            q.add(st.pop());
        }// q = 5 6 7 8 4 3 2 1
        for(int i=1; i<=n/2; i++){
            st.push(q.remove());
        }// q = 4 3 2 1     st(top-bottom) = 8 7 6 5
        while(st.size()>0){
         //one by one pehle stack se fir queue se
         q.add(st.pop());
         q.add(q.remove());
        }//q = 8 4 7 3 6 2 5 1
        System.out.println((q));
        //Reverse The Queue
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);//1 5 2 6 3 7 4 8
    }
}
