package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;

public class DetectCycleDirected {
    boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] recSt) {
        visited[s] = true;
        recSt[s] = true;

        for (int u : adj.get(s)) {
            if (!visited[u] && DFSRec(adj, u, visited, recSt)) {
                return true;
            } else if (recSt[u]) {
                return true;
            }
        }
        recSt[s] = false;
        return false;
    }

    boolean DFS(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        boolean[] recSt = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (DFSRec(adj, i, visited, recSt)) return true;
            }
        }
        return false;
    }
}
