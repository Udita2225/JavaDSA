package Heaps;
//Kth Smallest
/*
Given an array arr[] and an integer k where k is smaller than the size of the array, your task is to find the
kth smallest element in the given array.
Follow up: Don't solve it using the inbuilt sort function.
Examples :
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7.
Input: arr[] = [2, 3, 1, 20, 15], k = 4
Output: 15
Explanation: 4th smallest element in the given array is 15.
Constraints:
1 <= arr.size <= 106
1<= arr[i] <= 106
1 <= k <= n
*/
public class GFGKthSmallest {

// User function Template for Java
/* Method 1 Using Selection Sort
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
       //Using Selection Sort;
       for(int i=0; i<k; i++){
           int minIndex =i;
           for(int j=i; j<arr.length; j++){
               if(arr[j]<arr[minIndex]) minIndex=j;
           }
           //Swapping
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] =temp;
       }
       return arr[k-1];
    }
}
//M2 Using Built-In Sort
Method 2
    class Solution {
        public static int kthSmallest(int[] arr, int k) {
            // Your code here
            Arrays.sort(arr);
            return arr[k-1];
        }
    }
*/
/*
//Using Heaps

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0; i<arr.length; i++){
        pq.add(arr[i]);
    }
    for(int i=0; i<k-1; i++){
        pq.poll();
    }
    return pq.peek();
    }
}
//Using MaxHeap() This is much better code
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: arr){
            pq.add(ele);
            if(pq.size()>k) pq.poll();
    }
    return pq.peek();
  }
}
*/
}
