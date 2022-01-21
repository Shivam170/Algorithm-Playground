package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSorting {
    // Kahn's Algorithm

    void topologicalSorting(ArrayList<ArrayList<Integer>> adj, int V) {
        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            inDegree[i] = adj.get(i).size();
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    q.add(v);
                }
            }
        }
    }
}
