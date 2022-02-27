package AlgoPlayground.GFG.Backtracking;

public class Sudoku {
    int N;
    int[][] grid = new int[N][N];

    boolean isSafe(int i, int j, int n) {
        for (int k = 0; k < N; k++) {
            if (grid[k][j] == n || grid[i][k] == n)
                return false;
        }
        int s = (int) Math.sqrt(N);
        int rs = i - i % s;
        int cs = j - j % s;
        for (int k = 0; k < s; k++) {
            for (int l = 0; l < s; l++) {
                if (grid[k + rs][j + cs] == n)
                    return false;
            }
        }
        return true;
    }

    boolean solve() {
        int i=0, j=0;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (grid[i][j] == 0)
                    break;
            }
        }
        if (i == N && j == N)
            return true;
        for (int n = 0; n < N; n++) {
            if (isSafe(i, j, n)) {
                grid[i][j] = n;
                if (solve()) return true;
                grid[i][j] = 0;
            }
        }
        return false;
    }
}
