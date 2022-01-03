package AlgoPlayground.GFG.Hashing;

import java.util.HashMap;

public class LongestSubarraySum {
    int maxLen(int[] arr, int n, int sum){
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr_sum=0;
            for (int j = i; j < n; j++) {
                curr_sum+=arr[j];
                if (curr_sum==sum)
                    res = Math.max(res,j-i+1);
            }
        }
        return res;
    }

    int maxLenEff(int[] arr, int n, int sum){
        HashMap<Integer,Integer> m = new HashMap<>();
        int pre_sum = 0, res = 0;
        for (int i = 0; i < n; i++) {
            pre_sum = pre_sum + arr[i];
            if (pre_sum==sum) res = i+1;
            if (!m.containsKey(pre_sum)){
                m.put(pre_sum,i);
            }
            if (m.containsKey(pre_sum-sum)){
                res=Math.max(res,i-m.get(pre_sum-sum));
            }
        }
        return res;
    }
}
