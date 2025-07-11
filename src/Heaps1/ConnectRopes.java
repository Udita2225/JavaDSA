package Heaps1;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static int minCost(int[] arr){
        if(arr.length<=1) return 0;
        int sum=0;
       //MinHeap
        PriorityQueue<Integer>  PQ= new PriorityQueue<>();
        for(int ele: arr){
            PQ.add(ele);
        }
        while(PQ.size()>=2){
        int x = PQ.remove();
        int y = PQ.remove();
        int Sum =x+y;
        PQ.add(Sum);
        sum += Sum;
        }
        return sum;
    }
    public static void main(String[] args) {
    int[] arr = {2,7,1,4,8};
        System.out.println(minCost(arr));
    }
}
