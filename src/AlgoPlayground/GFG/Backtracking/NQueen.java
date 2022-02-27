package AlgoPlayground.GFG.Backtracking;

public class NQueen {
    int N;
    boolean[][] board = new boolean[N][N];

    boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i])
                return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j])
                return false;
        }
        for (int i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j])
                return false;
        }
        return true;
    }

    boolean solveRec(int col) {
        if (col == N) return true;
        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = true;
                if (solveRec(col + 1))
                    return true;
                board[i][col] = false;
            }
        }
        return false;
    }

    boolean solve() {
        if (!solveRec(0))
            return false;
        else {
            // print
            return true;
        }
    }
}
