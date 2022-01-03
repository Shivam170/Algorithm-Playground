package AlgoPlayground.GFG.Hashing;

import java.util.HashSet;

public class UnionArray {
    int naiveUnion(int[] a, int[] b, int m, int n) {
        int[] c = new int[m + n];
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[m + i] = b[i];
        }
        int res = 0;
        for (int i = 0; i < m + n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) res++;
        }
        return res;
    }

    int findUnion(int[] a, int[] b, int m, int n){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            set.add(b[i]);
        }
        return set.size();
    }
}
