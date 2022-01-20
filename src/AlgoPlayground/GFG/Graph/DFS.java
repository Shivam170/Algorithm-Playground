package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;

public class DFS {
    void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int u : adj.get(s)) {
            if (!visited[u]) {
                visited[u] = true;
                DFSRec(adj, u, visited);
            }
        }
    }

    void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean[] visited = new boolean[V];
        DFSRec(adj, s, visited);
    }

    void DFSDisconnected(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFSRec(adj, i, visited);
            }
        }
    }
}
