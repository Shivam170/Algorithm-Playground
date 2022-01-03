package AlgoPlayground.GFG.Hashing;

import java.util.HashSet;

public class SubarraySum {
    boolean isSumNaive(int[] arr, int n, int sum) {
        for (int i = 0; i < n; i++) {
            int curr_sum = 0;
            for (int j = i; j < n; j++) {
                curr_sum += arr[j];
                if (curr_sum == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        System.out.println(isSumEfficient(arr,arr.length,22));
    }

    static boolean isSumEfficient(int[] arr, int n, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            if (set.contains(s - sum)) return true;
            if (s == sum) return true;
            set.add(s);
        }
        return false;
    }
}
