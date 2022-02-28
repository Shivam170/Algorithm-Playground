package AlgoPlayground.GFG.DisjointSet;

public class DisjointSet {
    int[] parent;
    int[] rank;

    DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        parent[x] = find(parent[x]);
        return parent[x];
    }

    // Simple Representation
//    int find(int x) {
//        if (parent[x] == x)
//            return x;
//        else return find(parent[x]);
//    }

    // Simple Representation
//    void union(int x, int y) {
//        int x_rep = find(x);
//        int y_rep = find(y);
//        if (x_rep == y_rep) return;
//        parent[y_rep] = x_rep;
//    }

    // Union By Rank
    void union(int x, int y) {
        int x_rep = find(x), y_rep = find(y);
        if (x_rep == y_rep) return;
        if (rank[x_rep] < rank[y_rep])
            parent[x_rep] = y_rep;
        else if (rank[y_rep] < rank[x_rep])
            parent[y_rep] = x_rep;
        else {
            parent[y_rep] = x_rep;
            rank[x_rep]++;
        }
    }
}
