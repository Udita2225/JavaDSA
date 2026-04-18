package Graphs;

import java.util.ArrayList;
import java.util.List;

class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class DijkstrasAlgorithmUsingQueues {
    static void main() {
        List<List<Pair>> adj =  new ArrayList<>();
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
        int[] dist =  new int[5];
        for(int i=0; )
        DA(dist)
    }
}
