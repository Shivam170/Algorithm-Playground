package AlgoPlayground.GFG.Heap;

import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int diff;
    int idx;

    Pair(int d, int i) {
        diff = d;
        idx = i;
    }

    @Override
    public int compareTo(Pair pair) {
        return pair.diff - this.diff;
    }
}

public class KClosest {
    void kClosest(int[] arr, int k, int x, int n) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i] - x, i));
        }
        for (int i = k; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            if (pq.peek().diff > diff) {
                pq.poll();
                pq.add(new Pair(diff, i));
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[pq.poll().idx] + " ");
        }
    }

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
