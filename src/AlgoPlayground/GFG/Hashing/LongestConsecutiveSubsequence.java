package AlgoPlayground.GFG.Hashing;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        
    }
    //Using Sorting
    int findLongest(int[] arr, int n){
        Arrays.sort(arr);
        int res = 1,curr=1;
        for (int i = 1; i < n; i++) {
            if (arr[i]==arr[i-1]+1)
                curr++;
            else {
                res =Math.max(res,curr);
                curr=1;
            }
        }
        res = Math.max(res,curr);
        return res;
    }
}
