package AlgoPlayground.GFG.Sorting;

public class PartitionArray {
    void partition(int arr[], int l,int h,int p){
        int[] temp = new int[h-l+1];
        int index = 0;
        for (int i = l; i <= h; i++) {
            if (arr[i] <= arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = l; i <= h; i++) {
            if(arr[i]>arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = l; i <= h ; i++) {
            arr[i] = temp[i-l];
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
