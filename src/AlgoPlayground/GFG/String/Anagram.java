package AlgoPlayground.GFG.String;

import java.util.Arrays;

public class Anagram {
    // Naive Solution
    boolean naive(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
