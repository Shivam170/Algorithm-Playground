package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleTopological {
    void fillInDegree(ArrayList<ArrayList<Integer>> adj, int[] inDegree){
        for (ArrayList<Integer> integers : adj) {
            for (Integer integer : integers) {
                inDegree[integer]++;
            }
        }
    }

    // Kahn's Algorithm
    // Time Complexity -> O(V+E)
    boolean topologicalSorting(ArrayList<ArrayList<Integer>> adj, int V) {
        int[] inDegree = new int[V];
        fillInDegree(adj,inDegree);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }
        int count = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    q.add(v);
                }
            }
            count++;
        }
        return count!=V;
    }
}
