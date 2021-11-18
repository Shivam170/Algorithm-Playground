package AlgoPlayground.GFG.Array;

public class MaxCircularSum {
    // Naive Solution

    int naive(int[] arr, int n){
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for (int j = 1; j < n; j++) {
                int index = (i+j)%n;
                curr_sum += arr[index];
                curr_max = Math.max(res,curr_max);
            }
            res = Math.max(res,curr_max);
        }
        return res;
    }

    //Efficient Solution

    int maxCircularSum(int[] arr, int n){
        int max_normal = MaximumSumSubarray.maxSum(arr,arr.length);
        if (max_normal<0)
            return max_normal;
        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular=arr_sum+MaximumSumSubarray.maxSum(arr,n);
        return Math.max(max_normal,max_circular);
    }
}
