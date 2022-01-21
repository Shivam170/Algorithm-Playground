package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweighted {
    void shortestDistance(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean[] visited = new boolean[V + 1];
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    dist[v] = dist[u] + 1;
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
}
