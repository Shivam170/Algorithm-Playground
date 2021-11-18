package AlgoPlayground.GFG.Array;

public class SecondLargest {
    int secondLargest(int arr[], int n){
        int largest = LargestElement.getLargest(arr);
        int res = -1;
        for (int i = 0; i < n ; i++) {
            if (arr[i]!=arr[largest]){
                if (res==-1){
                    res=i;
                }else if (arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    int secondLargestEff(int[] arr, int n){
        int res = -1, largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }else if(arr[i]!=arr[largest]){
                if (res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

}
