package AlgoPlayground.GFG.Array.SlidingWindow;

public class SubarraySum {
    boolean isSum(int[] arr, int n, int sum){
        int curr_sum = arr[0],s=0;
        for (int e = 1; e < n; e++) {
            while (curr_sum>sum && s<e-1){
                curr_sum -=arr[s];
                s++;
            }
            if (curr_sum == sum) return true;
            if (e<n) curr_sum+=arr[e];
        }
        return curr_sum==sum;
    }
}
