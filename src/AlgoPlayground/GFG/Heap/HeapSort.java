package AlgoPlayground.GFG.Heap;

public class HeapSort {
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void maxHeapify(int[] arr, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        if (largest != i) {
            swap(arr, largest, i);
            maxHeapify(arr, n, largest);
        }
    }

    void buildHeap(int[] arr, int n) {
        for (int i = (n - 2) / 2; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    void heapSort(int[] arr, int n) {
        buildHeap(arr, n);
        for (int i = n - 1; i >= 1; i--) {
            swap(arr, 0, i);
            maxHeapify(arr, i, 0);
        }
    }
}
