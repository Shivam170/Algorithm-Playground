package AlgoPlayground.GFG.Heap;

import java.util.PriorityQueue;

public class SortK {
    void sortK(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty())
            arr[index++] = pq.poll();
    }
}
