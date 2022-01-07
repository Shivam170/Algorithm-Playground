package AlgoPlayground.GFG.Hashing;

public class LongestCommonSpan {
    public static void main(String[] args) {

    }
    int maxCommon(int[] arr1, int[] arr2, int n){
        int res = 0;
        for (int i = 0; i < n; i++) {
            int sum1=0,sum2=0;
            for (int j = i; j < n; j++) {
                sum1+=arr1[j];
                sum2+=arr2[j];
                if (sum1==sum2) {
                    res = Math.max(sum1,j-i+1);
                }
            }
        }
        return res;
    }

    // For efficient solution subtract array1 from array2 and
    // use longest subarray with sum zero function to get the result

}
