package AlgoPlayground.GFG.Array.PrefixSum;

public class EquilibriumPoint {
    boolean isEqPoint(int[] arr, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        int lSum = 0;
        for (int i = 0; i < n; i++) {
            if (lSum == sum-arr[i]){
                return true;
            }
            lSum+=arr[i];
            sum-=arr[i];
        }
        return false;
    }
}
