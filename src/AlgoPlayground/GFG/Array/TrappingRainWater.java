package AlgoPlayground.GFG.Array;

public class TrappingRainWater {
    // Naive Solution
    int naive(int[] arr, int n){
        int res = 0;
        for (int i = 1; i < n-1; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax=Math.max(lmax,arr[j]);
            }
            int rmax = arr[i];
            for (int j = i+1; j < n; j++) {
                rmax=Math.max(rmax,arr[j]);
            }
            res=res+(Math.min(lmax,rmax)-arr[i]);
        }
        return res;
    }

    //Efficient Solution
    int trappingRainWater(int[] arr, int n){
        int res = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i],lMax[i-1]);
        }
        rMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rMax[i] = Math.max(arr[i],rMax[i+1]);
        }
        for (int i = 1; i < n-1; i++) {
            res = res + Math.min(lMax[i],rMax[i]) - arr[i];
        }
        return res;
    }
}
