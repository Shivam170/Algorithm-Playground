package AlgoPlayground.GFG.Backtracking;

public class RatMaze {
    int N = 3;
    boolean[][] sol = new boolean[N][N];
    boolean[][] maze = new boolean[N][N];

    boolean isSafe(int i, int j) {
        return i < N && j < N && maze[i][j];
    }

    boolean solveMaze() {
        if (solveMazeRec(0, 0)) {
            // print matrix
            return true;
        } else return false;
    }

    boolean solveMazeRec(int i, int j) {
        if (i == N - 1 && j == N - 1) {
            sol[i][j] = true;
            return true;
        }
        if (isSafe(i, j)) {
            sol[i][j] = true;
            if (solveMazeRec(i + 1, j)) return true;
            else if (solveMazeRec(i, j + 1)) return true;
            sol[i][j] = false;
        }
        return false;
    }
}
