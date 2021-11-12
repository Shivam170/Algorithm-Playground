package AlgoPlayground.GFG.Sorting;

public class QuickSort {
    void quickSort(int[] arr, int l, int h){
        if(l<h){
            int p = lomutoPartition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }
    void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int lomutoPartition(int[] arr,int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for (int j = 0; j <= h-1; j++) {
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }
}
