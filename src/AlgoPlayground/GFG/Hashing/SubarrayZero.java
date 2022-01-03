package AlgoPlayground.GFG.Hashing;

import java.util.HashSet;

public class SubarrayZero {
    boolean isZeroSubarray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int curr_sum = 0;
            for (int j = i; j < n; j++) {
                curr_sum+=arr[j];
                if (curr_sum==0)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4,-3,2,2};
        System.out.println(isZeroSubarrayEff(arr));
    }

    static boolean isZeroSubarrayEff(int[] arr){

        HashSet<Integer> s = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(s.contains(sum)) return true;
            //Important Statement
            if (sum==0) return true;
            s.add(sum);
        }
        return false;
    }

}
