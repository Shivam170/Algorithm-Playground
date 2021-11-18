package AlgoPlayground.GFG.Array;

public class ReverseArray {
    void reverse(int[] arr, int n){
        int low = 0, high = n-1;
        while(low<high){
            int temp =arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

}
