package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestPathDAG {
    void shortestPath(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        ArrayList<Integer> tSort = TopologicalSorting.topologicalSorting(adj, V);
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                if (dist[v] > dist[u] + v) {
                    dist[v] = dist[u] + v;
                }
            }
        }
    }
}
