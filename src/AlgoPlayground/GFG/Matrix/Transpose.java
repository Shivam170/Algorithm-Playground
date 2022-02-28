package AlgoPlayground.GFG.Matrix;

public class Transpose {
    void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    void transpose(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(mat, i, j);
            }
        }
    }
}
