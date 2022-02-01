package AlgoPlayground.misc.Practice;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    static long trappingWater(int arr[], int n) {
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = arr[0];
        for(int i = 1 ; i < n;i++){
            lMax[i] = Math.max(lMax[i-1],arr[i]);
        }
        System.out.println(Arrays.toString(lMax));
        rMax[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            rMax[i] = Math.max(arr[i],rMax[i+1]);
        }
        System.out.println(Arrays.toString(rMax));
        long res = 0;
        for(int i = 1; i < n-1;i++){
            res=res +Math.min(lMax[i],rMax[i])-arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,0,2,0,4};
        System.out.println(trappingWater(arr,arr.length));
    }
}
