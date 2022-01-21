package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;

public class DetectCycleUndirected {
    boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        for (int u : adj.get(s)) {
            if (!visited[u]) {
                if (DFSRec(adj, u, visited, s)) {
                    return true;
                } else if (u != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean DFS(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visted = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visted[i]) {
                if (DFSRec(adj, i, visted, -1)) return true;
            }
        }
        return false;
    }
}
