package Stacks_Interview_Questions;

import java.util.Stack;

public class NextGreaterElementApproach2 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            res[i] = -1;
        }
        st.push(0);
        for(int i=1; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
               res[st.peek()] = arr[i];
               st.pop();
            }
            st.push(i);
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(res[i]+ " ");
        }

    }
}
