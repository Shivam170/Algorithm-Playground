package AlgoPlayground.GFG.Graph;

import java.util.Arrays;

public class DijkstraAlgo {
    int[] dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        boolean[] fin = new boolean[V];
        for (int count = 0; count < V - 1; count++) {
            int u = -1;
            for (int i = 0; i < V; i++) {
                if (!fin[i] && (u == -1 || dist[i] < dist[u])) {
                    u = i;
                }
            }
            fin[u] = true;
            for (int v = 0; v < V; v++) {
                if (!fin[v] && graph[u][v] != 0) {
                    dist[v] = Math.min(dist[v], dist[u] + graph[u][v]);
                }
            }
        }
        return dist;
    }
}
