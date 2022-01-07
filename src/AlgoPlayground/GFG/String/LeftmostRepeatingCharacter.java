package AlgoPlayground.GFG.String;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {
    int naiveLeftMost(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }

    // Better Approach
    int leftMost(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 1) {
                return i;
            }
        }
        return -1;
    }

    // More Efficient Approach

    int effLeftMost(String str) {
        int[] fIndex = new int[256];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int fi = fIndex[str.charAt(i)];
            if (fi == -1)
                fIndex[str.charAt(i)] = i;
            else res = Math.min(res, fi);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    int effLeftMostII(String str){
        boolean[] visited = new boolean[256];
        Arrays.fill(visited,false);
        int res =-1;
        for (int i = str.length(); i >=0 ; i--) {
            if (visited[str.charAt(i)]){
                res = i;
            }else{
                visited[str.charAt(i)]=true;
            }
        }
        return res;
    }
}
