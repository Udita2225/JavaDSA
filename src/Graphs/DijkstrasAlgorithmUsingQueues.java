package Graphs;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair{
    int node;
    int cost;
    public Pair(int node, int cost){
        this.node = node;
        this.cost = cost;
    }
}
public class DijkstrasAlgorithmUsingQueues {
    public static int[] bfs(List<List<Pair>> adj, int Node){
        Queue<Pair>  q =  new LinkedList<>();
        int n = adj.size();
        int[] dist =  new int[n];
        for(int i=0; i<n; i++){
            if(i==Node) continue;
            dist[i] = Integer.MAX_VALUE;
        }
        q.add(new Pair(Node,0));
        while(q.size()>0){
            Pair p = q.remove();
            int node = p.node;
            int cost = p.cost;
            if(cost<=dist[node]){
                List<Pair> list =  adj.get(node);
                for(Pair p1: list){
                    int N = p1.node;
                    int c = p1.cost;
                    int newcost = cost + c;
                    if(newcost<dist[N]) {
                        q.add(new Pair(N, newcost));
                        dist[N] = newcost;
                    }
                }

            }
        }
        return dist;
    }

    static void main() {
        List<List<Pair>> adj =  new ArrayList<>();
        for(int i=0; i<5; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Pair(1,30));
        adj.get(0).add(new Pair(4,5));
        adj.get(0).add(new Pair(3,20));
        adj.get(1).add(new Pair(0,30));
        adj.get(1).add(new Pair(2,4));
        adj.get(2).add(new Pair(1,4));
        adj.get(2).add(new Pair(4,8));
        adj.get(2).add(new Pair(3,7));
        adj.get(3).add(new Pair(0,20));
        adj.get(3).add(new Pair(2,7));
        adj.get(3).add(new Pair(4,6));
        adj.get(4).add(new Pair(0,5));
        adj.get(4).add(new Pair(2,8));
        adj.get(4).add(new Pair(3,6));

        // Get the shortest distance from Node 0

        System.out.println("Shortest distance to all the Nodes from 0");
        int[] ans = bfs(adj,0);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

    }
}
