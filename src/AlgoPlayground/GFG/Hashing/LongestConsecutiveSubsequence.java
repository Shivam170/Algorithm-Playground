package AlgoPlayground.GFG.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {

    }

    //Using Sorting
    int findLongest(int[] arr, int n) {
        Arrays.sort(arr);
        int res = 1, curr = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1)
                curr++;
            else {
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        res = Math.max(res, curr);
        return res;
    }

    //Using Hashing
    int findLongestHashing(int[] arr) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        int curr;
        for (int j : arr) {
            if (!set.contains(j - 1)) {
                curr = 1;
                while (set.contains(j + curr)) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
