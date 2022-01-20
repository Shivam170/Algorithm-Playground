package AlgoPlayground.misc.Practice;

import java.util.HashMap;

public class Practice {
    public static int getSum(int[] arr,int l, int r) {
        int sum = 0;
        for (int i = l; i <=r ; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static int maximumUniqueSubarray(int[] nums) {

        HashMap<Integer, Integer> set = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (set.containsKey(nums[r]) && set.get(nums[r])>=l) {
                ans = Math.max(ans, getSum(nums,l,r-1));
                l = set.get(nums[r]) + 1;
                set.put(nums[r],r);
            } else {
                set.put(nums[r], r);
            }
        }
        ans = Math.max(ans, getSum(nums,l,nums.length-1));
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(arr));
    }
}
