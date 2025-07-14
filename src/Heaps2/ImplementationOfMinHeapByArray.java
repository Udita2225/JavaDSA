package Heaps2;

public class ImplementationOfMinHeapByArray {
    public static class MinHeap{
        private int[] arr;
        private int size;
        MinHeap(int capacity){
            arr = new int[capacity];
            size = 0;
        }
        public void add(int num) throws Exception{
        if(size==arr.length) {
           throw new Exception("Heap iS Full!");
        }
        arr[size] = num;
        size++;
        upHeapify(size-1);
        }
        public void upHeapify(int childIdx){
//            Using Recursion
//            if(childIdx==0) return;//Base Case
//            int parentIdx = (childIdx-1)/2;
//            if(arr[parentIdx]>arr[childIdx]){
//                swap(parentIdx, childIdx);
//                upHeapify(parentIdx);
//            }
            while(childIdx!=0){
                int parentIdx = (childIdx-1)/2;
                if(arr[parentIdx]>arr[childIdx]){
                    swap(parentIdx,childIdx);
                    childIdx =parentIdx;
                }
                else break;
            }
        }
        public void swap(int parentIdx, int childIdx){
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[childIdx];
            arr[childIdx] =temp;
        }
        public int remove() throws Exception{
            if(size==0) throw new Exception("Heap is Empty!!");
            int peek =  arr[0];
            swap(0, size-1);
            size--;
            downHeapify(0);
            return peek;
        }
        public void downHeapify(int idx){
            if(idx>=size-1) return;
            int lc = 2*idx+1;
            int rc = 2*idx+2;
            int minIdx =  idx;
            if(lc<size && arr[lc]<arr[minIdx]) minIdx=lc;
            if(rc<size && arr[rc]<arr[minIdx]) minIdx=rc;
            if(idx==minIdx) return;
            swap(idx,minIdx);
            downHeapify(minIdx);
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Heap  is Empty!");
            }
            return arr[0];
        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) throws Exception {
    MinHeap pq = new MinHeap(10);
//    We are making a Heap of capacity 10
//    System.out.println(pq.peek());//throws Exception
//    pq.remove(); throws Exception
    pq.add(1);
    pq.add(6);
    pq.add(2);
    System.out.println(pq.size());//3
    System.out.println(pq.peek());//1
    System.out.println(pq.remove());//1
    pq.add(0);
    System.out.println(pq.size());//3
    System.out.println(pq.peek());//0
    pq.add(-4);
    System.out.println(pq.peek() + " "+ pq.size());//-4 5
    }
}
