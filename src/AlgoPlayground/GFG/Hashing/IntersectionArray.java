package AlgoPlayground.GFG.Hashing;

import java.util.HashSet;

public class IntersectionArray {
    //Naive Solution
    int intersection(int[] a, int[] b, int m, int n){
        int res = 0;
        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < i-1; j++) {
                if (a[j]==a[i]){
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            for (int j = 0; j < n; j++) {
                if (a[i]==b[j]){
                    res++;break;
                }
            }
        }
        return res;
    }

    //Efficient Solution
    int intersectionEff(int[] a, int[] b, int m, int n){
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < m ; i++) {
            s.add(a[i]);
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            if (s.contains(b[j])){
                res++;

                //Important Statement
                s.remove(b[j]);
            }
        }
        return res;
    }
}
