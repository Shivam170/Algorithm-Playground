package AlgoPlayground.GFG.String;

public class Subsequence {
    boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == b.length();
    }

    // Recursive Solution

    boolean recIsSubsequence(String s1, String s2, int n, int m) {
        if (m == 0) return true;
        if (n == 0) return false;
        if (s1.charAt(n - 1) == s2.charAt(m - 1))
            return recIsSubsequence(s1, s2, n - 1, m - 1);
        else return recIsSubsequence(s1, s2, n - 1, m);
    }
}
