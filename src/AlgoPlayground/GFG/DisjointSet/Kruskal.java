package AlgoPlayground.GFG.DisjointSet;

import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int src, dest, wt;

    @Override
    public int compareTo(Edge edge) {
        return this.wt - edge.wt;
    }

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        wt = w;
    }
}

public class Kruskal {
    int kruskal(Edge[] arr, int V) {
        DisjointSet ds = new DisjointSet(V);
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0, s = 0; s < V - 1; i++) {
            Edge e = arr[i];
            int x = ds.find(e.src);
            int y = ds.find(e.dest);
            if (x != y) {
                res += e.wt;
                ds.union(x, y);
                s++;
            }
        }
        return res;
    }
}
