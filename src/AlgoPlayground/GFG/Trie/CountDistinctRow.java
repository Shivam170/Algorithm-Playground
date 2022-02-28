package AlgoPlayground.GFG.Trie;

class TrieN {
    TrieN[] child = new TrieN[2];
}

public class CountDistinctRow {
    int M, N;
    boolean[][] mat = new boolean[M][N];

    int countDist() {
        TrieN root = new TrieN();
        int res = 0;
        for (int row = 0; row < M; row++) {
            if (insert(root, row))
                res++;
        }
        return res;
    }

    boolean insert(TrieN root, int row) {
        TrieN curr = root;
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            int index = mat[row][i] ? 1 : 0;
            if (curr.child[index] == null) {
                curr.child[index] = new TrieN();
                flag = true;
            }
            curr = curr.child[index];
        }
        return flag;
    }
}
