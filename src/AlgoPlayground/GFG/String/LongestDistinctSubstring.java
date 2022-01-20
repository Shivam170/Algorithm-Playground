package AlgoPlayground.GFG.String;

public class LongestDistinctSubstring {
    static boolean areDistinct(String str, int i, int j) {
        boolean[] visited = new boolean[256];
        for (int k = i; k <= j; k++) {
            if (visited[str.charAt(k)])
                return false;
            visited[str.charAt(k)] = true;
        }
        return true;
    }

    static int naiveLongest(String str) {
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (areDistinct(str, i, j))
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    static int betterLongest(String str){
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)]){
                    break;
                }else {
                    res = Math.max(res,j-i+1);
                    visited[str.charAt(j)]=true;
                }
            }
        }
        return res;
    }
}
