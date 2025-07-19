package Heaps2;
//295. Find Median from Data Stream
/*
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value,
and the median is the mean of the two middle values.
For example, for arr = [2,3,4], the median is 3.
For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
Implement the MedianFinder class:
MedianFinder() initializes the MedianFinder object.
void addNum(int num) adds the integer num from the data stream to the data structure.
double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
Example 1:
Input
["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
[[], [1], [2], [], [3], []]
Output
[null, null, null, 1.5, null, 2.0]
Explanation
MedianFinder medianFinder = new MedianFinder();
medianFinder.addNum(1);    // arr = [1]
medianFinder.addNum(2);    // arr = [1, 2]
medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
medianFinder.addNum(3);    // arr[1, 2, 3]
medianFinder.findMedian(); // return 2.0
Constraints:
-105 <= num <= 105
There will be at least one element in the data structure before calling findMedian.
At most 5 * 104 calls will be made to addNum and findMedian.
Follow up:
If all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
If 99% of all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
*/
public class LeetCode295FindMedianFromDataStream {
/*Approach 3
//TC O(nlogn) + O(n) ~ O(nlogn)
//Best Method
//Optimised Code
class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(maxHeap.size()==0) maxHeap.add(num);
        else{
            if(maxHeap.peek()>num) maxHeap.add(num);
            else minHeap.add(num);
        }
        //Balance The Heaps
        if(maxHeap.size()==minHeap.size()+2){
            int top = maxHeap.remove();
            minHeap.add(top);
        }
        if(minHeap.size()==maxHeap.size()+2){
            int top = minHeap.remove();
            maxHeap.add(top);
        }
        // if(Math.abs(maxHeap.size()-minHeap.size())>1){
        //         if(maxHeap.size()>minHeap.size()) minHeap.add(maxHeap.remove());
        //         else maxHeap.add(minHeap.remove());
        // }
    }

    public double findMedian() {
    if(maxHeap.size()==minHeap.size())  return (maxHeap.peek()+minHeap.peek())/2.0;
    if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
    else return minHeap.peek();
    }
}


// Approach 2.
//Brute Force
//Better than previous one
//Continuosly Sorting Using Insertion Sort
//Time Complexity: -  O(n^2) Bad Time Complexity
class MedianFinder {
    List<Integer> arr;
    public MedianFinder() {
    arr = new ArrayList<>();   //This is a better habit
    }
    public void swap(int x, int y){
        int temp = arr.get(x);
        arr.set(x,arr.get(y));
        arr.set(y,temp);
    }
    public void addNum(int num) {
    arr.add(num);
    int n = arr.size();
    int i =n-1;
    while(i>=1 && arr.get(i)<arr.get(i-1)){
        swap(i,i-1);
        i--;
      }
    }
    public double findMedian() {
    int n = arr.size();
    if(n%2!=0) return arr.get(n/2);
    else  return (arr.get(n/2 - 1) + arr.get(n/2))/2.0;
    }
}

//Approach 1
//Brute Force
//Time Complexity: -  O(n^2logn) Bad Time Complexity
class MedianFinder {
    List<Integer> arr;
    public MedianFinder() {
    arr = new ArrayList<>();   //This is a better habit
    }

    public void addNum(int num) {
    arr.add(num);
    }

    public double findMedian() {
    Collections.sort(arr);
    int n = arr.size();
    if(n%2!=0) return arr.get(n/2);
    else  return (arr.get(n/2 - 1) + arr.get(n/2))/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

}
