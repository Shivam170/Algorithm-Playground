package AlgoPlayground.GFG.Array;

public class MaximumSumSubarray {
    // Naive

    int naive(int[] arr, int n){
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr = curr + arr[i];
                res = Math.max(res,curr);
            }
        }
        return res;
    }

    // Efficient Solution

    int maxSum(int[] arr, int n){
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
}
