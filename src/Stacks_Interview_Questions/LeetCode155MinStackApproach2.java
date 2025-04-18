package Stacks_Interview_Questions;
public class LeetCode155MinStackApproach2 {
    public static void main(String[] args) {
/*
class MinStack {
    //For Coding Round This is the best Solution
    //Only one drawback is there and that is Extra Space of Space Complexity ~ O(n)
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
       //Default Constructor
    }
    public void push(int val) {
       if(st.size()==0){
       st.push(val);
       min.push(val);
       }
       else{
        st.push(val);
        if(min.peek()<val) min.push(min.peek());
        else min.push(val);
       }
    }
    public void pop() {
       min.pop();
       st.pop();
    }
    public int top() {
       return st.peek();
    }
    public int getMin() {
       return min.peek();
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
}
