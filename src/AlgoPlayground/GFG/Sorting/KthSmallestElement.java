package AlgoPlayground.GFG.Sorting;

public class KthSmallestElement {
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
    int kthSmallest(int[] arr, int n, int k){
        int l = 0, r = n-1;
        while(l<=r){
            int p = lomutoPartition(arr,l,r);
            if (p==k-1){
                return p;
            }else if(p>k-1){
                r=p-1;
            }else{
                l=p+1;
            }
        }
        return -1;
    }
}
