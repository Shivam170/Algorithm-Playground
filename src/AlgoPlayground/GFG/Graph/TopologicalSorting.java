package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSorting {
    static void fillInDegree(ArrayList<ArrayList<Integer>> adj, int[] inDegree) {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                inDegree[adj.get(i).get(j)]++;
            }
        }
    }

    // Kahn's Algorithm
    // Time Complexity -> O(V+E)
    static ArrayList<Integer> topologicalSorting(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] inDegree = new int[V];
        fillInDegree(adj, inDegree);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            list.add(u);
            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    q.add(v);
                }
            }
        }
        return list;
    }
}
