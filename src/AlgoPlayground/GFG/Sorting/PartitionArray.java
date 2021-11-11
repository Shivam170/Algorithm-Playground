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
}
