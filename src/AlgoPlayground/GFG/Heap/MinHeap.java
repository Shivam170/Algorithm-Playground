package AlgoPlayground.GFG.Heap;

import java.util.PriorityQueue;

public class MinHeap {
    int[] arr;
    int size;
    int capacity;

    MinHeap(int c) {
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void insert(int x) {
        if (size == capacity) return;
        size++;
        arr[size - 1] = x;
        for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i]; i++) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    void minHeapify(int i) {
        int lt = left(i);
        int rt = right(i);
        int smallest = i;
        if (lt < size && arr[lt] < arr[i])
            smallest = lt;
        if (rt < size && arr[rt] < arr[smallest])
            smallest = rt;
        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    int extractMin() {
        if (size == 0) {
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            size--;
            return arr[0];
        }
        swap(arr[0], arr[size - 1]);
        size--;
        minHeapify(0);
        return arr[size];
    }

    void decreaseKey(int i, int x) {
        arr[i] = x;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    void delete(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    void buildHeap() {
        for (int i = (size - 2) / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

}
