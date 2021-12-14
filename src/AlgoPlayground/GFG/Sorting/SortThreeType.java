package AlgoPlayground.GFG.Sorting;

public class SortThreeType {

    void sort(int[] arr , int n){
        int[] temp  =new int[n];
        int i = 0;
        for (int j = 0; j < n; j++) {
            if(arr[j]==0){
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if(arr[j]==1){
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if(arr[j]==2){
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void sortEff(int[] arr, int n){
        int low = 0 , mid = 0 , hi = n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                //Caveat
                swap(arr,mid,hi);
                hi--;
            }
        }
    }
}
