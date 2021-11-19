package AlgoPlayground.GFG.Array.SlidingWindow;

public class MaxSumKConsecutiveElement {
    // Naive Solution
    int naive(int[] arr, int k, int n){
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i+k-1 < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i+j];
            }
            max_sum=Math.max(sum,max_sum);
        }
        return max_sum;
    }

    // Efficient Solution

    int maxSum(int[] arr, int n, int k){
        int curr_sum = 0;
        for (int i = 0; i < k; i++) {
            curr_sum+=arr[i];
        }
        int max_sum = curr_sum;
        for(int i=k;i<n;i++){
            curr_sum+=arr[i]-arr[i-k];
            max_sum = Math.max(max_sum,curr_sum);
        }
        return max_sum;
    }
}
