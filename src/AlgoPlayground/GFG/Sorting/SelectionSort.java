package AlgoPlayground.GFG.Sorting;

public class SelectionSort {
    //Naive Implementation
    void selectionSort(int[] arr, int n){
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            int min_ind = 0;
            for (int j = 1; j < n; j++) {
                if(arr[j]<arr[min_ind]){
                    min_ind = j;
                }
            }
            temp[i] = arr[min_ind];
            arr[min_ind] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Efficient Solution

    void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void effSelectionSort(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int min_ind = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[min_ind])
                    min_ind = j;
            }
            swap(min_ind,i,arr);
        }
    }

}
