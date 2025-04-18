package Stacks_Interview_Questions;

import java.util.Stack;

public class PreviousGreaterElementApproach2 {
    public static void main(String[] args) {
        int[] arr = {10,4,5,90,120,80};
        int n = arr.length;
        int[] res =new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=0; i<n; i++){
            res[i] =-1;
        }
        for(int i=n-2; i>=0; i--){
            while(st.size()!=0 && arr[st.peek()]<arr[i]){
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i =0; i<n; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
