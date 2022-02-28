package AlgoPlayground.GFG.Matrix;

public class SearchMatrix {
    void search(int[][] mat, int R, int C, int x) {
        int i = 0, j = C - 1;
        while (i < R && j >= 0) {
            if (mat[i][j] == x) {
                System.out.println("found at " + i + ", " + j);
            } else if (mat[i][j] > x)
                j--;
            else i++;
        }
        System.out.println("Not Found");
    }
}
