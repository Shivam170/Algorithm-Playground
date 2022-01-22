package AlgoPlayground.GFG.Graph;

import java.util.Arrays;

public class PrimsAlgo {
    int primMST(int[][] graph, int V) {
        int[] key = new int[V];
        int res = 0;
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        boolean[] mSet = new boolean[V];
        for (int count = 0; count < V; count++) {
            int u = -1;
            for (int i = 0; i < V; i++) {
                if (!mSet[i] && (u == -1 || key[i] < key[u]))
                    u = i;
            }
            mSet[u] = true;
            res = res + key[u];
            for (int v = 0; v < V; v++) {
                if (!mSet[v] && graph[u][v] != 0 && graph[u][v] < key[v])
                    key[v] = graph[u][v];
            }
        }
        return res;
    }
}
