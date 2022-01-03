package AlgoPlayground.GFG.Hashing;

import java.util.HashSet;

public class PairSum {
    //Naive Solution
    boolean pairSumNaive(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==sum) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {11,5,6};
        System.out.println(pairSum(arr,10));
    }
    static boolean pairSum(int[] arr, int sum){
         HashSet<Integer> s = new HashSet<>();
         for (int i = 0; i < arr.length ; i++) {
             if(s.contains(sum-arr[i])){
                 return true;
             }else {
                 s.add(arr[i]);
             }
         }
         return false;
     }
}
