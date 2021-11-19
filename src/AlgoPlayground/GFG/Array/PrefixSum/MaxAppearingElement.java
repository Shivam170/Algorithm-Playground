package AlgoPlayground.GFG.Array.PrefixSum;

import java.util.ArrayList;

public class MaxAppearingElement {
    int maxOcc(int[] L, int[] R, int n){
        int[] arr = new int[1000];
        int maxM = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < n; i++) {
            arr[L[i]]++;
            arr[R[i]-1]--;
        }
        for (int i = 1; i < 1000; i++) {
            arr[i] += arr[i-1];
            if (maxM < arr[i]){
                maxM=arr[i];
                res=i;
            }
        }
        return res;
    }
}
