package AlgoPlayground.GFG.String;

import java.util.Arrays;

public class LeftmostNonRepeating {
    int naive(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return i;
            }
        }
        return -1;
    }

    // Better Solution
    int nonRepI(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.length()] == 1)
                return i;
        }
        return -1;
    }

    // Efficient solution (One Traversal)
    int nonRepII(String str) {
        int[] fI = new int[256];
        Arrays.fill(fI, -1);
        for (int i = 0; i < str.length(); i++) {
            if (fI[str.charAt(i)] == -1) {
                fI[str.charAt(i)] = i;
            } else {
                fI[str.charAt(i)] = -2;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (fI[i] >= 0) {
                res = Math.min(res, fI[i]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }


}
