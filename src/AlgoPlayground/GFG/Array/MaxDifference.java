package AlgoPlayground.GFG.Array;

public class MaxDifference {
    /*
        Maximum value of arr[j] - arr[i] such that j>i
     */
    
    int naive(int[] arr, int n){
        int res = arr[1]-arr[0];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }

    //Efficient Solution
    int maxDiff(int[] arr, int n){
        int res = arr[1] - arr[0], minVal = arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res,arr[i]-minVal);
            minVal = Math.min(minVal,arr[i]);
        }
        return res;
    }
}
