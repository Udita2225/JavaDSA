package Stacks_Interview_Questions;
//Space Complexity O(1)
//Time Complexity Of GetMin O(1)
public class LeetCode155MinStackApproach3 {
/*
class MinStack {
    Stack<Long> st = new Stack<>();
    long min =-1;
    public MinStack() {
       //Constructor
    }
    public void push(int val) {
       long x = (long)val;
       if(st.size()==0){
        st.push(x);
        min =x;
       }
       else if(x<min){
        st.push(2*x-min);
        min=x;
       }
       else{
        st.push(x);
       }
    }
    public void pop() {
        if(st.size()==0) return;
        else if(st.peek()<min){
            long old = 2*min-st.peek();
            min = old;
            st.pop();
        }
        else{
            st.pop();
        }
    }
    public int top() {
        //Don't typecast the stack element directly rather typecast a variable
        long q = st.peek();
        if(st.size()==0) return -1;
        if(q<min) return (int)min;
        else return (int)q;
    }
    public int getMin() {
        if(st.size()==0) return -1;
        return (int)min;
     }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();

*/
}
