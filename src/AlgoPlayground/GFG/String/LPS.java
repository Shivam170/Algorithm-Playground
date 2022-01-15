package AlgoPlayground.GFG.String;

public class LPS {
    int longPropPreSuff(String str, int n) {
        for (int len = n - 1; len > 0; len--) {
            boolean flag = true;
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) != str.charAt(n - len + i)) {
                    flag = false;
                }
            }
            if (flag) {
                return len;
            }
        }
        return 0;
    }
 
    
    

    void fillLPS(String str, int[] lps) {
        for (int i = 0; i < str.length(); i++) {
            lps[i] = longPropPreSuff(str, i + 1);
        }
    }

    static void fillLPSEff(String str, int[] lps){
        int n = str.length(), len=0;
        lps[0] = 0;
        int i = 1;
        while (i < n){
            if (str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else {
                if (len==0) {
                    lps[i] = 0;
                    i++;
                }else {
                    len=lps[len-1];
                }
            }
        }
    }
}
