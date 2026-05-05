package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Pair1 implements Comparable<Pair1>{
    int node;
    int fare;
    public Pair1(int node, int fare){
        this.node = node;
        this.fare = fare;
    }
    public int compareTo(Pair1 p){
        return this.fare-p.fare;
    }
}
public class DijkstrasAlgorithmUsingPriorityQueues {
    public static int[] bfs(List<List<Pair1>> adj, int n){
        int size =  adj.size();
        int[] minCost =  new int[size];
        // Create Priority Queue
        PriorityQueue<Pair1> pq = new PriorityQueue<>();
        pq.add(new Pair1(n,0));

        // Fill infinity(Integer.MAX_VALUE) to the minCost Array
        for(int i=0; i<size; i++){
            if(i==n) continue;
            minCost[i] =  Integer.MAX_VALUE;
        }

        // Main Code
        while(pq.size()>0){
            Pair1  top =  pq.remove();
            int Node = top.node;
            int Fare = top.fare;

            if(Fare<=minCost[Node]){
                for(Pair1 p: adj.get(Node)){
                    int node = p.node;
                    int fare = p.fare;
                    int totalfare = Fare + fare;
                    if(totalfare<minCost[node]){
                        minCost[node] = totalfare;
                        pq.add(new Pair1(node,totalfare));
                    }
                }
            }
        }
        return minCost;
    }

    static void main() {
    List<List<Pair1>> adj =  new ArrayList<>();
    for(int i=0; i<5; i++){
        adj.add(new ArrayList<>());
    }
        adj.get(0).add(new Pair1(1,30));
        adj.get(0).add(new Pair1(3,20));
        adj.get(0).add(new Pair1(4,5));

        adj.get(1).add(new Pair1(0,30));
        adj.get(1).add(new Pair1(2,4));

        adj.get(2).add(new Pair1(1,4));
        adj.get(2).add(new Pair1(3,7));
        adj.get(2).add(new Pair1(4,8));

        adj.get(3).add(new Pair1(0,20));
        adj.get(3).add(new Pair1(2,7));
        adj.get(3).add(new Pair1(4,6));

        adj.get(4).add(new Pair1(0,5));
        adj.get(4).add(new Pair1(2,8));
        adj.get(4).add(new Pair1(3,6));

        // Minimum fare to all the nodes from Node 0;
        int[] ans = bfs(adj,0);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
