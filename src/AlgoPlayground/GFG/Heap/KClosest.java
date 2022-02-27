package AlgoPlayground.GFG.Heap;

public class KClosest {
    void naive(int[] arr, int k, int x, int n) {
        boolean[] visited = new boolean[n];
        for (int i = 0; i < k; i++) {
            int min_diff = Integer.MAX_VALUE;
            int min_diff_idx = 0;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && Math.abs(arr[j] - x) <= min_diff) {
                    min_diff = Math.abs(arr[j] - x);
                    min_diff_idx = j;
                }
            }
            System.out.print(arr[min_diff_idx] + " ");
            visited[min_diff_idx] = true;
        }
    }
}
