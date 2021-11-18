package AlgoPlayground.GFG.Array;

public class MaxConsecutive {
    //Naive Solution
    int naive(int[] arr){
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j]==1) curr++;
                else break;
            }
            res = Math.max(curr,res);
        }
        return res;
    }

    //Efficient Solution
    int maxConsecutive(int[] arr){
        int res = 0, curr = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                curr=0;
            }else{
                curr++;
                res=Math.max(res,curr);
            }
        }
        return res;
    }
}
