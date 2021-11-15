package AlgoPlayground.GFG.Sorting;

public class QuickSort {
    void quickSortLomuto(int[] arr, int l, int h){
        if(l<h){
            int p = lomutoPartition(arr,l,h);
            quickSortLomuto(arr,l,p-1);
            quickSortLomuto(arr,p+1,h);
        }
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

    void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void quickSortHoarse(int[] arr, int l, int h){
        if (l<h){
            int p = hoarsePartition(arr,l,h);
            quickSortHoarse(arr,l,p);
            quickSortHoarse(arr,p+1,h);
        }
    }

    int hoarsePartition(int[] arr,int l,int h){
        int pivot = arr[l];
        int i = l-1,j=h-1;
        while(true){
            do{i++;}while (arr[i]<pivot);
            do{j--;}while (arr[j]>pivot);
            if (i>=j)return j;
            swap(arr,i,j);
        }
    }



}
