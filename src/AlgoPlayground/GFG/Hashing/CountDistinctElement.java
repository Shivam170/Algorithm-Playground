package AlgoPlayground.GFG.Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElement {
    //Naive Approach
    int countDist(int[] arr, int n ){
        int res = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i]==arr[j]){
                    flag =true;
                    break;
                }
            }
            if (flag==false){
                res++;
            }
        }
        return res;
    }

    // Better Approach
    int count(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        return s.size();
    }

    // Lean Code
    int countLean(Integer arr[]){
        HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
        return s.size();
    }
}
