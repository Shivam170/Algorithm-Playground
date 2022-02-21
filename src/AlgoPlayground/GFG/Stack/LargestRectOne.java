package AlgoPlayground.GFG.Stack;

public class LargestRectOne {
    int getMax(int[][] mat, int r, int c) {
        int res = LargestRectHist.getMaxArea(mat[0]);
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1)
                    mat[i][j] += mat[i - 1][j];
            }
            res = Math.max(res, LargestRectHist.getMaxArea(mat[i]));
        }
        return res;
    }
}
