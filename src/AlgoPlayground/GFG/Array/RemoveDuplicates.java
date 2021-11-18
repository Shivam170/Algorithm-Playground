package AlgoPlayground.GFG.Array;

public class RemoveDuplicates {
    // Naive Solution
    int removeDuplicatesNaive(int[] arr, int n){
        int[] temp = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < n; i++) {
            if(temp[res-1]!=arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }

    // Efficient Solution
    int removeDuplicates(int[] arr, int n){
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i]!=arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
