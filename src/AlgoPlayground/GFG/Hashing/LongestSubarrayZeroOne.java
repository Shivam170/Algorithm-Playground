package AlgoPlayground.GFG.Hashing;

public class LongestSubarrayZeroOne {

    int longestSubNaive(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int c1 = 0, c0 = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) {
                    c0++;
                } else c1++;

                if (c0 == c1)
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    // There is a trick in the question
    // you have to treat 0 as -1 and call longest subarray sum function for the sum 0
}
