package BinarySearch.BinarySearchOnAnswer;

public class GFGAllocateMinimumPages {
/*Allocate Minimum Pages

Given an array arr[] of integers, where each element arr[i] represents the number of pages in the i-th book. You also
have an integer k representing the number of students. The task is to allocate books to each student such that:
Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible
allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.
Note: If it is not possible to allocate books to all students, return -1.
Examples:
Input: arr[] = [12, 34, 67, 90], k = 2
Output: 113
Explanation: Allocation can be done in following ways:
=> [12] and [34, 67, 90] Maximum Pages = 191
=> [12, 34] and [67, 90] Maximum Pages = 157
=> [12, 34, 67] and [90] Maximum Pages = 113.
The third combination has the minimum pages assigned to a student which is 113.
Input: arr[] = [15, 17, 20], k = 5
Output: -1
Explanation: Since there are more students than total books, it's impossible to allocate a book to each student.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i], k ≤ 103

Expected Complexities
Time Complexity: O( n × log(sum(arr)))
Auxiliary Space: O(1)
Company Tags
Infosys Amazon Microsoft Google Codenation Uber
Topic Tags
Searching Divide and Conquer Algorithms

*/

    /*
    class Solution {
    public boolean isPossible(int maxPages,int[] arr, int k){
        int students = 1;
        int curSum = 0;
        for(int i=0; i<arr.length; i++){
            if(curSum + arr[i] > maxPages){
                students++;
                curSum = arr[i];
                if(students > k) return false;
            }
            else curSum += arr[i];
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length < k ) return -1;
        int maxPages = 0;
        int sumOfPages = 0;
        for(int i=0; i<arr.length; i++){
            maxPages = Math.max(maxPages,arr[i]);
            sumOfPages += arr[i];
        }
        int ans = 0;
        int low = maxPages;
        int high = sumOfPages;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(mid,arr,k)){
            high = mid-1;
            ans = mid;
            }
            else low = mid+1;
        }
        return ans;
    }
}
    */
}
