package AlgoPlayground.GFG.String;

public class SearchAnagram {
    boolean searchAnagram(String txt, String pat){
         int[] CT = new int[256];
         int[] CP = new int[256];
        for (int i = 0; i < pat.length(); i++) {
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for (int i = pat.length(); i < txt.length(); i++) {
            if (areSame(CT,CP)) return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }
        return false;
    }
    boolean areSame(int[] CT, int[] CP){
        for (int i = 0; i < CT.length; i++) {
            if (CT[i]!=CP[i]) {
                return false;
            }
        }
        return true;
    }

    boolean searchAnagramNaive(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++) {
            if (isAnagram(pat, txt, i)) {
                return true;
            }
        }
        return false;
    }

    boolean isAnagram(String pat, String txt, int i) {
        int[] count = new int[256];
        for (int j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;
            count[txt.charAt(i + j)]--;
        }
        for (int j = 0; j < count.length; j++) {
            if (count[j] != 0) {
                return false;
            }
        }
        return true;
    }
}
