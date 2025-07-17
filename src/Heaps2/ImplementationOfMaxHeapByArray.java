package Heaps2;

public class ImplementationOfMaxHeapByArray {
    public static class MaxHeap{
        private int[] arr;
        private int size;
        MaxHeap(int capacity){
            arr = new int[capacity];
            size=0;
        }
        public void add(int num) throws Exception{
            if(size==arr.length){
                throw new Exception("MaxHeap is full");
            }
            arr[size++] = num;
            upHeapify(size-1);
        }
        public void upHeapify(int childIdx){
        if(childIdx<=0) return;
        int parentIdx = (childIdx-1)/2;
        if(arr[parentIdx]<arr[childIdx]) swap(parentIdx,childIdx);
        upHeapify(parentIdx);
        }
        public void swap(int parentIdx, int childIdx){
            int temp =  arr[parentIdx];
            arr[parentIdx] = arr[childIdx];
            arr[childIdx] =temp;
        }
        public int remove() throws Exception{
            if(size==0) throw new Exception("MaxHeap is Empty!!");
            int temp = arr[0];
            swap(0,size-1);
            size--;
            downHeapify(0);
            return temp;
        }
        public void downHeapify(int parentIdx){
            if(parentIdx>=size-1) return;
            int maxIdx = parentIdx;
            int lc = 2*parentIdx + 1;
            int rc = 2*parentIdx + 2;
            if(lc<size && arr[lc]>arr[maxIdx]) maxIdx=lc;
            if(rc<size && arr[rc]>arr[maxIdx]) maxIdx=rc;
            if(maxIdx==parentIdx) return;
            swap(parentIdx,maxIdx);
            downHeapify(maxIdx);
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("MaxHeap is Empty!!");
            }
            return arr[0];
        }
        public int size(){
            return size;
        }
        public void printHeap(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        MaxHeap pq = new MaxHeap(10);
//        System.out.println(pq.peek()); Throws Error MaxHeap is Empty!!
//        System.out.println(pq.remove()); Throws Error MaxHeap is Empty!!
        pq.add(10);
        System.out.println(pq.size());//1
        pq.add(7);
        pq.add(5);
        System.out.println(pq.peek());//10
        pq.add(90);
        System.out.println(pq.peek());//90
        System.out.println(pq.remove());//90
        System.out.println(pq.peek());//10
        System.out.println(pq.size());//3
        pq.printHeap();//10 7 5
    }
}
